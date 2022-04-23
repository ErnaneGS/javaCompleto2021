package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		//três principais formas de imprimir dados no console (out)
		System.out.println("Bom dia");
		System.out.print("Bom,");
		System.out.print("Dia");
		System.out.printf("Números da MegaSena %d %d %d %d %d %d %n" ,1,2,3,4,5,6);
		System.out.printf("Salário: %.1f %n", 1243.578); //usamos o %1.f para que seja representado apenas uma casa após a virgula
		
		//Recebendo dados atraves do in
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine(); //le o \n disparado ao clicar enter, o memso não é lido pelo nextInt()
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
	
		
		System.out.printf("%s %s tem %d anos de idadeErnane ", nome , sobrenome, idade);
		
		entrada.close(); //fechando a entrada de dados
	}

}
