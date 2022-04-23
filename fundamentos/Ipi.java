/*Escrever um algoritmo que l�:
- a porcentagem do IPI a ser acrescido no valor das pe�as
- o c�digo da pe�a 1, valor unit�rio da pe�a 1, quantidade de pe�as 1
- o c�digo da pe�a 2, valor unit�rio da pe�a 2, quantidade de pe�as 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
F�rmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1*/

package fundamentos;

import java.util.Scanner;

public class Ipi {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("--- CALCULANDO VALOR COM IPI ---");
		System.out.print("Informe a % de IPI a ser acrecido no valor das pe�as: ");
		double ipi = entrada.nextDouble();

		System.out.print("Informe o c�digo da pe�a 01: ");
		int codPeca1 = entrada.nextInt();

		System.out.print("Informe o valor unit�rio da pe�a 01: ");
		double valorUnit1 = entrada.nextDouble();

		System.out.print("Informe a quantidade de pe�as 01: ");
		int qntdPeca1 = entrada.nextInt();

		System.out.println("--- --- ---");
		System.out.print("Informe o c�digo da pe�a 02: ");
		int codPeca2 = entrada.nextInt();

		System.out.print("Informe o valor unit�rio da pe�a 02: ");
		double valorUnit2 = entrada.nextDouble();

		System.out.print("Informe a quantidade de pe�as 02: ");
		int qntdPeca2 = entrada.nextInt();
		
		double valorTot = (valorUnit1*qntdPeca1 + valorUnit2 * qntdPeca2) * ( ipi / 100 + 1);
		
		System.out.println("-------------------------------------");
		System.out.println("----------C�LCULO TOTAL--------------");
		System.out.println("-------------------------------------");
		System.out.printf("C�d.: %d -- Qtd.: %d -- Valor: %.2f\n", codPeca1, qntdPeca1, valorUnit1);
		System.out.printf("C�d.: %d -- Qtd.: %d -- Valor: %.2f\n", codPeca2, qntdPeca2, valorUnit2);
		System.out.println("-------------------------------------");
		System.out.printf("IPI %.2f %%\n", ipi);
		System.out.println("-------------------------------------");
		System.out.printf("Valor total: %.2f\n ",valorTot);
		entrada.close();
	}
}
