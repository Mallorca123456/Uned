package es.uned.lsi.eped.pract2016;


import es.uned.lsi.eped.DataStructures.*;

public class DoctorS implements DoctorIF {

	private final int id;
	private CollectionIF<DoctorIF> students;
	private DoctorIF supervisor;

	public DoctorS(int id) {
		this.students = new Set<>();
		this.id = id;
	}

	DoctorS(DoctorIF supervisor, int id) {
		this.supervisor = supervisor;
		this.students = new Set<>();
		this.id = id;
	}

	DoctorS(CollectionIF<DoctorIF> students, int id) {
		this.students = students;
		this.id = id;
		setSupervisors();
	}

	public int getId() {
		return id;
	}

	public DoctorIF getSupervisor() {
		return supervisor;
	}

	void setSupervisor(DoctorIF supervisor) {
		this.supervisor = supervisor;
	}

	void addStudent(DoctorIF student) {
		students = new Set<>(student).union((SetIF<DoctorIF>) students);
	}

	@Override
	public CollectionIF<DoctorIF> getAncestors(int generations) {
		if (generations <= 0) {
			throw new IllegalArgumentException("Generations number should be > 0");
		}
		if (supervisor == null) {
			return new Set<>();
		} else {
			boolean isLastGeneration = generations - 1 == 0;
			if (!isLastGeneration) {
				return getCurrentSupervisor().union(getParentAncestorOf(generations));
			} else {
				return getCurrentSupervisor();
			}
		}
	}

	@Override
	public CollectionIF<DoctorIF> getStudents() {
		return students;
	}

	@Override
	public CollectionIF<DoctorIF> getDescendants(int generations) {
		if (generations <= 0) {
			throw new IllegalArgumentException("Generations number should be > 0");
		} else {
			SetIF<DoctorIF> descendants = new Set<>();
			if (generations > 1) {
				final IteratorIF studentsIterator = students.iterator();
				while (studentsIterator.hasNext()) {
					final DoctorIF parent = (DoctorIF) studentsIterator.getNext();
					SetIF<DoctorIF> parentDescendantsSet = (SetIF<DoctorIF>) parent.getDescendants(generations - 1);
					SetIF<DoctorIF> parentWithChildsSet = new Set<>(parent).union(parentDescendantsSet);
					descendants = descendants.union(parentWithChildsSet);
				}
				return descendants;
			} else {
				return getStudents();
			}
		}
	}

	@Override
	public CollectionIF<DoctorIF> getSiblings() {
		SetIF<DoctorIF> siblings = new Set<>();
		if (supervisor != null) {
			siblings = siblings.union((SetIF<DoctorIF>) supervisor.getStudents());
			siblings = siblings.difference(new Set<DoctorIF>(this));
		}
		return siblings;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		DoctorS doctorS = (DoctorS) o;

		return id == doctorS.id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	private void setSupervisors() {
		IteratorIF<DoctorIF> it = this.students.iterator();
		while (it.hasNext()) {
			DoctorS studient = (DoctorS) it.getNext();
			studient.setSupervisor(this);
		}
	}

	private SetIF<DoctorIF> getParentAncestorOf(int generations) {
		return (SetIF<DoctorIF>) supervisor.getAncestors(generations - 1);
	}

	private Set<DoctorIF> getCurrentSupervisor() {
		return new Set<>(supervisor);
	}

}