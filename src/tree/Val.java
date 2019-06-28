package tree;
public class Val extends Exp { 
    public int v;
    public Val(int v) {
        this.v = v;
    }
    public <C> C accept(Visitor<C> v) {return v.visit(this);}
    public String toString() {
        return "Val("+v+")";
    }
}
