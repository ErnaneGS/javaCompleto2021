
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
		System.out.println("Você terá 10 chaances para advinhar o número sorteado");
		
		for(int i = 10; i >= 1; i--) {
			System.out.print("Informe um número de 0 a 100:  ");
			int num = entrada.nextInt();
			if(numeroSorteado == num) {
				ganhou = true;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Parabéns você acertou!!!");
				System.out.println("O numéro sorteado foi " + numeroSorteado + 
						" e você escolheu o número " +num+" na " +i+" tentativa." );
				System.out.println("-----------------------------------------------------------");
				break;
			} else if (numeroSorteado != num){
				ganhou = false;
				System.out.println("-----------------------------------------------------------");
				System.out.println("Que pena, você não acertou!");
				if(i!=1) {
					if(numeroSorteado>num) {
						System.out.println("O número sorteado é maior que " +num);
						
					} else {
						System.out.println("O número sorteado é menor que " +num);
					}
					System.out.println("Tente novamente, você tem " +(i-1)+ " chances.");
				}
				System.out.println("-----------------------------------------------------------");
			} 
		}
		if (ganhou == false) {
			System.out.println("-----------------------------------------------------------");
			System.out.println("Infelimente suas chances acabaram e você não ganhou.");
			System.out.println("O núemro sorteado era: " +numeroSorteado);
			entrada.close();
		} 
	}
}
