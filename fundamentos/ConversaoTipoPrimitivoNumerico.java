package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		//aqui temos uma variavel do tipo double com o valor inteiro, onde acontece
		//aconversão de interio para double de forma implicita, sem problemas.
		double a = 1;
		
		//aqui temos uma variavel do tipo float e um valor double, dessa forma iremos 
		//converter de double para float de forma explicita..
		float b = (float) 1.24;
		
		//Aqui estamos atribuindo o  valor de c int para d que é byte.
		int c = 4;
		byte d = (byte)c;
		
		double e = 1;
		int f = (int) e;

		
		System.out.printf(" Valor de a: %s\n Valor de b: %s\n Valor de c: %s\n Valor de d: %s\n Valor de e: %s\n Valor de f: %s\n" ,a,b,c,d,e,f );
		
		
	}

}
