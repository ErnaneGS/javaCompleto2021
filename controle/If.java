package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a m�dia do aluno: ");
		double media = entrada.nextDouble();
		
		//estrtura de controle if
		//entre parenteses colocamos uma express�o que deve retornar
		//verdadeiro ou falso
		if(media <= 10 && media >= 7) {
			System.out.println("Aprovado!");
			System.out.println("Parab�ns!");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("Recupera��o");
		}
		
		boolean critReprovacao = media < 4.5 && media >=0;
		if(critReprovacao) {
			System.out.println("Reprovado");
		}
		entrada.close();
	}

}
