package fundamentos;

public class ObjetoVsPrimitivo {
	public static void main(String[] args) {
		String s = new String("Texto");
		s.toUpperCase();
		
		//wrappers é a versão para associação dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}

}
