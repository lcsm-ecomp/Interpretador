import java.io.*;

import java_cup.runtime.*;
import tree.*;
public class Main {

	public static String indenta(String s) {
		StringBuffer result = new StringBuffer();
		String espacos = "\n";
		for (int c=0;c<s.length();c++) {
			char ch = s.charAt(c);
			if (ch==')') {
				espacos = espacos.substring(0,espacos.length()-2);
				result.append(espacos);
			}
			result.append(ch);
			if (ch=='(') {
				espacos = espacos + "  ";
				result.append(espacos);
			}
			
		}
		return result.toString();
	}
	public static void main(String[] args) throws Exception {
		InputStream stream = new FileInputStream("teste.imp");
		Reader reader = new InputStreamReader(stream);
		Scanner scanner = new Scanner(reader);
		Parser parser = new Parser(scanner);
		
		Symbol s = parser.parse();
		Com result = (Com)s.value;
		System.out.println("Arvore = " + result.toString());
		System.out.println("Executando:");
		result.accept(new Avaliador());
		System.out.println("Fim da execução");
	}

}
