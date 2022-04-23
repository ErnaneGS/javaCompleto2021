package fundamentos.exercicios;

import java.util.Scanner;

public class Potencia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("-- CALCULANDO ---");
		System.out.println("- Calculando o quadrado e o cubo");
		System.out.print("Informe o número: ");
		double numero = entrada.nextDouble();
		
		double resultado2 = Math.pow(numero, 2);
		double resultado3 = Math.pow(numero, 3);
		
		System.out.printf("%.2f elevado a 2 é igual a: %.2f \n", numero, resultado2);
		System.out.printf("%.2f elevado a 3 é igual a: %.2f", numero, resultado3);
		
		entrada.close();
		
	}

}
