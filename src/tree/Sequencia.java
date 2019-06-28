package tree;
public class Sequencia extends Com { 
    public Com c1;
    public Com c2;
    public Sequencia(Com c1,Com c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    public <C> C accept(Visitor<C> v) {return v.visit(this);}
    public String toString() {
        return "Sequencia("+c1+","+c2+")";
    }
}
