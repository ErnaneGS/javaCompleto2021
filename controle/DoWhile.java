package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		//no DOWHILE, primeiro passamos a sexpressão a ser executada
		//para depois passarmos a condição, ou seja, pelo menos uma vez
		//a expressão será executada
		
		Scanner entrada = new Scanner(System.in);
		String palavra = "";
		do {
			System.out.print("Informe a palavra mágica para sair:");
			palavra = entrada.nextLine();
		}while(!palavra.equalsIgnoreCase("por favor"));
		System.out.println("Saindo...");
		entrada.close();
	}
}
