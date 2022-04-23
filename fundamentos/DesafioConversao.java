/* Crie um programa para receber três salário no tipo String, aceitando o valor tanto
 *  em virgula ou ponto, e depois deveremos apresentar a média destes três salários.
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
		System.out.println("Informe o primeiro salário: ");
		salario01  = entrada.nextLine().replace(",","."); //replace substiui virgula por ponto
		System.out.println("Informe o segundo salário: ");
		salario02 = entrada.nextLine().replace(",",".");
		System.out.println("Informe o terceiro salário: ");
		salario03 = entrada.nextLine().replace(",",".");
		
		entrada.close();
		
		System.out.printf(" O salário 01 é igual a %s reais\n O salário 02 é igual a %s reais\n O salario 03 é igual a %s reais." ,salario01, salario02, salario03);
		
		//conversão de String para inteiro
		double sal01 = Double.parseDouble(salario01);
		double sal02 = Double.parseDouble(salario02);
		double sal03 = Double.parseDouble(salario03);
	
		System.out.println("\nA média dos salários informados é: "
		+ ((sal01 + sal02 + sal03) / 3));
	}
}
