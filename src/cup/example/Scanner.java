/* The following code was generated by JFlex 1.3.5 on 22/07/19, 16:55 */

package cup.example;



/**
 * This class is a scanner generated by <a href="http://www.jflex.de/">JFlex</a> 1.3.5 on 22/07/19,
 * 16:55 from the specification file
 * <tt>file:/home/broke/eclipse-workspace/JFlex Compilatori final/lexer.jflex</tt>
 */
class Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int STRING = 1;
  final public static int YYINITIAL = 0;

  /**
   * Translates characters to character classes
   */
  final private static String yycmap_packed = "\11\7\1\3\1\2\1\0\1\3\1\1\16\7\4\0\1\3\1\43"
      + "\1\46\1\0\1\6\1\0\1\44\1\50\1\30\1\31\1\5\1\36"
      + "\1\0\1\37\1\12\1\4\1\10\11\11\1\0\1\27\1\41\1\42"
      + "\1\40\2\0\32\6\1\32\1\13\1\33\1\0\1\6\1\0\1\6"
      + "\1\47\2\6\1\20\1\15\1\6\1\17\1\14\2\6\1\22\1\6"
      + "\1\21\1\25\2\6\1\26\1\23\1\16\2\6\1\24\3\6\1\34"
      + "\1\45\1\35\1\0\41\7\2\0\4\6\4\0\1\6\2\0\1\7"
      + "\7\0\1\6\4\0\1\6\5\0\27\6\1\0\37\6\1\0\u01ca\6"
      + "\4\0\14\6\16\0\5\6\7\0\1\6\1\0\1\6\21\0\160\7" + "\5\6\1\0\2\6\2\0\4\6\1\0\1\6\6\0\1\6\1\0"
      + "\3\6\1\0\1\6\1\0\24\6\1\0\123\6\1\0\213\6\1\0"
      + "\5\7\2\0\246\6\1\0\46\6\2\0\1\6\7\0\47\6\7\0" + "\1\6\1\0\55\7\1\0\1\7\1\0\2\7\1\0\2\7\1\0"
      + "\1\7\10\0\33\6\5\0\3\6\15\0\6\7\5\0\1\6\4\0"
      + "\13\7\1\0\1\7\3\0\53\6\37\7\4\0\2\6\1\7\143\6"
      + "\1\0\1\6\10\7\1\0\6\7\2\6\2\7\1\0\4\7\2\6" + "\12\7\3\6\2\0\1\6\17\0\1\7\1\6\1\7\36\6\33\7"
      + "\2\0\131\6\13\7\1\6\16\0\12\7\41\6\11\7\2\6\4\0"
      + "\1\6\5\0\26\6\4\7\1\6\11\7\1\6\3\7\1\6\5\7"
      + "\22\0\31\6\3\7\4\0\13\6\65\0\25\6\1\0\10\6\26\0"
      + "\60\7\66\6\3\7\1\6\22\7\1\6\7\7\12\6\2\7\2\0"
      + "\12\7\1\0\20\6\3\7\1\0\10\6\2\0\2\6\2\0\26\6" + "\1\0\7\6\1\0\1\6\3\0\4\6\2\0\1\7\1\6\7\7"
      + "\2\0\2\7\2\0\3\7\1\6\10\0\1\7\4\0\2\6\1\0" + "\3\6\2\7\2\0\12\7\4\6\7\0\2\6\4\0\3\7\1\0"
      + "\6\6\4\0\2\6\2\0\26\6\1\0\7\6\1\0\2\6\1\0" + "\2\6\1\0\2\6\2\0\1\7\1\0\5\7\4\0\2\7\2\0"
      + "\3\7\3\0\1\7\7\0\4\6\1\0\1\6\7\0\14\7\3\6" + "\1\7\13\0\3\7\1\0\11\6\1\0\3\6\1\0\26\6\1\0"
      + "\7\6\1\0\2\6\1\0\5\6\2\0\1\7\1\6\10\7\1\0" + "\3\7\1\0\3\7\2\0\1\6\17\0\2\6\2\7\2\0\12\7"
      + "\1\0\1\6\7\0\1\6\6\7\1\0\3\7\1\0\10\6\2\0" + "\2\6\2\0\26\6\1\0\7\6\1\0\2\6\1\0\5\6\2\0"
      + "\1\7\1\6\7\7\2\0\2\7\2\0\3\7\10\0\2\7\4\0" + "\2\6\1\0\3\6\2\7\2\0\12\7\1\0\1\6\20\0\1\7"
      + "\1\6\1\0\6\6\3\0\3\6\1\0\4\6\3\0\2\6\1\0" + "\1\6\1\0\2\6\3\0\2\6\3\0\3\6\3\0\14\6\4\0"
      + "\5\7\3\0\3\7\1\0\4\7\2\0\1\6\6\0\1\7\16\0" + "\12\7\11\0\1\6\6\0\4\7\1\0\10\6\1\0\3\6\1\0"
      + "\27\6\1\0\20\6\3\0\1\6\7\7\1\0\3\7\1\0\4\7" + "\7\0\2\7\1\0\3\6\5\0\2\6\2\7\2\0\12\7\20\0"
      + "\1\6\3\7\1\0\10\6\1\0\3\6\1\0\27\6\1\0\12\6" + "\1\0\5\6\2\0\1\7\1\6\7\7\1\0\3\7\1\0\4\7"
      + "\7\0\2\7\7\0\1\6\1\0\2\6\2\7\2\0\12\7\1\0" + "\2\6\15\0\4\7\1\0\10\6\1\0\3\6\1\0\51\6\2\7"
      + "\1\6\7\7\1\0\3\7\1\0\4\7\1\6\5\0\3\6\1\7" + "\7\0\3\6\2\7\2\0\12\7\12\0\6\6\2\0\2\7\1\0"
      + "\22\6\3\0\30\6\1\0\11\6\1\0\1\6\2\0\7\6\3\0" + "\1\7\4\0\6\7\1\0\1\7\1\0\10\7\6\0\12\7\2\0"
      + "\2\7\15\0\60\6\1\7\2\6\7\7\4\0\10\6\10\7\1\0"
      + "\12\7\47\0\2\6\1\0\1\6\2\0\2\6\1\0\1\6\2\0" + "\1\6\6\0\4\6\1\0\7\6\1\0\3\6\1\0\1\6\1\0"
      + "\1\6\2\0\2\6\1\0\4\6\1\7\2\6\6\7\1\0\2\7" + "\1\6\2\0\5\6\1\0\1\6\1\0\6\7\2\0\12\7\2\0"
      + "\4\6\40\0\1\6\27\0\2\7\6\0\12\7\13\0\1\7\1\0"
      + "\1\7\1\0\1\7\4\0\2\7\10\6\1\0\44\6\4\0\24\7"
      + "\1\0\2\7\5\6\13\7\1\0\44\7\11\0\1\7\71\0\53\6"
      + "\24\7\1\6\12\7\6\0\6\6\4\7\4\6\3\7\1\6\3\7"
      + "\2\6\7\7\3\6\4\7\15\6\14\7\1\6\17\7\2\0\46\6"
      + "\1\0\1\6\5\0\1\6\2\0\53\6\1\0\u014d\6\1\0\4\6"
      + "\2\0\7\6\1\0\1\6\1\0\4\6\2\0\51\6\1\0\4\6" + "\2\0\41\6\1\0\4\6\2\0\7\6\1\0\1\6\1\0\4\6"
      + "\2\0\17\6\1\0\71\6\1\0\4\6\2\0\103\6\2\0\3\7"
      + "\40\0\20\6\20\0\126\6\2\0\6\6\3\0\u026c\6\2\0\21\6"
      + "\1\0\32\6\5\0\113\6\3\0\13\6\7\0\15\6\1\0\4\6"
      + "\3\7\13\0\22\6\3\7\13\0\22\6\2\7\14\0\15\6\1\0"
      + "\3\6\1\0\2\7\14\0\64\6\40\7\3\0\1\6\3\0\2\6"
      + "\1\7\2\0\12\7\41\0\4\7\1\0\12\7\6\0\130\6\10\0"
      + "\5\6\2\7\42\6\1\7\1\6\5\0\106\6\12\0\37\6\1\0"
      + "\14\7\4\0\14\7\12\0\12\7\36\6\2\0\5\6\13\0\54\6"
      + "\4\0\32\6\6\0\12\7\46\0\27\6\5\7\4\0\65\6\12\7"
      + "\1\0\35\7\2\0\13\7\6\0\12\7\15\0\1\6\10\0\16\7"
      + "\102\0\5\7\57\6\21\7\7\6\4\0\12\7\21\0\11\7\14\0"
      + "\3\7\36\6\15\7\2\6\12\7\54\6\16\7\14\0\44\6\24\7"
      + "\10\0\12\7\3\0\3\6\12\7\44\6\2\0\11\6\107\0\3\7"
      + "\1\0\25\7\4\6\1\7\4\6\3\7\2\6\3\7\6\0\300\6"
      + "\72\7\1\0\5\7\u0116\6\2\0\6\6\2\0\46\6\2\0\6\6"
      + "\2\0\10\6\1\0\1\6\1\0\1\6\1\0\1\6\1\0\37\6" + "\2\0\65\6\1\0\7\6\1\0\1\6\3\0\3\6\1\0\7\6"
      + "\3\0\4\6\2\0\6\6\4\0\15\6\5\0\3\6\1\0\7\6"
      + "\16\0\5\7\32\0\5\7\20\0\2\6\23\0\1\6\13\0\5\7"
      + "\1\0\12\7\1\0\1\6\15\0\1\6\20\0\15\6\3\0\40\6"
      + "\20\0\15\7\4\0\1\7\3\0\14\7\21\0\1\6\4\0\1\6" + "\2\0\12\6\1\0\1\6\3\0\5\6\6\0\1\6\1\0\1\6"
      + "\1\0\1\6\1\0\4\6\1\0\13\6\2\0\4\6\5\0\5\6"
      + "\4\0\1\6\21\0\51\6\u0a77\0\57\6\1\0\57\6\1\0\205\6"
      + "\6\0\4\6\3\7\2\6\14\0\46\6\1\0\1\6\5\0\1\6"
      + "\2\0\70\6\7\0\1\6\17\0\1\7\27\6\11\0\7\6\1\0" + "\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0\7\6\1\0"
      + "\7\6\1\0\7\6\1\0\40\7\57\0\1\6\u01d5\0\3\6\31\0"
      + "\11\6\6\7\1\0\5\6\2\0\5\6\4\0\126\6\2\0\2\7"
      + "\2\0\3\6\1\0\132\6\1\0\4\6\5\0\52\6\2\0\136\6"
      + "\21\0\33\6\65\0\20\6\u0200\0\u19b6\6\112\0\u51eb\6\25\0\u048d\6"
      + "\103\0\56\6\2\0\u010d\6\3\0\20\6\12\7\2\6\24\0\57\6"
      + "\1\7\4\0\12\7\1\0\37\6\2\7\120\6\2\7\45\0\11\6"
      + "\2\0\147\6\2\0\44\6\1\0\10\6\77\0\13\6\1\7\3\6"
      + "\1\7\4\6\1\7\27\6\5\7\20\0\1\6\7\0\64\6\14\0"
      + "\2\7\62\6\22\7\12\0\12\7\6\0\22\7\6\6\3\0\1\6"
      + "\1\0\1\6\2\0\12\7\34\6\10\7\2\0\27\6\15\7\14\0"
      + "\35\6\3\0\4\7\57\6\16\7\16\0\1\6\12\7\6\0\5\6"
      + "\1\7\12\6\12\7\5\6\1\0\51\6\16\7\11\0\3\6\1\7"
      + "\10\6\2\7\2\0\12\7\6\0\27\6\3\0\1\6\3\7\62\6" + "\1\7\1\6\3\7\2\6\2\7\5\6\2\7\1\6\1\7\1\6"
      + "\30\0\3\6\2\0\13\6\5\7\2\0\3\6\2\7\12\0\6\6" + "\2\0\6\6\2\0\6\6\11\0\7\6\1\0\7\6\1\0\53\6"
      + "\1\0\12\6\12\0\163\6\10\7\1\0\2\7\2\0\12\7\6\0"
      + "\u2ba4\6\14\0\27\6\4\0\61\6\u2104\0\u016e\6\2\0\152\6\46\0"
      + "\7\6\14\0\5\6\5\0\1\6\1\7\12\6\1\0\15\6\1\0"
      + "\5\6\1\0\1\6\1\0\2\6\1\0\2\6\1\0\154\6\41\0"
      + "\u016b\6\22\0\100\6\2\0\66\6\50\0\15\6\3\0\20\7\20\0"
      + "\20\7\3\0\2\6\30\0\3\6\31\0\1\6\6\0\5\6\1\0"
      + "\207\6\2\0\1\7\4\0\1\6\13\0\12\7\7\0\32\6\4\0"
      + "\1\6\1\0\32\6\13\0\131\6\3\0\6\6\2\0\6\6\2\0"
      + "\6\6\2\0\3\6\3\0\2\6\3\0\2\6\22\0\3\7\4\0";

  /**
   * Translates characters to character classes
   */
  final private static char[] yycmap = yy_unpack_cmap(yycmap_packed);

  /**
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap[] =
      {0, 41, 82, 123, 164, 123, 205, 246, 287, 123, 328, 369, 410, 451, 492, 123, 123, 123, 123,
          123, 123, 123, 123, 123, 533, 574, 615, 656, 697, 738, 123, 779, 820, 123, 861, 123, 902,
          943, 984, 205, 1025, 1066, 1107, 1148, 123, 123, 123, 123, 123, 123, 123, 123, 123, 123,
          123, 123, 123, 123, 123, 1189, 984, 205, 1230, 1271, 1312, 205, 205, 1353, 205};

  /**
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = "\1\0\1\3\2\4\1\5\1\6\1\7\1\0\1\10"
      + "\1\11\1\12\1\0\1\13\1\14\1\15\1\7\1\16" + "\3\7\1\17\2\7\1\20\1\21\1\22\1\23\1\24"
      + "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34" + "\1\35\1\36\1\37\1\7\1\0\1\40\1\41\1\42"
      + "\10\40\1\43\32\40\1\44\2\40\2\0\1\4\123\0" + "\1\45\1\46\51\0\4\7\2\0\13\7\20\0\1\7"
      + "\13\0\1\47\46\0\2\11\1\47\44\0\4\7\2\0" + "\1\7\1\50\11\7\20\0\1\7\7\0\4\7\2\0"
      + "\11\7\1\51\1\7\20\0\1\7\7\0\4\7\2\0" + "\3\7\1\52\7\7\20\0\1\7\7\0\4\7\2\0"
      + "\6\7\1\53\4\7\20\0\1\7\7\0\4\7\2\0" + "\3\7\1\54\7\7\20\0\1\7\43\0\1\55\50\0"
      + "\1\56\50\0\1\57\50\0\1\60\52\0\1\61\51\0" + "\1\62\3\0\1\40\2\0\10\40\1\0\32\40\1\0"
      + "\2\40\2\0\1\42\46\0\2\63\1\0\10\63\1\64" + "\1\63\1\65\1\66\2\63\1\67\4\63\1\70\17\63"
      + "\1\71\1\72\1\73\1\45\1\3\1\4\46\45\5\46" + "\1\74\43\46\10\0\2\75\45\0\4\7\2\0\12\7"
      + "\1\76\20\0\1\7\7\0\4\7\2\0\4\7\1\77" + "\6\7\20\0\1\7\7\0\4\7\2\0\7\7\1\100"
      + "\3\7\20\0\1\7\7\0\4\7\2\0\1\101\12\7" + "\20\0\1\7\1\0\4\46\1\4\1\74\43\46\6\0"
      + "\4\7\2\0\5\7\1\102\5\7\20\0\1\7\7\0" + "\4\7\2\0\4\7\1\103\6\7\20\0\1\7\7\0"
      + "\4\7\2\0\6\7\1\104\4\7\20\0\1\7\7\0" + "\4\7\2\0\4\7\1\105\6\7\20\0\1\7\1\0";

  /**
   * The transition table of the DFA
   */
  final private static int yytrans[] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] =
      {"Unkown internal scanner error", "Internal error: unknown state",
          "Error: could not match input", "Error: pushback value was too large"};

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {0, 0, 1, 9, 0, 9, 1, 1, 1, 9, 1, 1, 1, 1, 1, 9, 9, 9,
      9, 9, 9, 9, 9, 9, 1, 1, 1, 0, 0, 0, 9, 1, 1, 9, 0, 9, 0, 0, 0, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9,
      9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1};

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /**
   * this buffer contains the current text to be matched and is the source of the yytext() string
   */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /**
   * endRead marks the last character in the buffer, that has been read from input
   */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the matched text
   */
  private int yycolumn;

  /**
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /* user code: */

  StringBuilder lexeme = new StringBuilder();

  private Symbol generateToken(int type) {
    return new Symbol(type, yyline + 1, yycolumn + 1);
  }

  private Symbol generateToken(int type, Object value) {
    return new Symbol(type, yyline + 1, yycolumn + 1, value);
  }


  /**
   * Creates a new scanner There is also a java.io.InputStream version of this constructor.
   *
   * @param in the java.io.Reader to read input from.
   */
  Scanner(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner. There is also java.io.Reader version of this constructor.
   *
   * @param in the java.io.Inputstream to read input from.
   */
  Scanner(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /**
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int[] yy_unpack() {
    int[] trans = new int[1394];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /**
   * Unpacks the compressed DFA transition table.
   *
   * @param packed the packed transition table
   * @return the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int[] trans) {
    int i = 0; /* index in packed string */
    int j = offset; /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do
        trans[j++] = value;
      while (--count > 0);
    }
    return j;
  }

  /**
   * Unpacks the compressed character translation table.
   *
   * @param packed the packed character translation table
   * @return the unpacked character translation table
   */
  private static char[] yy_unpack_cmap(String packed) {
    char[] map = new char[0x10000];
    int i = 0; /* index in packed string */
    int j = 0; /* index in unpacked array */
    while (i < 2280) {
      int count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do
        map[j++] = value;
      while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return <code>false</code>, iff there was new input.
   * 
   * @exception IOException if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, yy_buffer, 0, yy_endRead - yy_startRead);

      /* translate stored positions */
      yy_endRead -= yy_startRead;
      yy_currentPos -= yy_startRead;
      yy_markedPos -= yy_startRead;
      yy_pushbackPos -= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos * 2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, yy_buffer.length - yy_endRead);

    if (numRead < 0) {
      return true;
    } else {
      yy_endRead += numRead;
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true; /* indicate end of file */
    yy_endRead = yy_startRead; /* invalidate buffer */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream <b>cannot</b> be reused (internal buffer
   * is discarded and lost). Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader the new input stream
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL = true;
    yy_atEOF = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String(yy_buffer, yy_startRead, yy_markedPos - yy_startRead);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the matched text.
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead + pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos - yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of yypushback(int) and a match-all fallback
   * rule) this method will only be called with things that "Can't Possibly Happen". If this method
   * is called, something is seriously wrong (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *        yylength()!
   */
  private void yypushback(int number) {
    if (number > yylength())
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token
   * @exception IOException if any I/O-Error occurs
   */
  public Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char[] yy_buffer_l = yy_buffer;
    char[] yycmap_l = yycmap;

    int[] yytrans_l = yytrans;
    int[] yy_rowMap_l = yy_rowMap;
    byte[] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l; yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
          case '\u000B':
          case '\u000C':
          case '\u0085':
          case '\u2028':
          case '\u2029':
            yyline++;
            yycolumn = 0;
            yy_r = false;
            break;
          case '\r':
            yyline++;
            yycolumn = 0;
            yy_r = true;
            break;
          case '\n':
            if (yy_r)
              yy_r = false;
            else {
              yyline++;
              yycolumn = 0;
            }
            break;
          default:
            yy_r = false;
            yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof)
            yy_peek = false;
          else
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek)
          yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          } else {
            // store back cached positions
            yy_currentPos = yy_currentPos_l;
            yy_markedPos = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l = yy_currentPos;
            yy_markedPos_l = yy_markedPos;
            yy_buffer_l = yy_buffer;
            yy_endRead_l = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            } else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[yy_rowMap_l[yy_state] + yycmap_l[yy_input]];
          if (yy_next == -1)
            break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ((yy_attributes & 1) == 1) {
            yy_action = yy_state;
            yy_markedPos_l = yy_currentPos_l;
            if ((yy_attributes & 8) == 8)
              break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 2:
        case 3: {
        }
        case 70:
          break;
        case 50: {
          throw new RuntimeException("Illegal escape sequence \"" + yytext() + "\"");
        }
        case 71:
          break;
        case 6:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 40:
        case 41:
        case 42:
        case 43:
        case 62:
        case 63:
        case 64:
        case 67: {
          return generateToken(Symbol.ident, yytext());
        }
        case 72:
          break;
        case 60: {
          return generateToken(Symbol.DoubleLiteral, Double.parseDouble(yytext()));
        }
        case 73:
          break;
        case 7:
        case 8: {
          return generateToken(Symbol.DecLiteral, Integer.parseInt(yytext()));
        }
        case 74:
          break;
        case 32:
        case 33: {
          throw new RuntimeException("Unterminated string at end of line");
        }
        case 75:
          break;
        case 66: {
          return generateToken(Symbol.ELSE);
        }
        case 76:
          break;
        case 65: {
          return generateToken(Symbol.THEN);
        }
        case 77:
          break;
        case 61: {
          return generateToken(Symbol.FOR);
        }
        case 78:
          break;
        case 44: {
          return generateToken(Symbol.GEG);
        }
        case 79:
          break;
        case 46: {
          return generateToken(Symbol.EGEG);
        }
        case 80:
          break;
        case 47: {
          return generateToken(Symbol.NOT);
        }
        case 81:
          break;
        case 48: {
          return generateToken(Symbol.AND);
        }
        case 82:
          break;
        case 58: {
          lexeme.append('\'');
        }
        case 83:
          break;
        case 57: {
          lexeme.append('\b');
        }
        case 84:
          break;
        case 51: {
          lexeme.append('\\');
        }
        case 85:
          break;
        case 52: {
          lexeme.append('\f');
        }
        case 86:
          break;
        case 53: {
          lexeme.append('\t');
        }
        case 87:
          break;
        case 54: {
          lexeme.append('\n');
        }
        case 88:
          break;
        case 55: {
          lexeme.append('\r');
        }
        case 89:
          break;
        case 56: {
          lexeme.append('\"');
        }
        case 90:
          break;
        case 68: {
          return generateToken(Symbol.WHILE);
        }
        case 91:
          break;
        case 23: {
          return generateToken(Symbol.MINUS);
        }
        case 92:
          break;
        case 22: {
          return generateToken(Symbol.PLUS);
        }
        case 93:
          break;
        case 21: {
          return generateToken(Symbol.RBRACK);
        }
        case 94:
          break;
        case 20: {
          return generateToken(Symbol.LBRACK);
        }
        case 95:
          break;
        case 19: {
          return generateToken(Symbol.RBRACE);
        }
        case 96:
          break;
        case 18: {
          return generateToken(Symbol.LBRACE);
        }
        case 97:
          break;
        case 5: {
          return generateToken(Symbol.TIMES);
        }
        case 98:
          break;
        case 15: {
          return generateToken(Symbol.SEMI);
        }
        case 99:
          break;
        case 16: {
          return generateToken(Symbol.LPAREN);
        }
        case 100:
          break;
        case 17: {
          return generateToken(Symbol.RPAREN);
        }
        case 101:
          break;
        case 30: {
          yybegin(STRING);
          lexeme.setLength(0);
        }
        case 102:
          break;
        case 31: {
          lexeme.append(yytext());
        }
        case 103:
          break;
        case 26: {
          return generateToken(Symbol.EG);
        }
        case 104:
          break;
        case 25: {
          return generateToken(Symbol.LT);
        }
        case 105:
          break;
        case 24: {
          return generateToken(Symbol.GT);
        }
        case 106:
          break;
        case 9: {
          return generateToken(Symbol.DOT);
        }
        case 107:
          break;
        case 39: {
          return generateToken(Symbol.IF);
        }
        case 108:
          break;
        case 45: {
          return generateToken(Symbol.LEG);
        }
        case 109:
          break;
        case 49: {
          return generateToken(Symbol.OR);
        }
        case 110:
          break;
        case 35: {
          yybegin(YYINITIAL);
          return generateToken(Symbol.STRING_LITERAL, lexeme.toString());
        }
        case 111:
          break;
        default:
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            {
              return generateToken(Symbol.EOF);
            }
          } else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
