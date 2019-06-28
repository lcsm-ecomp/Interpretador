package tree;
public class Op extends Exp { 
    public Exp e;
    public String op;
    public Exp d;
    public Op(Exp e,String op,Exp d) {
        this.e = e;
        this.op = op;
        this.d = d;
    }
    public <C> C accept(Visitor<C> v) {return v.visit(this);}
    public String toString() {
        return "Op("+e+","+op+","+d+")";
    }
}
