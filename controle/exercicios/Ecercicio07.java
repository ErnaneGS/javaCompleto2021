package controle.exercicios;

import java.util.Scanner;

public class Ecercicio07 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- N�MEROS POSITIVOS ---");
		double total = 0;
		double numero = 0;
		
		while(numero >= 0) {
			System.out.print("Informe o n�mero: ");
			numero = entrada.nextDouble();
			if(numero > 0) {
				total = total + numero;
			}
		}
		System.out.println("Soma dos n�emros inseridos: " + total);
		entrada.close();
		
	}

}
