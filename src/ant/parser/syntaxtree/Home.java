//
// Generated by JTB 1.3.2
//

package ant.parser.syntaxtree;

/**
 * Grammar production:
 * nodeToken -> "Home"
 */
public class Home implements Node {
   public NodeToken nodeToken;

   public Home(NodeToken n0) {
      nodeToken = n0;
   }

   public Home() {
      nodeToken = new NodeToken("Home");
   }

   public void accept(ant.parser.visitor.Visitor v) {
      v.visit(this);
   }
   public <R,A> R accept(ant.parser.visitor.GJVisitor<R,A> v, A argu) {
      return v.visit(this,argu);
   }
   public <R> R accept(ant.parser.visitor.GJNoArguVisitor<R> v) {
      return v.visit(this);
   }
   public <A> void accept(ant.parser.visitor.GJVoidVisitor<A> v, A argu) {
      v.visit(this,argu);
   }
}
