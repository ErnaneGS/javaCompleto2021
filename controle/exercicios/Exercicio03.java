/*
 * 3. Criar um programa que receba duas notas parciais, calcular a
 *me�?dia final. Se a nota do aluno for maior ou igual a 7.0 imprime
 *no console "Aprovado", se a nota for menor que 7.0 e maior do que
 *4.0 imprime no console "Recuperação", caso contra�?rio imprime no
 *console "Reprovado".
 */
package controle.exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-- CALCULO DE MEDIA ---");
		System.out.print("Informe a primeira nota parcial: ");
		double nota01 = entrada.nextDouble();
		System.out.print("Informe a segunda nota parcial: ");
		double nota02 = entrada.nextDouble();
		double media = (nota01 + nota02) / 2;
		
		if(media >= 7 && media <= 10) {
			System.out.println("Aluno aprovado!");
		} else if (media >= 4 && media < 7) {
			System.out.println("Aluno em recuperação!");
		} else if (media >= 0 && media < 4) {
			System.out.println("Aluno reprovado!");
		} else {
			System.out.println("Nota informada inválida!");
		}
		entrada.close();
	}
}
