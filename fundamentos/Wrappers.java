package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		// versão orientada a objetadas do tipo primitivo Wrappers
	
		Byte b = 1; //byte
		Short s = 1000; //short
		Integer i = 10000; // int
		Long l = 100000L; // long
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0f; //float
		System.out.println(f); 
		
		Double d = 1234.5678; //double
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true"); //boolean
		//iremos converter o boolean para string para podermos usar o toUpperCase
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c + "...");
		
	 }
}
