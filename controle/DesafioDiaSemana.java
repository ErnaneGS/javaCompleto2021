package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// Iremos digitar um dia da semana e o sistema
		// ir� retornar um valor espec�fico para cada dia da semana

		Scanner entrada = new Scanner(System.in);
		System.out.println("--- DIAS DA SEMANA ---");
		System.out.print("Informe o dia da semana desejado: ");
		String dia = entrada.next();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if(dia.equalsIgnoreCase("ter�a")
				|| dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if(dia.equalsIgnoreCase("Sabado")
				|| dia.equalsIgnoreCase("s�bado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inv�lido");
		}
		
		entrada.close();
	}

}
