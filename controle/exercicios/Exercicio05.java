//Refatorar o exerc�cios 04 usando Switch

package controle.exercicios;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- N�MEROS PRIMOS ---");
		System.out.println("Informe o n�mero: ");
		int num = entrada.nextInt();
		int primo = (num % 2);
		
		switch(primo) {
		case 0 :
			System.out.printf("O numero %d � primo.", num);
			break;
			default :
				System.out.printf("O numero %d n�o � primo.", num);
		}	
		entrada.close();	
	}
}
