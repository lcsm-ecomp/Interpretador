package tree;
public interface Visitor<C> {
   public C visit(Val o);
   public C visit(Var o);
   public C visit(Op o);
   public C visit(Atrib o);
   public C visit(Selecao o);
   public C visit(Sequencia o);
   public C visit(Repeticao o);
   public C visit(Escreva o);
}
