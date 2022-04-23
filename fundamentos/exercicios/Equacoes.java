package fundamentos.exercicios;

import java.util.Scanner;

public class Equacoes {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- EQUA��ES ---");
		System.out.print("Informe o valor de A: ");
		double a = entrada.nextDouble();
		System.out.print("Informe o valor de B: ");
		double b = entrada.nextDouble();
		System.out.print("Informe o valor de C: ");
		double c = entrada.nextDouble();
		
		double delta = (b * b) - (4 * a * c);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equa��o �: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		
		System.out.println("O Delta da equa��o � igual a: " + delta);
		System.out.println("X1: " + x1);
		System.out.println("X2: " + x2);
		
		entrada.close();
	}
	

}
