package tree;
public class Escreva extends Com { 
    public Exp val;
    public Escreva(Exp val) {
        this.val = val;
    }
    public <C> C accept(Visitor<C> v) {return v.visit(this);}
    public String toString() {
        return "Escreva("+val+")";
    }
}
