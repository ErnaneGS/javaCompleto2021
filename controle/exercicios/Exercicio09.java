package controle.exercicios;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		double maiorNum = 0;
		Scanner entrada = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			System.out.print("Informe o núemro " +(i+1));
			double num = entrada.nextDouble();
			if(num > maiorNum){
				maiorNum = num;
			}
		}
		System.out.println("O maior número digitado foi: " +maiorNum);
		entrada.close();
	}
}
