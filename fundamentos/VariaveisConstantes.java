package fundamentos;

import java.util.Scanner;

public class VariaveisConstantes {
	public static void main(String[] args) {
		final String mensagem = "Seja bem vindo "; //constante final
		String nome = "Ernane"; //variavel.
		
		System.out.println(mensagem + nome);
		
		//inferencia
		System.out.println("O resultado poderá ser: Bom // Ótimo // Ruim // 0 // 5 // 10");
		var resultado = 5; //inferencia
		System.out.println(resultado);
		resultado = 10; //após incializada o seu tipo não pd ser alterado
		
		final var resultado1 = 5; //final e inferencia
		
		//notação ponto
		nome = nome.toUpperCase();
		nome = nome.replace("E", "i");
		System.out.println(nome);
		
		//tipo string
		String nome1 = "Ernane";
		String nome2 = "Ernane";
		int name = 12322;
		System.out.println(nome1.equals(nome2));
		
		String nome3 = "geralda";
		String nome4 = "GERALDA";
		System.out.println(nome3.equalsIgnoreCase(nome4));
		
		System.out.println(nome1.concat(nome4.concat(nome2)));
		
		String.valueOf(name); //passando o int name para string
	

		
	
		
	}

}
