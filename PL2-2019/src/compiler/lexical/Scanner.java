/* The following code was generated by JFlex 1.4.1 on 4/24/19 10:30 PM */

package compiler.lexical;

import compiler.syntax.sym;
import compiler.lexical.Token;
import es.uned.lsi.compiler.lexical.ScannerIF;
import es.uned.lsi.compiler.lexical.LexicalError;
import es.uned.lsi.compiler.lexical.LexicalErrorManager;

// incluir aqui, si es necesario otras importaciones


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.1
 * on 4/24/19 10:30 PM from the specification file
 * <tt>/Users/rfernandez/Uned/Uned/PL2-2019/doc/specs/scanner.flex</tt>
 */
public class Scanner implements java_cup.runtime.Scanner, ScannerIF {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYSTRING = 2;
  public static final int YYCOMMENT = 1;
  public static final int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0,  4,  3,  0,  4,  2,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     4,  0, 39,  0,  0,  0,  0,  0,  6,  8,  7,  0, 15,  9, 17,  0, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 12, 16,  0, 10, 11,  0, 
     0, 18, 28, 33, 24, 27, 22, 29, 37, 30,  5,  5, 26, 23, 31, 21, 
    32,  5, 19, 35, 34, 25, 36, 38,  5, 20,  5, 13,  0, 14,  0,  0, 
     0, 18, 28, 33, 24, 27, 22, 29, 37, 30,  5,  5, 26, 23, 31, 21, 
    32,  5, 19, 35, 34, 25, 36, 38,  5, 20,  5,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\2\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\1\17\4\1\20\3\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\2\4\1\31\1\32\3\4\1\33"+
    "\4\4\1\34\6\4\1\35\3\4\1\36\1\37\3\4"+
    "\1\40\2\4\1\41\3\4\1\42\5\4\1\43\5\4"+
    "\1\44\5\4\1\45\1\46\1\47\1\4\1\50\1\4"+
    "\1\51\2\4\1\52\2\4\1\53\1\4\1\54\1\55"+
    "\6\4\1\56\1\57\1\4\1\60\3\4\1\61\1\4"+
    "\1\62\2\4\1\63";

