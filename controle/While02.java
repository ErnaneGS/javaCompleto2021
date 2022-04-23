package controle;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Laço que exibe mensagen do usuário ate que seja digitado sair
		//quantidade indeterminada de repetições
		String texto = ("");
		while (!texto.equalsIgnoreCase("sair")) {
			System.out.print("O que deseja escrever? ");
			texto = entrada.nextLine();
		}
		System.out.println("Saimdo...");
		entrada.close();
	}
}
