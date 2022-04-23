package controle;

public class For01 {
	public static void main(String[] args) {
		
		/*int contador = 0;
		while(contador <= 10) {
			System.out.println("Olá Bom dia!");
			contador ++;
		} */
		
		//No for sempre passaremos tres referências, 
		//01 definição da variável 02 expressão 03 incremento
		for(int contador = 0; contador <= 10; contador++) {
			System.out.println("Olá Bom dia!");
		}
		
		/*
		//porém as referências não precisam estar exatamente dentro do for
		int x = 2;
		for(; x < 10;) {
			System.out.println("Seja bem vindo!");
			x++;
		}
		
		//laço infinito
		for(; ;) {
			System.out.println("xxx");
		}  */
		
	}
}
