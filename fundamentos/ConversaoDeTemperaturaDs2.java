package fundamentos;

//F�rmula para calcular a divis�o
//(F - 32) * 5/9 = C
//Desafio 02 - convers�o de fahremheit para Celsius

public class ConversaoDeTemperaturaDs2 {

	public static void main(String[] args) {
		double f = 86;
		double c;
		final double x = 5.0 / 9.0;
		final double y = 32;
		
		c = (f - y) * x;
		
		System.out.println("--- CONVERS�O DE TEMPERATURA ---");
		System.out.println("A temperatura de " + f + " graus fahrenheit �" + " igual a " + c + " graus celsius" );
	
	}

}
