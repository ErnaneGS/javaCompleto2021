/*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e 
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. 
(Ex: 3 anos, 2 meses e 15 dias = 1170 dia*/
package fundamentos;

import java.util.Scanner;

public class IdadeDias {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("-- CALCULO DE IDADE EM DIAS ---");
		System.out.println("Informe a sua idade no formato: ");
		System.out.print("Amos: ");
		int anos = entrada.nextInt();
		System.out.print("Meses: ");
		int meses = entrada.nextInt();
		System.out.print("Dias: ");
		int dias = entrada.nextInt();
		
		int anosDias = anos*365;
		int mesesDias = meses*30;
		
		int idDias = anosDias + mesesDias + dias;
		System.out.println("Considerando a sua idade de " + anos + " anos " + meses + " meses e " + dias + " dias.");
		System.out.printf("Você ja viveu %d dias.", idDias);
		entrada.close();
	}
}
