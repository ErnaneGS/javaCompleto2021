
package controle.exercicios;

import java.util.Scanner;
import java.util.Random;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Random random = new Random();
		int numeroSorteado = random.nextInt(101);
		boolean ganhou = false;

		System.out.println("--- SORTEIO ---");
		System.out.println("Voc� ter� 10 chaances para advinhar o n�mero sorteado");
		
		for(int i = 10; i >= 1; i--) {
			System.out.print("Informe um n�mero de 0 a 100:  ");
			int num = entrada.nextInt();
			if(numeroSorteado == num) {
				ganhou = true;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Parab�ns voc� acertou!!!");
				System.out.println("O num�ro sorteado foi " + numeroSorteado + 
						" e voc� escolheu o n�mero " +num+" na " +i+" tentativa." );
				System.out.println("-----------------------------------------------------------");
				break;
			} else if (numeroSorteado != num){
				ganhou = false;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Que pena, voc� n�o acertou!");
				if(i!=1) {
					if(numeroSorteado>num) {
						System.out.println("O n�mero sorteado � maior que " +num);
						
					} else {
						System.out.println("O n�mero sorteado � menor que " +num);
					}
					System.out.println("Tente novamente, voc� tem " +(i-1)+ " chances.");
				}
				System.out.println("-----------------------------------------------------------");
			} 
		}
		if (ganhou == false) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("Infelimente suas chances acabaram e voc� n�o ganhou.");
			System.out.println("O n�emro sorteado era: " +numeroSorteado);
			entrada.close();
		} 
	}
}
