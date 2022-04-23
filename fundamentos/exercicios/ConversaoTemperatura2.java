package fundamentos.exercicios;

import java.util.Scanner;
public class ConversaoTemperatura2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- CONVERSOR DE TEMPERATURA ---");
		System.out.println("-Conversão de Celsius para Fahrenheit ");
		System.out.print("Informe a temperaatura em Celsius: ");
		double temperaturaC = entrada.nextDouble();
		
		double temperaturaF = (temperaturaC * 1.8000 + 32);
		
		System.out.printf("A temperatura de %.2f graus Celsius "
				+ "e igual a %.2f graus Fahrenheit.", temperaturaC, temperaturaF);
		
		entrada.close();
		
	}
}
