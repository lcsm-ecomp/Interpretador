package tree;
public class Var extends Exp { 
    public String nome;
    public Var(String nome) {
        this.nome = nome;
    }
    public <C> C accept(Visitor<C> v) {return v.visit(this);}
    public String toString() {
        return "Var("+nome+")";
    }
}
