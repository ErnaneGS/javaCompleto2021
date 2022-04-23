/*Informar um saldo e imprimir o saldo com reajuste de 1%.*/
package fundamentos;

import java.util.Scanner;

public class SaldoReajuste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- REAJUSTE DE SALDO A 1% ---");
		System.out.print("Informe o saldo a ser reajustado: ");
		double saldo = entrada.nextDouble();
		
		double saldoReaj = (saldo*1/100)+saldo;
		System.out.println("Saldo: " + saldo);
		System.out.printf("O saldo com reajuste de 1%% é igual a: %.2f", saldoReaj);
		entrada.close();
	}
}
