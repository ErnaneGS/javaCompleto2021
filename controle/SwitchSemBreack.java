package controle;

import java.util.Scanner;

public class SwitchSemBreack {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- SIGNIFICADO DAS CORES DA BANDEIRA ---");
		System.out.println("CORES: Verde // Azul // Amarelo");
		System.out.println("Qual das cores voc� deseja saber o significado?");
		String cor = entrada.nextLine();
		
		//Como estamo usando o switch ele ir� executar todas os casos sem parar
		//mesmo encontrando o correspondente
		switch(cor.toLowerCase()) {
		case "azul":
			System.out.println("Azul significa C�u");
		case "amarelo":
			System.out.println("Amarelo significa ouro e riquezas");
		case "verde":
			System.out.println("Verde significa natureza");
		default:
			System.out.println("Cor inv�lida.");
		}
		entrada.close();
	}
}
