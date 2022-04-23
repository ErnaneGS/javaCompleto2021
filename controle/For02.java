//iremos criar um for que vai decrescer de 2 em 2 começando em 10 ate 0
package controle;

public class For02 {
	public static void main(String[] args) {
		
		for(int cont = 10; cont >= 0; cont -= 2) {
			System.out.println("Contador: " +cont);
		}
	}
}
