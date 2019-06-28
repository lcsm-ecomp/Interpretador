package tree;
public class Repeticao extends Com { 
    public Exp teste;
    public Com cRep;
    public Repeticao(Exp teste,Com cRep) {
        this.teste = teste;
        this.cRep = cRep;
    }
    public <C> C accept(Visitor<C> v) {return v.visit(this);}
    public String toString() {
        return "Repeticao("+teste+","+cRep+")";
    }
}
