/*
 * 4. Criar um programa que receba um número e 
 * diga se ele e�? um número primo.
 */

package controle.exercicios;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- NÚMEROS PRIMOS ---");
		System.out.println("Informe o número: ");
		double num = entrada.nextDouble();
		boolean primo = (num%2==0);
		
		System.out.println("O número " +num+ " é primo ? " +primo);
		
		entrada.close();
	}
}
