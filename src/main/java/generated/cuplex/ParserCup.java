
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package generated.cuplex;

import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserCup extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Sym.class;
}

  /** Default constructor. */
  @Deprecated
  public ParserCup() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ParserCup(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCup(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\065\000\002\002\004\000\002\002\005\000\002\002" +
    "\004\000\002\002\004\000\002\002\003\000\002\003\011" +
    "\000\002\004\003\000\002\004\003\000\002\005\005\000" +
    "\002\005\003\000\002\005\002\000\002\006\006\000\002" +
    "\007\005\000\002\007\003\000\002\007\002\000\002\010" +
    "\006\000\002\010\005\000\002\010\004\000\002\011\004" +
    "\000\002\011\003\000\002\011\003\000\002\012\003\000" +
    "\002\012\003\000\002\013\005\000\002\013\007\000\002" +
    "\014\005\000\002\015\005\000\002\015\005\000\002\015" +
    "\005\000\002\015\005\000\002\015\005\000\002\016\005" +
    "\000\002\017\004\000\002\020\003\000\002\020\003\000" +
    "\002\020\003\000\002\020\003\000\002\020\002\000\002" +
    "\021\004\000\002\022\005\000\002\022\005\000\002\023" +
    "\004\000\002\024\005\000\002\024\005\000\002\024\003" +
    "\000\002\025\005\000\002\025\005\000\002\025\005\000" +
    "\002\025\003\000\002\026\005\000\002\026\003\000\002" +
    "\026\003\000\002\026\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\136\000\006\004\010\034\004\001\002\000\004\030" +
    "\017\001\002\000\010\002\ufffd\004\ufffd\034\ufffd\001\002" +
    "\000\010\002\015\004\010\034\004\001\002\000\004\012" +
    "\012\001\002\000\004\034\011\001\002\000\012\012\uffdb" +
    "\013\uffdb\022\uffdb\031\uffdb\001\002\000\010\002\ufffe\004" +
    "\ufffe\034\ufffe\001\002\000\010\002\uffff\004\uffff\034\uffff" +
    "\001\002\000\004\012\016\001\002\000\004\002\001\001" +
    "\002\000\010\002\000\004\000\034\000\001\002\000\010" +
    "\004\010\013\ufff7\031\ufff7\001\002\000\006\013\ufff8\031" +
    "\ufff8\001\002\000\006\013\022\031\023\001\002\000\004" +
    "\004\010\001\002\000\004\014\024\001\002\000\006\004" +
    "\027\005\026\001\002\000\004\032\030\001\002\000\004" +
    "\032\ufffa\001\002\000\004\032\ufffb\001\002\000\022\004" +
    "\010\006\036\007\037\011\035\012\uffdc\032\030\033\043" +
    "\034\041\001\002\000\010\002\ufffc\004\ufffc\034\ufffc\001" +
    "\002\000\014\004\uffeb\006\uffeb\012\uffeb\033\uffeb\034\uffeb" +
    "\001\002\000\014\004\uffec\006\uffec\012\uffec\033\uffec\034" +
    "\uffec\001\002\000\014\004\010\006\036\012\uffdc\033\137" +
    "\034\041\001\002\000\004\030\112\001\002\000\010\030" +
    "\055\034\053\035\060\001\002\000\004\030\112\001\002" +
    "\000\016\004\010\006\036\007\037\011\035\012\uffdc\034" +
    "\041\001\002\000\006\022\105\030\076\001\002\000\004" +
    "\012\uffdd\001\002\000\024\002\ufff0\004\ufff0\006\ufff0\007" +
    "\ufff0\010\ufff0\011\ufff0\012\ufff0\033\ufff0\034\ufff0\001\002" +
    "\000\004\012\104\001\002\000\006\012\uffe0\022\052\001" +
    "\002\000\004\012\uffdf\001\002\000\014\004\uffee\006\uffee" +
    "\012\uffee\033\uffee\034\uffee\001\002\000\014\004\uffed\006" +
    "\uffed\012\uffed\033\uffed\034\uffed\001\002\000\004\012\uffde" +
    "\001\002\000\010\030\055\034\053\035\060\001\002\000" +
    "\036\012\uffcf\013\uffcf\015\uffcf\016\uffcf\017\uffcf\020\uffcf" +
    "\021\uffcf\023\uffcf\024\uffcf\025\uffcf\026\uffcf\027\uffcf\030" +
    "\076\031\uffcf\001\002\000\034\012\uffce\013\uffce\015\uffce" +
    "\016\uffce\017\uffce\020\uffce\021\uffce\023\uffce\024\uffce\025" +
    "\uffce\026\uffce\027\uffce\031\uffce\001\002\000\010\030\055" +
    "\034\053\035\060\001\002\000\034\012\uffd1\013\uffd1\015" +
    "\uffd1\016\uffd1\017\070\020\067\021\066\023\uffd1\024\uffd1" +
    "\025\uffd1\026\uffd1\027\uffd1\031\uffd1\001\002\000\026\012" +
    "\uffd5\013\uffd5\015\063\016\062\023\uffd5\024\uffd5\025\uffd5" +
    "\026\uffd5\027\uffd5\031\uffd5\001\002\000\034\012\uffcd\013" +
    "\uffcd\015\uffcd\016\uffcd\017\uffcd\020\uffcd\021\uffcd\023\uffcd" +
    "\024\uffcd\025\uffcd\026\uffcd\027\uffcd\031\uffcd\001\002\000" +
    "\004\012\uffda\001\002\000\010\030\055\034\053\035\060" +
    "\001\002\000\010\030\055\034\053\035\060\001\002\000" +
    "\022\012\uffd7\013\uffd7\023\uffd7\024\uffd7\025\uffd7\026\uffd7" +
    "\027\uffd7\031\uffd7\001\002\000\022\012\uffd6\013\uffd6\023" +
    "\uffd6\024\uffd6\025\uffd6\026\uffd6\027\uffd6\031\uffd6\001\002" +
    "\000\010\030\055\034\053\035\060\001\002\000\010\030" +
    "\055\034\053\035\060\001\002\000\010\030\055\034\053" +
    "\035\060\001\002\000\026\012\uffd3\013\uffd3\015\uffd3\016" +
    "\uffd3\023\uffd3\024\uffd3\025\uffd3\026\uffd3\027\uffd3\031\uffd3" +
    "\001\002\000\026\012\uffd4\013\uffd4\015\uffd4\016\uffd4\023" +
    "\uffd4\024\uffd4\025\uffd4\026\uffd4\027\uffd4\031\uffd4\001\002" +
    "\000\026\012\uffd2\013\uffd2\015\uffd2\016\uffd2\023\uffd2\024" +
    "\uffd2\025\uffd2\026\uffd2\027\uffd2\031\uffd2\001\002\000\004" +
    "\031\075\001\002\000\034\012\uffd0\013\uffd0\015\uffd0\016" +
    "\uffd0\017\uffd0\020\uffd0\021\uffd0\023\uffd0\024\uffd0\025\uffd0" +
    "\026\uffd0\027\uffd0\031\uffd0\001\002\000\014\013\ufff3\030" +
    "\055\031\ufff3\034\053\035\060\001\002\000\006\013\101" +
    "\031\102\001\002\000\006\013\ufff4\031\ufff4\001\002\000" +
    "\010\030\055\034\053\035\060\001\002\000\034\012\ufff6" +
    "\013\ufff6\015\ufff6\016\ufff6\017\ufff6\020\ufff6\021\ufff6\023" +
    "\ufff6\024\ufff6\025\ufff6\026\ufff6\027\ufff6\031\ufff6\001\002" +
    "\000\006\013\ufff5\031\ufff5\001\002\000\014\004\uffe1\006" +
    "\uffe1\012\uffe1\033\uffe1\034\uffe1\001\002\000\010\030\055" +
    "\034\053\035\060\001\002\000\004\012\uffd9\001\002\000" +
    "\014\004\010\006\036\012\uffdc\033\111\034\041\001\002" +
    "\000\014\004\uffef\006\uffef\012\uffef\033\uffef\034\uffef\001" +
    "\002\000\024\002\ufff2\004\ufff2\006\ufff2\007\ufff2\010\ufff2" +
    "\011\ufff2\012\ufff2\033\ufff2\034\ufff2\001\002\000\010\030" +
    "\055\034\053\035\060\001\002\000\004\032\030\001\002" +
    "\000\016\004\uffea\006\uffea\010\115\012\uffea\033\uffea\034" +
    "\uffea\001\002\000\004\032\030\001\002\000\014\004\uffe9" +
    "\006\uffe9\012\uffe9\033\uffe9\034\uffe9\001\002\000\004\031" +
    "\133\001\002\000\014\023\122\024\123\025\125\026\124" +
    "\027\121\001\002\000\010\030\055\034\053\035\060\001" +
    "\002\000\010\030\055\034\053\035\060\001\002\000\010" +
    "\030\055\034\053\035\060\001\002\000\010\030\055\034" +
    "\053\035\060\001\002\000\010\030\055\034\053\035\060" +
    "\001\002\000\004\031\uffe4\001\002\000\004\031\uffe6\001" +
    "\002\000\004\031\uffe3\001\002\000\004\031\uffe7\001\002" +
    "\000\004\031\uffe5\001\002\000\004\032\uffe8\001\002\000" +
    "\004\012\uffd8\001\002\000\004\032\030\001\002\000\014" +
    "\004\uffe2\006\uffe2\012\uffe2\033\uffe2\034\uffe2\001\002\000" +
    "\024\002\ufff1\004\ufff1\006\ufff1\007\ufff1\010\ufff1\011\ufff1" +
    "\012\ufff1\033\ufff1\034\ufff1\001\002\000\006\013\ufff9\031" +
    "\ufff9\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\136\000\010\002\005\003\004\021\006\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\003\012\021\013" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\005\020\021" +
    "\017\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\021\137\001\001\000\002\001\001\000\004\004\024\001" +
    "\001\000\004\010\030\001\001\000\002\001\001\000\002" +
    "\001\001\000\030\006\041\010\037\011\033\012\047\013" +
    "\032\016\031\017\046\020\043\021\044\022\045\023\050" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\016\006\041\017\107\020\043\021\044\022\045" +
    "\023\050\001\001\000\004\014\134\001\001\000\012\006" +
    "\053\024\133\025\056\026\055\001\001\000\004\014\112" +
    "\001\001\000\026\006\041\011\106\012\047\013\032\016" +
    "\031\017\046\020\043\021\044\022\045\023\050\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\012\006" +
    "\053\024\060\025\056\026\055\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\006\053\024\073\025\056\026" +
    "\055\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\006\053\024\064\025" +
    "\056\026\055\001\001\000\012\006\053\024\063\025\056" +
    "\026\055\001\001\000\002\001\001\000\002\001\001\000" +
    "\010\006\053\025\072\026\055\001\001\000\010\006\053" +
    "\025\071\026\055\001\001\000\010\006\053\025\070\026" +
    "\055\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\014\006" +
    "\053\007\076\024\077\025\056\026\055\001\001\000\002" +
    "\001\001\000\002\001\001\000\012\006\053\024\102\025" +
    "\056\026\055\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\012\006\053\024\105\025\056\026" +
    "\055\001\001\000\002\001\001\000\016\006\041\017\107" +
    "\020\043\021\044\022\045\023\050\001\001\000\002\001" +
    "\001\000\002\001\001\000\014\006\053\015\116\024\117" +
    "\025\056\026\055\001\001\000\004\010\113\001\001\000" +
    "\002\001\001\000\004\010\115\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\012\006\053\024" +
    "\131\025\056\026\055\001\001\000\012\006\053\024\130" +
    "\025\056\026\055\001\001\000\012\006\053\024\127\025" +
    "\056\026\055\001\001\000\012\006\053\024\126\025\056" +
    "\026\055\001\001\000\012\006\053\024\125\025\056\026" +
    "\055\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\010\135\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCup$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCup$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCup$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserCup$actions {
  private final ParserCup parser;

  /** Constructor */
  CUP$ParserCup$actions(ParserCup parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action_part00000000(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCup$result;

      /* select the action based on the action number */
      switch (CUP$ParserCup$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= program EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)).value;
		RESULT = start_val;
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCup$parser.done_parsing();
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // program ::= program var_declaration SEMICOLON 
            {
              Object RESULT =null;
		 System.out.println("1"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // program ::= program func_definition 
            {
              Object RESULT =null;
		 System.out.println("2"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // program ::= var_declaration SEMICOLON 
            {
              Object RESULT =null;
		 System.out.println("3"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // program ::= func_definition 
            {
              Object RESULT =null;
		 System.out.println("4"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("program",0, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // func_definition ::= ID OPEN_P parameters CLOSE_P ARROW func_type block 
            {
              Object RESULT =null;
		 System.out.println("5"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("func_definition",1, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-6)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // func_type ::= INT 
            {
              Object RESULT =null;

              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("func_type",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // func_type ::= VOID 
            {
              Object RESULT =null;
		 System.out.println("6"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("func_type",2, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // parameters ::= parameters COMMA var_declaration 
            {
              Object RESULT =null;
		 System.out.println("7"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("parameters",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // parameters ::= var_declaration 
            {
              Object RESULT =null;
		 System.out.println("8"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("parameters",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // parameters ::= 
            {
              Object RESULT =null;
		 System.out.println("9"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("parameters",3, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // func_call ::= ID OPEN_P arguments CLOSE_P 
            {
              Object RESULT =null;
		 System.out.println("10"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("func_call",4, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // arguments ::= arguments COMMA expression 
            {
              Object RESULT =null;
		 System.out.println("11"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("arguments",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // arguments ::= expression 
            {
              Object RESULT =null;
		 System.out.println("12"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("arguments",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // arguments ::= 
            {
              Object RESULT =null;
		 System.out.println("13"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("arguments",5, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // block ::= OPEN_B block inner_block CLOSE_B 
            {
              Object RESULT =null;
		 System.out.println("14"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("block",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-3)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // block ::= OPEN_B inner_block CLOSE_B 
            {
              Object RESULT =null;
		 System.out.println("15"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("block",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // block ::= OPEN_B CLOSE_B 
            {
              Object RESULT =null;
		 System.out.println("16"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("block",6, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // inner_block ::= inner_block instruction 
            {
              Object RESULT =null;
		 System.out.println("17"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("inner_block",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // inner_block ::= instruction 
            {
              Object RESULT =null;
		 System.out.println("18"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("inner_block",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // inner_block ::= control_flow 
            {
              Object RESULT =null;
		 System.out.println("19"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("inner_block",7, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // control_flow ::= if_statement 
            {
              Object RESULT =null;
		 System.out.println("20"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("control_flow",8, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // control_flow ::= while_loop 
            {
              Object RESULT =null;
		 System.out.println("21"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("control_flow",8, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // if_statement ::= IF condition block 
            {
              Object RESULT =null;
		 System.out.println("22"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("if_statement",9, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // if_statement ::= IF condition block ELSE block 
            {
              Object RESULT =null;
		 System.out.println("23"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("if_statement",9, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-4)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // condition ::= OPEN_P comparison CLOSE_P 
            {
              Object RESULT =null;
		 System.out.println("24"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("condition",10, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // comparison ::= expression LT expression 
            {
              Object RESULT =null;
		 System.out.println("25"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comparison",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // comparison ::= expression LE expression 
            {
              Object RESULT =null;
		 System.out.println("26"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comparison",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // comparison ::= expression EQ expression 
            {
              Object RESULT =null;
		 System.out.println("27"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comparison",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // comparison ::= expression GE expression 
            {
              Object RESULT =null;
		 System.out.println("28"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comparison",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // comparison ::= expression GT expression 
            {
              Object RESULT =null;
		 System.out.println("29"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("comparison",11, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // while_loop ::= WHILE condition block 
            {
              Object RESULT =null;
		 System.out.println("30"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("while_loop",12, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // instruction ::= concrete_instruction SEMICOLON 
            {
              Object RESULT =null;
		 System.out.println("31"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("instruction",13, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // concrete_instruction ::= var_declaration 
            {
              Object RESULT =null;
		 System.out.println("32"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("concrete_instruction",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // concrete_instruction ::= var_assignation 
            {
              Object RESULT =null;
		 System.out.println("33"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("concrete_instruction",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // concrete_instruction ::= return_statement 
            {
              Object RESULT =null;
		 System.out.println("34"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("concrete_instruction",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // concrete_instruction ::= func_call 
            {
              Object RESULT =null;
		 System.out.println("35"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("concrete_instruction",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // concrete_instruction ::= 
            {
              Object RESULT =null;
		 System.out.println("36"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("concrete_instruction",14, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // var_declaration ::= INT ID 
            {
              Object RESULT =null;
		 System.out.println("37"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("var_declaration",15, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // var_assignation ::= var_declaration ASSIGN expression 
            {
              Object RESULT =null;
		 System.out.println("38"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("var_assignation",16, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // var_assignation ::= ID ASSIGN expression 
            {
              Object RESULT =null;
		 System.out.println("39"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("var_assignation",16, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // return_statement ::= RETURN expression 
            {
              Object RESULT =null;
		 System.out.println("40"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("return_statement",17, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // expression ::= term ADD expression 
            {
              Object RESULT =null;
		 System.out.println("41"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // expression ::= term SUB expression 
            {
              Object RESULT =null;
		 System.out.println("42"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // expression ::= term 
            {
              Object RESULT =null;
		 System.out.println("43"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("expression",18, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // term ::= factor MUL term 
            {
              Object RESULT =null;
		 System.out.println("44"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",19, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // term ::= factor DIV term 
            {
              Object RESULT =null;
		 System.out.println("45"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",19, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // term ::= factor MOD term 
            {
              Object RESULT =null;
		 System.out.println("46"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",19, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // term ::= factor 
            {
              Object RESULT =null;
		 System.out.println("47"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("term",19, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // factor ::= OPEN_P expression CLOSE_P 
            {
              Object RESULT =null;
		 System.out.println("48"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("factor",20, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.elementAt(CUP$ParserCup$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 50: // factor ::= ID 
            {
              Object RESULT =null;
		 System.out.println("49"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("factor",20, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 51: // factor ::= func_call 
            {
              Object RESULT =null;
		 System.out.println("50"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("factor",20, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 52: // factor ::= VALUE 
            {
              Object RESULT =null;
		 System.out.println("51"); 
              CUP$ParserCup$result = parser.getSymbolFactory().newSymbol("factor",20, ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCup$stack.peek()), RESULT);
            }
          return CUP$ParserCup$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserCup$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserCup$do_action(
    int                        CUP$ParserCup$act_num,
    java_cup.runtime.lr_parser CUP$ParserCup$parser,
    java.util.Stack            CUP$ParserCup$stack,
    int                        CUP$ParserCup$top)
    throws java.lang.Exception
    {
              return CUP$ParserCup$do_action_part00000000(
                               CUP$ParserCup$act_num,
                               CUP$ParserCup$parser,
                               CUP$ParserCup$stack,
                               CUP$ParserCup$top);
    }
}

}
