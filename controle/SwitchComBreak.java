package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- RESULTADO DE NOTAS ---");
		System.out.println("Informe uma nota de 0 a 10: ");
		int nota = entrada.nextInt();
		switch(nota) {
		case 10:
		case 9:
			System.out.println("Nota conceito A ");
			break;
		case 8:
		case 7:
			System.out.println("Nota conceiro B ");
			break;
		case 6:
		case 5:
			System.out.println("Nota conceito C ");
			break;
		case 4:
		case 3:
			System.out.println("Nota conceito D");
			break;
		case 2:
		case 1:
		case 0:
			System.out.println("Nota conceito E");	
			break;
			default:
			System.out.println("Conceito inválido");
		}
		entrada.close();
	}
}




