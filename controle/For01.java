package controle;

public class For01 {
	public static void main(String[] args) {
		
		/*int contador = 0;
		while(contador <= 10) {
			System.out.println("Ol� Bom dia!");
			contador ++;
		} */
		
		//No for sempre passaremos tres refer�ncias, 
		//01 defini��o da vari�vel 02 express�o 03 incremento
		for(int contador = 0; contador <= 10; contador++) {
			System.out.println("Ol� Bom dia!");
		}
		
		/*
		//por�m as refer�ncias n�o precisam estar exatamente dentro do for
		int x = 2;
		for(; x < 10;) {
			System.out.println("Seja bem vindo!");
			x++;
		}
		
		//la�o infinito
		for(; ;) {
			System.out.println("xxx");
		}  */
		
	}
}
