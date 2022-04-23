package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		//usamos esse import do java para que possamos abrir uma janela
		//que irá receber os valores digitados
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número:");
		
		//nesse momento como temos uma string o + servirá de concatenação e não ocmo operador
		System.out.println(valor1 + valor2);
		
		//para  conversão da string para numeros fazemoso seguinte
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		//agora sim conseguiremos fazer a soma
		double soma = numero1 + numero2;
		
		System.out.println("A soma é: " + soma);
		System.out.println("A média é " + soma / 2);
	}
}
