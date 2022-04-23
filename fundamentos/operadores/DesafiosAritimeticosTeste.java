package fundamentos.operadores;

public class DesafiosAritimeticosTeste {
	public static void main(String[] args) {
		//potencia
		
		int a = 3 * 4 -10;
		double b = Math.pow(a, 3); // usamos o math.pow para informar que o a estará elevado a 3
		int c = (int) Math.pow(a, 3); //podemos usar umas das duas formas
		
		System.out.println(b);
		System.out.println(c);
		
	}

}
