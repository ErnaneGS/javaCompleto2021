/*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
antecessor e seu sucessor*/
package fundamentos;

import java.util.Scanner;

public class NumeroInteiro {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe um número inteiro: ");
		int numero = entrada.nextInt();
		
		System.out.println("Antecessor de " + numero + " é igual a: " + (numero-1));
		System.out.println("Sucessor de " + numero + " é igual a: " + (numero+1));
		entrada.close();
	}

}
