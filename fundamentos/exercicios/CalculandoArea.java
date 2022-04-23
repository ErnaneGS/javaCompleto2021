package fundamentos.exercicios;

import java.util.Scanner;

public class CalculandoArea {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- CALCULANDO AREA ---");
		System.out.print("Informe a base do triangulo: ");
		double base = entrada.nextDouble();
		System.out.print("Informe a altura do triangulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base*altura)/2;
		
		System.out.println("A area do triângulo é " + area);
		
		entrada.close();
	}
}
