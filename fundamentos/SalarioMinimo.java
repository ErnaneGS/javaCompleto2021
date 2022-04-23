/* Crie um algoritmo que leia o valor do sal?rio m?nimo e o valor do sal?rio de um usu?rio,
calcule a quantidade de sal?rios m?nimos esse usu?rio ganha e imprima o resultado.
(1SM=R$788,00)*/
package fundamentos;

import java.util.Scanner;

public class SalarioMinimo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("---SALÁRIO MÍNIMO ---");

		System.out.print("Informe o valor do salário mínimo:");
		double salarioMin = scanner.nextDouble();

		System.out.print("Informe o seu salário: ");
		double salario = scanner.nextDouble();

		//COMPREENSAO ACIMA DE TUDO(INCLUINDO NOMES LONGOS)
		//SIMPLICIDADE ACIMA DE COMPLEXO
		double multiplicadorSalarioMinimo = salario / salarioMin;
		
		System.out.printf("Você recebe %.2f que equivale a: %.1f salários mínimos.", salario, multiplicadorSalarioMinimo);

		scanner.close();
	}
}
