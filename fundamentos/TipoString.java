package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		
		Integer i = 10;
		System.out.println(i);
		String nome02;
		String nome01;
		
		//equals e equals.IgnoreCase
		nome01 = "Maria";
		nome02 = "maria";
		System.out.println(nome01.equalsIgnoreCase(nome02));
		
		nome01 = "Mariana";
		nome02 = " Maria";
		
		//CompareTo numero negativo nome02 maior // positivo numero 01 maior
		System.out.println(nome02.compareToIgnoreCase(nome01));
		
		//concat
		String nomeCompleto = nome01 + nome02;
		String nomeCompleto02 = nome01.concat(nome02);
		
		System.out.println(nomeCompleto02);
		System.out.println(nomeCompleto);
		
		int nome001 = 12345;
		float nome002 = 123335.222f;
		
		System.out.println(nome001);
		System.out.println(nome002);
		
	}

}
