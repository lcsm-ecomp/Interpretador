package tree;
public class Atrib extends Com { 
    public String nome;
    public Exp valor;
    public Atrib(String nome,Exp valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public <C> C accept(Visitor<C> v) {return v.visit(this);}
    public String toString() {
        return "Atrib("+nome+","+valor+")";
    }
}
