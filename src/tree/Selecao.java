package tree;
public class Selecao extends Com { 
    public Exp teste;
    public Com cTrue;
    public Com cFalse;
    public Selecao(Exp teste,Com cTrue,Com cFalse) {
        this.teste = teste;
        this.cTrue = cTrue;
        this.cFalse = cFalse;
    }
    public <C> C accept(Visitor<C> v) {return v.visit(this);}
    public String toString() {
        return "Selecao("+teste+","+cTrue+","+cFalse+")";
    }
}
