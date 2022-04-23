/* Crie um programa para receber tr�s sal�rio no tipo String, aceitando o valor tanto
 *  em virgula ou ponto, e depois deveremos apresentar a m�dia destes tr�s sal�rios.
 */

package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		String salario01;
		String salario02;
		String salario03;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- CALCULOS SALARIAL ---");
		System.out.println("Informe o primeiro sal�rio: ");
		salario01  = entrada.nextLine().replace(",","."); //replace substiui virgula por ponto
		System.out.println("Informe o segundo sal�rio: ");
		salario02 = entrada.nextLine().replace(",",".");
		System.out.println("Informe o terceiro sal�rio: ");
		salario03 = entrada.nextLine().replace(",",".");
		
		entrada.close();
		
		System.out.printf(" O sal�rio 01 � igual a %s reais\n O sal�rio 02 � igual a %s reais\n O salario 03 � igual a %s reais." ,salario01, salario02, salario03);
		
		//convers�o de String para inteiro
		double sal01 = Double.parseDouble(salario01);
		double sal02 = Double.parseDouble(salario02);
		double sal03 = Double.parseDouble(salario03);
	
		System.out.println("\nA m�dia dos sal�rios informados �: "
		+ ((sal01 + sal02 + sal03) / 3));
	}
}
