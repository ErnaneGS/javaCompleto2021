package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		//usamos esse import do java para que possamos abrir uma janela
		//que ir� receber os valores digitados
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro n�mero:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo n�mero:");
		
		//nesse momento como temos uma string o + servir� de concatena��o e n�o ocmo operador
		System.out.println(valor1 + valor2);
		
		//para  convers�o da string para numeros fazemoso seguinte
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		//agora sim conseguiremos fazer a soma
		double soma = numero1 + numero2;
		
		System.out.println("A soma �: " + soma);
		System.out.println("A m�dia � " + soma / 2);
	}
}
