package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		//JOptionPane.showInputDialog recebe a entraada de um valor atraves
		//uma janela do java
		String valor = JOptionPane.showInputDialog("Informe o n�mero");
		
		//convertendo a String para int com o Integer.parseInt
		int numero = Integer.parseInt(valor);
		
		//Se o resto da divis�o de n�mero por 2 for igual a 0, par se 
		//n�o impar
		if( numero % 2 == 0 ) {
			System.out.println("N�mero par");
		} else {
			System.out.println("N�emro impar");
		}
	}
}
