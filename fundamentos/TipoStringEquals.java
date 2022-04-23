package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		//realizando a comparação de String por meio do ===
		System.out.println("2" == "2"); //true - compara valores da variável
		String s = new String("2");
		System.out.println("2" == s); // false compara o novo obejto string
		
		//realiadno a comparação com o equals
		//sempre será anlisado o conteúdo da variável
		System.out.println("2".equals(s)); //true
		
		//definindo que o melhjor a ser usado na comparaçãao de string é o 
		//equals, podemos acrescentar junto a ele o .trim(), que vai fazer a
		//comparação desconsiderando os espaços em branco
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.nextLine();
		System.out.println("2".equals(s2.trim()));

	}

}
