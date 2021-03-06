
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Mon Apr 07 16:35:55 CEST 2014
//----------------------------------------------------

package dataengine;

import java.util.List;
import java.util.ArrayList;
import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Mon Apr 07 16:35:55 CEST 2014
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\011\010\000\002\002\004\000\002\011" +
    "\007\000\002\010\004\000\002\010\003\000\002\007\003" +
    "\000\002\007\003\000\002\006\003\000\002\006\003\000" +
    "\002\005\006\000\002\004\007\000\002\003\003\000\002" +
    "\003\007\000\002\003\003\000\002\003\003\000\002\002" +
    "\003\000\002\002\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\004\004\004\001\002\000\004\017\007\001" +
    "\002\000\004\002\006\001\002\000\004\002\000\001\002" +
    "\000\004\004\010\001\002\000\004\011\011\001\002\000" +
    "\010\004\004\012\015\017\012\001\002\000\006\005\025" +
    "\013\024\001\002\000\010\004\ufffa\012\ufffa\017\ufffa\001" +
    "\002\000\010\004\ufffc\012\ufffc\017\ufffc\001\002\000\012" +
    "\002\uffff\004\uffff\012\uffff\017\uffff\001\002\000\010\004" +
    "\ufff9\012\ufff9\017\ufff9\001\002\000\010\004\ufffd\012\ufffd" +
    "\017\ufffd\001\002\000\010\004\ufffb\012\ufffb\017\ufffb\001" +
    "\002\000\010\004\004\012\022\017\012\001\002\000\012" +
    "\002\001\004\001\012\001\017\001\001\002\000\010\004" +
    "\ufffe\012\ufffe\017\ufffe\001\002\000\014\007\032\015\030" +
    "\016\033\020\031\021\026\001\002\000\014\007\032\015" +
    "\030\016\033\020\031\021\026\001\002\000\006\006\ufff4" +
    "\014\ufff4\001\002\000\006\006\ufff3\014\ufff3\001\002\000" +
    "\006\006\ufff2\014\ufff2\001\002\000\006\006\ufff6\014\ufff6" +
    "\001\002\000\004\020\037\001\002\000\006\006\ufff1\014" +
    "\ufff1\001\002\000\004\006\035\001\002\000\004\014\036" +
    "\001\002\000\010\004\ufff7\012\ufff7\017\ufff7\001\002\000" +
    "\004\020\040\001\002\000\004\020\041\001\002\000\004" +
    "\010\042\001\002\000\006\006\ufff5\014\ufff5\001\002\000" +
    "\004\014\044\001\002\000\010\004\ufff8\012\ufff8\017\ufff8" +
    "\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\042\000\004\011\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\016\004\015\005\012\006\013\007\016\010" +
    "\020\011\017\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\014\004\015\005\012" +
    "\006\013\007\022\011\017\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\002\026\003\042\001\001\000\006" +
    "\002\026\003\033\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
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
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {

 


  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // boolean ::= FALSE 
            {
              Boolean RESULT =null;
		
							RESULT = new Boolean(false);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("boolean",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // boolean ::= TRUE 
            {
              Boolean RESULT =null;
		
							RESULT = new Boolean(true);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("boolean",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // value ::= boolean 
            {
              Datum RESULT =null;
		int bleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Boolean b = (Boolean)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
							RESULT = new Datum(b, DataNode.BOOLEAN_TYPE);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // value ::= STRING 
            {
              Datum RESULT =null;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
							RESULT = new Datum(s, DataNode.STRING_TYPE);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // value ::= OP_SBRAC NUMBER NUMBER NUMBER CL_SBRAC 
            {
              Datum RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String n1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String n2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n3left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int n3right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String n3 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
							float[] res = new float[3];
							res[0] = Float.parseFloat(n1);
							res[1] = Float.parseFloat(n2);
							res[2] = Float.parseFloat(n3);
							RESULT = new Datum(res, DataNode.VECTOR_TYPE);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // value ::= NUMBER 
            {
              Datum RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
							RESULT = new Datum(Float.parseFloat(n), DataNode.NUMBER_TYPE);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("value",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // function ::= IDENT OP_PAR value CL_PAR SEMICOLON 
            {
              DataValue RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Datum val = (Datum)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		
							RESULT = new DataValue(id, val, false);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("function",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // assignment ::= IDENT EQUAL value SEMICOLON 
            {
              DataValue RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Datum val = (Datum)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
							RESULT = new DataValue(id, val, true);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("assignment",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // definition ::= function 
            {
              DataValue RESULT =null;
		int funcleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int funcright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DataValue func = (DataValue)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
							RESULT = func;
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("definition",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // definition ::= assignment 
            {
              DataValue RESULT =null;
		int assignleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int assignright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DataValue assign = (DataValue)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
							RESULT = assign;
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("definition",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // content ::= group 
            {
              DataNode RESULT =null;
		int groupleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int groupright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DataGroup group = (DataGroup)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
							RESULT = group;
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("content",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // content ::= definition 
            {
              DataNode RESULT =null;
		int defleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int defright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DataValue def = (DataValue)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
							RESULT = def;
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("content",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // groupContentList ::= content 
            {
              List<DataNode> RESULT =null;
		int contleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int contright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DataNode cont = (DataNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
							List<DataNode> elements = new ArrayList<DataNode>();
							elements.add(cont);
							RESULT = elements;
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("groupContentList",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // groupContentList ::= groupContentList content 
            {
              List<DataNode> RESULT =null;
		int elementsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int elementsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<DataNode> elements = (List<DataNode>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int contleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int contright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		DataNode cont = (DataNode)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
							elements.add(cont);
							RESULT = elements;
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("groupContentList",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // group ::= QUOT IDENT QUOT OP_BRAC CL_BRAC 
            {
              DataGroup RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-3)).value;
		
							RESULT = new DataGroup(id);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("group",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= group EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		DataGroup start_val = (DataGroup)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // group ::= QUOT IDENT QUOT OP_BRAC groupContentList CL_BRAC 
            {
              DataGroup RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-4)).value;
		int elementsleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int elementsright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		List<DataNode> elements = (List<DataNode>)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
							RESULT = new DataGroup(id, elements);
						
              CUP$parser$result = parser.getSymbolFactory().newSymbol("group",7, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

