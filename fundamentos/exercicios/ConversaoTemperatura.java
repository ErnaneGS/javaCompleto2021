package fundamentos.exercicios;

import java.util.Scanner;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- CONVERSOR DE TEMPERATURA ---");
		System.out.println("-Conversão de Fahrenheit para Celsius ");
		System.out.print("Informe a temperaatura em Fahrenheit: ");
		double temperaturaF = entrada.nextDouble();
		
		double temperaturaC = (temperaturaF-32)/1.8000;
		
		System.out.printf("A temperatura de %.2f graus Fahrenheit "
				+ "e igual a %.2f graus celsius.", temperaturaF, temperaturaC);
		
		entrada.close();
		
	}

}
