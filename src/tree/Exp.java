package tree;
public abstract class Exp { 
   public abstract <C> C accept(Visitor<C> v);
}
