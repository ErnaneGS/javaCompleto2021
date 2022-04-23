package fundamentos.exercicios;

import java.util.Scanner;


public class Imc {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- CALCULANDO IMC ---");
		System.out.print("Informe o peso: ");
		double peso = entrada.nextDouble();
		System.out.print("Informe a altura: ");
		double altura = entrada.nextDouble();
		
		double imc = peso/(altura * altura);
		System.out.println(imc);
		System.out.printf("IMC: %.2f ", imc);
		
		entrada.close();
	}

}
