package controle.exercicios;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe uma palavra: ");
		String palavra = entrada.nextLine();

		for(int i=0; i<palavra.length(); i++) {
			System.out.println(palavra.charAt(i));
		}
		entrada.close();
	}
}
