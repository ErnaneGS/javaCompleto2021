package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		//realizando a compara��o de String por meio do ===
		System.out.println("2" == "2"); //true - compara valores da vari�vel
		String s = new String("2");
		System.out.println("2" == s); // false compara o novo obejto string
		
		//realiadno a compara��o com o equals
		//sempre ser� anlisado o conte�do da vari�vel
		System.out.println("2".equals(s)); //true
		
		//definindo que o melhjor a ser usado na compara��ao de string � o 
		//equals, podemos acrescentar junto a ele o .trim(), que vai fazer a
		//compara��o desconsiderando os espa�os em branco
		
		Scanner entrada = new Scanner(System.in);
		String s2 = entrada.nextLine();
		System.out.println("2".equals(s2.trim()));

	}

}
