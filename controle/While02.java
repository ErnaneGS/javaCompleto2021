package controle;

import java.util.Scanner;

public class While02 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// La�o que exibe mensagen do usu�rio ate que seja digitado sair
		//quantidade indeterminada de repeti��es
		String texto = ("");
		while (!texto.equalsIgnoreCase("sair")) {
			System.out.print("O que deseja escrever? ");
			texto = entrada.nextLine();
		}
		System.out.println("Saimdo...");
		entrada.close();
	}
}
