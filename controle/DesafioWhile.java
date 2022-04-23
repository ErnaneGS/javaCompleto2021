/*Calcular a m�dia das notas de alunos da turma, o 
 *usu�rio vai digitar uma nota v�lida que � de 0 a 10
 *somar com o total, e armazenar a quantidade de notas
 *v�lidas digitadas, quando o usu�rio digitar -1
 *ele quer sair do la�o e mostrar a m�dia */

package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("--- CALCULANDO A M�DIA DE NOTAS ---");
		
		double nota = 0;
		double totNotas =0;
		int quantNotas = 0;
		double media = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota (ou -1 para sair): ");
			nota = entrada.nextDouble();
			if(nota >= 0 && nota <=10) {
				totNotas += nota;
				quantNotas++;
			}else if(nota != -1) {
				System.out.println("Nota inv�lida!");
			}
		}

		if(quantNotas == 0){
			media =0;
		} else {
			media = totNotas/quantNotas;
		}

		System.out.printf("A m�dia das %d notas � igual a: %.2f"
				, quantNotas, media);
		entrada.close();
	}
}