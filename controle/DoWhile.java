package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		//no DOWHILE, primeiro passamos a sexpress�o a ser executada
		//para depois passarmos a condi��o, ou seja, pelo menos uma vez
		//a express�o ser� executada
		
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		do {
			System.out.print("Informe a palavra m�gica para sair:");
			palavra = entrada.nextLine();
		}while(!palavra.equalsIgnoreCase("por favor"));
		System.out.println("Saindo...");
		entrada.close();
	}
}