  private static int [] zzUnpackAction() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\170\0\360"+
    "\0\u0118\0\u0140\0\170\0\170\0\170\0\170\0\u0168\0\170"+
    "\0\170\0\170\0\170\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0230"+
    "\0\u0258\0\u0280\0\u02a8\0\u02d0\0\u02f8\0\u0320\0\u0348\0\u0370"+
    "\0\u0398\0\u03c0\0\u03e8\0\170\0\170\0\u0410\0\u0438\0\u0460"+
    "\0\170\0\u0488\0\170\0\170\0\170\0\170\0\u04b0\0\u04d8"+
    "\0\360\0\360\0\u0500\0\u0528\0\u0550\0\360\0\u0578\0\u05a0"+
    "\0\u05c8\0\u05f0\0\360\0\u0618\0\u0640\0\u0668\0\u0690\0\u06b8"+
    "\0\u06e0\0\360\0\u0708\0\u0730\0\u0758\0\170\0\170\0\u0780"+
    "\0\u07a8\0\u07d0\0\360\0\u07f8\0\u0820\0\360\0\u0848\0\u0870"+
    "\0\u0898\0\360\0\u08c0\0\u08e8\0\u0910\0\u0938\0\u0960\0\360"+
    "\0\u0988\0\u09b0\0\u09d8\0\u0a00\0\u0a28\0\360\0\u0a50\0\u0a78"+
    "\0\u0aa0\0\u0ac8\0\u0af0\0\360\0\360\0\360\0\u0b18\0\360"+
    "\0\u0b40\0\360\0\u0b68\0\u0b90\0\360\0\u0bb8\0\u0be0\0\360"+
    "\0\u0c08\0\360\0\360\0\u0c30\0\u0c58\0\u0c80\0\u0ca8\0\u0cd0"+
    "\0\u0cf8\0\360\0\360\0\u0d20\0\360\0\u0d48\0\u0d70\0\u0d98"+
    "\0\360\0\u0dc0\0\360\0\u0de8\0\u0e10\0\360";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\2\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\1\26\1\10\1\27\1\30\1\31\1\32"+
    "\2\10\1\33\1\34\1\10\1\35\1\36\1\37\1\40"+
    "\1\41\1\10\1\42\1\10\1\43\1\44\6\45\1\46"+
    "\1\47\40\45\47\50\1\51\51\0\1\5\3\0\1\52"+
    "\14\0\25\52\4\0\1\7\45\0\1\10\3\0\1\10"+
    "\14\0\25\10\10\0\1\53\50\0\1\54\51\0\1\55"+
    "\56\0\1\56\27\0\1\10\3\0\1\10\14\0\1\10"+
    "\1\57\23\10\2\0\1\10\3\0\1\10\14\0\11\10"+
    "\1\60\13\10\2\0\1\10\3\0\1\10\14\0\1\10"+
    "\1\61\2\10\1\62\20\10\2\0\1\10\3\0\1\10"+
    "\14\0\1\63\2\10\1\64\21\10\2\0\1\10\3\0"+
    "\1\10\14\0\3\10\1\65\21\10\2\0\1\10\3\0"+
    "\1\10\14\0\3\10\1\66\21\10\2\0\1\10\3\0"+
    "\1\10\14\0\10\10\1\67\4\10\1\70\7\10\2\0"+
    "\1\10\3\0\1\10\14\0\3\10\1\71\5\10\1\72"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\4\10\1\73"+
    "\10\10\1\74\7\10\2\0\1\10\3\0\1\10\14\0"+
    "\3\10\1\75\21\10\2\0\1\10\3\0\1\10\14\0"+
    "\1\10\1\76\23\10\2\0\1\10\3\0\1\10\14\0"+
    "\3\10\1\77\21\10\2\0\1\10\3\0\1\10\14\0"+
    "\1\10\1\100\1\101\1\102\17\10\1\103\1\10\2\0"+
    "\1\10\3\0\1\10\14\0\1\104\24\10\2\0\1\10"+
    "\3\0\1\10\14\0\1\10\1\105\23\10\10\0\1\106"+
    "\50\0\1\107\37\0\47\50\2\0\1\52\3\0\1\52"+
    "\14\0\25\52\2\0\1\10\3\0\1\10\14\0\1\10"+
    "\1\110\23\10\2\0\1\10\3\0\1\10\14\0\20\10"+
    "\1\111\4\10\2\0\1\10\3\0\1\10\14\0\10\10"+
    "\1\112\14\10\2\0\1\10\3\0\1\10\14\0\1\10"+
    "\1\113\23\10\2\0\1\10\3\0\1\10\14\0\6\10"+
    "\1\114\16\10\2\0\1\10\3\0\1\10\14\0\21\10"+
    "\1\115\3\10\2\0\1\10\3\0\1\10\14\0\6\10"+
    "\1\116\16\10\2\0\1\10\3\0\1\10\14\0\3\10"+
    "\1\117\21\10\2\0\1\10\3\0\1\10\14\0\13\10"+
    "\1\120\11\10\2\0\1\10\3\0\1\10\14\0\20\10"+
    "\1\121\4\10\2\0\1\10\3\0\1\10\14\0\20\10"+
    "\1\122\4\10\2\0\1\10\3\0\1\10\14\0\3\10"+
    "\1\123\21\10\2\0\1\10\3\0\1\10\14\0\15\10"+
    "\1\124\7\10\2\0\1\10\3\0\1\10\14\0\7\10"+
    "\1\125\15\10\2\0\1\10\3\0\1\10\14\0\16\10"+
    "\1\126\6\10\2\0\1\10\3\0\1\10\14\0\11\10"+
    "\1\127\13\10\2\0\1\10\3\0\1\10\14\0\1\10"+
    "\1\130\23\10\2\0\1\10\3\0\1\10\14\0\14\10"+
    "\1\131\10\10\2\0\1\10\3\0\1\10\14\0\1\132"+
    "\24\10\2\0\1\10\3\0\1\10\14\0\7\10\1\133"+
    "\15\10\2\0\1\10\3\0\1\10\14\0\21\10\1\134"+
    "\3\10\2\0\1\10\3\0\1\10\14\0\7\10\1\135"+
    "\15\10\2\0\1\10\3\0\1\10\14\0\11\10\1\136"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\10\10\1\137"+
    "\14\10\2\0\1\10\3\0\1\10\14\0\14\10\1\140"+
    "\10\10\2\0\1\10\3\0\1\10\14\0\11\10\1\141"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\17\10\1\142"+
    "\5\10\2\0\1\10\3\0\1\10\14\0\21\10\1\143"+
    "\3\10\2\0\1\10\3\0\1\10\14\0\11\10\1\144"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\11\10\1\145"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\15\10\1\146"+
    "\7\10\2\0\1\10\3\0\1\10\14\0\20\10\1\147"+
    "\4\10\2\0\1\10\3\0\1\10\14\0\2\10\1\150"+
    "\22\10\2\0\1\10\3\0\1\10\14\0\1\10\1\151"+
    "\23\10\2\0\1\10\3\0\1\10\14\0\11\10\1\152"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\10\10\1\153"+
    "\14\10\2\0\1\10\3\0\1\10\14\0\11\10\1\154"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\15\10\1\155"+
    "\7\10\2\0\1\10\3\0\1\10\14\0\13\10\1\156"+
    "\11\10\2\0\1\10\3\0\1\10\14\0\11\10\1\157"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\20\10\1\160"+
    "\4\10\2\0\1\10\3\0\1\10\14\0\11\10\1\161"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\15\10\1\162"+
    "\7\10\2\0\1\10\3\0\1\10\14\0\11\10\1\163"+
    "\13\10\2\0\1\10\3\0\1\10\14\0\1\164\24\10"+
    "\2\0\1\10\3\0\1\10\14\0\11\10\1\165\13\10"+
    "\2\0\1\10\3\0\1\10\14\0\6\10\1\166\16\10"+
    "\2\0\1\10\3\0\1\10\14\0\10\10\1\167\3\10"+
    "\1\170\4\10\1\171\3\10\2\0\1\10\3\0\1\10"+
    "\14\0\15\10\1\172\7\10\2\0\1\10\3\0\1\10"+
    "\14\0\1\10\1\173\23\10\2\0\1\10\3\0\1\10"+
    "\14\0\7\10\1\174\15\10\2\0\1\10\3\0\1\10"+
    "\14\0\15\10\1\175\7\10\2\0\1\10\3\0\1\10"+
    "\14\0\15\10\1\176\7\10\2\0\1\10\3\0\1\10"+
    "\14\0\20\10\1\177\4\10\2\0\1\10\3\0\1\10"+
    "\14\0\1\10\1\200\23\10\2\0\1\10\3\0\1\10"+
    "\14\0\20\10\1\201\4\10\2\0\1\10\3\0\1\10"+
    "\14\0\1\10\1\202\23\10\2\0\1\10\3\0\1\10"+
    "\14\0\11\10\1\203\13\10\2\0\1\10\3\0\1\10"+
    "\14\0\14\10\1\204\10\10\2\0\1\10\3\0\1\10"+
    "\14\0\15\10\1\205\7\10\2\0\1\10\3\0\1\10"+
    "\14\0\13\10\1\206\11\10\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[3640];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\2\1\1\11\3\1\4\11\1\1\4\11"+
    "\20\1\2\11\3\1\1\11\1\1\4\11\27\1\2\11"+
    "\77\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[134];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  LexicalErrorManager lexicalErrorManager = new LexicalErrorManager ();

