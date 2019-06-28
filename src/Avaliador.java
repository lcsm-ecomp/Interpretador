import tree.*;
import java.util.*;

public class Avaliador implements Visitor<Integer> {

	HashMap<String,Integer> variaveis = new HashMap<String, Integer>();
	
	public Integer visit(Val o) {
		return o.v;
	}

	public Integer visit(Var o) {
		return variaveis.get(o.nome);
	}

	@Override
	public Integer visit(Op o) {
		Integer v1 = o.e.accept(this);
		Integer v2 = o.d.accept(this);
		switch (o.op) {
		case "+": return v1+v2;
		case "-": return v1-v2;
		case "*": return v1*v2;
		case ">": return v1>v2?1:0;
		case "==": return v1==v2?1:0;
		}
		return 0;
	}

	public Integer visit(Atrib o) {
		Integer v1 = o.valor.accept(this);
		variaveis.put(o.nome, v1);
		return null;
	}

	public Integer visit(Selecao o) {
		Integer v1 = o.teste.accept(this);
		if (v1!=0) 
			o.cTrue.accept(this);
		else
			o.cFalse.accept(this);
		return null;
	}

	public Integer visit(Sequencia o) {
		o.c1.accept(this);
		o.c2.accept(this);
		return null;
	}

	public Integer visit(Repeticao o) {
		while(true) {
			Integer v = o.teste.accept(this);
			if (v==0) return null;
			o.cRep.accept(this);
		}
	}

	public Integer visit(Escreva o) {
		Integer v = o.val.accept(this);
		System.out.println(v);
		return null;
	}

}
