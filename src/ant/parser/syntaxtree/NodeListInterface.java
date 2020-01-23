//
// Generated by JTB 1.3.2
//

package ant.parser.syntaxtree;

/**
 * The interface which NodeList, NodeListOptional, and NodeSequence
 * implement.
 */
public interface NodeListInterface extends Node {
   public void addNode(Node n);
   public Node elementAt(int i);
   public java.util.Enumeration<Node> elements();
   public int size();

   public void accept(ant.parser.visitor.Visitor v);
   public <R,A> R accept(ant.parser.visitor.GJVisitor<R,A> v, A argu);
   public <R> R accept(ant.parser.visitor.GJNoArguVisitor<R> v);
   public <A> void accept(ant.parser.visitor.GJVoidVisitor<A> v, A argu);
}