  private int comment_count = 0;
  private String cadena = "";

  private Token newToken( int id, int line, int column, String lexema ) {
       Token token = new Token ( id );
       token.setLine( line );
       token.setColumn( column );
       token.setLexema( lexema  );
      
       return token;
  }

  

  private void error( int line, int column, String lexema ) {
      error( line, column, lexema, null );
  }

  private void error( int line, int column, String lexema, String mensaje ) {
      LexicalError error = new LexicalError (mensaje);
      error.setLine ( line );
      error.setColumn ( column );
      error.setLexema ( lexema );
      lexicalErrorManager.lexicalFatalError ( error);
      
  }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Scanner(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 18: 
          { cadena = yytext();
          }
        case 52: break;
        case 16: 
          { yybegin(YYSTRING);
          }
        case 53: break;
        case 33: 
          { return newToken( sym.END, yyline+1, yycolumn+1, yytext() );
          }
        case 54: break;
        case 2: 
          { return newToken( sym.ENTERO, yyline+1, yycolumn+1, yytext() );
          }
        case 55: break;
        case 22: 
          { error( yyline+1, yycolumn+1, yytext (), "Fin de comentario, sin inicio" );
          }
        case 56: break;
        case 47: 
          { return newToken( sym.INTEGER, yyline+1, yycolumn+1, yytext() );
          }
        case 57: break;
        case 21: 
          { yybegin(YYCOMMENT); comment_count++;
          }
        case 58: break;
        case 27: 
          { return newToken( sym.DO, yyline+1, yycolumn+1, yytext() );
          }
        case 59: break;
        case 41: 
          { return newToken( sym.FALSE, yyline+1, yycolumn+1, yytext() );
          }
        case 60: break;
        case 13: 
          { return newToken( sym.CORCHDER, yyline+1, yycolumn+1, yytext() );
          }
        case 61: break;
        case 37: 
          { return newToken( sym.TRUE, yyline+1, yycolumn+1, yytext() );
          }
        case 62: break;
        case 1: 
          { error( yyline+1, yycolumn+1, yytext (), "No coincide con ningún patron" );
          }
        case 63: break;
        case 8: 
          { return newToken( sym.MINUS, yyline+1, yycolumn+1, yytext() );
          }
        case 64: break;
        case 30: 
          { comment_count++;
          }
        case 65: break;
        case 25: 
          { return newToken( sym.OR, yyline+1, yycolumn+1, yytext() );
          }
        case 66: break;
        case 32: 
          { return newToken( sym.FOR, yyline+1, yycolumn+1, yytext() );
          }
        case 67: break;
        case 42: 
          { return newToken( sym.BEGIN, yyline+1, yycolumn+1, yytext() );
          }
        case 68: break;
        case 10: 
          { return newToken( sym.MAYOR, yyline+1, yycolumn+1, yytext() );
          }
        case 69: break;
        case 26: 
          { return newToken( sym.OF, yyline+1, yycolumn+1, yytext() );
          }
        case 70: break;
        case 44: 
          { return newToken( sym.RETURN, yyline+1, yycolumn+1, yytext() );
          }
        case 71: break;
        case 5: 
          { return newToken( sym.PARENIZQ, yyline+1, yycolumn+1, yytext() );
          }
        case 72: break;
        case 3: 
          { /* Saltar los espacios en blanco */
          }
        case 73: break;
        case 24: 
          { return newToken( sym.PUNTOPUNTO, yyline+1, yycolumn+1, yytext() );
          }
        case 74: break;
        case 15: 
          { return newToken( sym.PUNTOYCOMA, yyline+1, yycolumn+1, yytext() );
          }
        case 75: break;
        case 4: 
          { return newToken( sym.IDENTIFICADOR, yyline+1, yycolumn+1, yytext() );
          }
        case 76: break;
        case 45: 
          { return newToken( sym.MODULE, yyline+1, yycolumn+1, yytext() );
          }
        case 77: break;
        case 38: 
          { return newToken( sym.TYPE, yyline+1, yycolumn+1, yytext() );
          }
        case 78: break;
        case 51: 
          { return newToken( sym.WRITESTRING, yyline+1, yycolumn+1, yytext() );
          }
        case 79: break;
        case 14: 
          { return newToken( sym.COMA, yyline+1, yycolumn+1, yytext() );
          }
        case 80: break;
        case 43: 
          { return newToken( sym.CONST, yyline+1, yycolumn+1, yytext() );
          }
        case 81: break;
        case 50: 
          { return newToken( sym.PROCEDURE, yyline+1, yycolumn+1, yytext() );
          }
        case 82: break;
        case 28: 
          { return newToken( sym.IF, yyline+1, yycolumn+1, yytext() );
          }
        case 83: break;
        case 46: 
          { return newToken( sym.BOOLEAN, yyline+1, yycolumn+1, yytext() );
          }
        case 84: break;
        case 11: 
          { return newToken( sym.DOSPUNTOS, yyline+1, yycolumn+1, yytext() );
          }
        case 85: break;
        case 39: 
          { return newToken( sym.THEN, yyline+1, yycolumn+1, yytext() );
          }
        case 86: break;
        case 31: 
          { if (--comment_count == 0) yybegin(YYINITIAL);
          }
        case 87: break;
        case 29: 
          { return newToken( sym.TO, yyline+1, yycolumn+1, yytext() );
          }
        case 88: break;
        case 7: 
          { return newToken( sym.PARENDER, yyline+1, yycolumn+1, yytext() );
          }
        case 89: break;
        case 34: 
          { return newToken( sym.NOT, yyline+1, yycolumn+1, yytext() );
          }
        case 90: break;
        case 19: 
          { yybegin(YYINITIAL); return newToken( sym.STRING, yyline+1, yycolumn+1, cadena );
          }
        case 91: break;
        case 9: 
          { return newToken( sym.IGUAL, yyline+1, yycolumn+1, yytext() );
          }
        case 92: break;
        case 49: 
          { return newToken( sym.WRITEINT, yyline+1, yycolumn+1, yytext() );
          }
        case 93: break;
        case 6: 
          { return newToken( sym.PRODUCTO, yyline+1, yycolumn+1, yytext() );
          }
        case 94: break;
        case 23: 
          { return newToken( sym.DOSPUNTOSIGUAL, yyline+1, yycolumn+1, yytext() );
          }
        case 95: break;
        case 48: 
          { return newToken( sym.WRITELN, yyline+1, yycolumn+1, yytext() );
          }
        case 96: break;
        case 35: 
          { return newToken( sym.VAR, yyline+1, yycolumn+1, yytext() );
          }
        case 97: break;
        case 40: 
          { return newToken( sym.ARRAY, yyline+1, yycolumn+1, yytext() );
          }
        case 98: break;
        case 36: 
          { return newToken( sym.ELSE, yyline+1, yycolumn+1, yytext() );
          }
        case 99: break;
        case 12: 
          { return newToken( sym.CORCHIZQ, yyline+1, yycolumn+1, yytext() );
          }
        case 100: break;
        case 17: 
          { /* Ignorar cualquier otro caracter */
          }
        case 101: break;
        case 20: 
          { error( yyline+1, yycolumn+1, yytext (), "Identificador no Valido" );
          }
        case 102: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case YYSTRING: {
              error( yyline+1, yycolumn+1, yytext (), "Cadena de caracteres sin cerrar" );
                     yybegin(YYINITIAL);
            }
            case 135: break;
            case YYCOMMENT: {
              error( yyline+1, yycolumn+1, yytext (), "Comentarios mal balanceado" ); 
                     yybegin(YYINITIAL);
            }
            case 136: break;
            default:
              { return new java_cup.runtime.Symbol(sym.EOF); }
            }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
