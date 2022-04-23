package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		int a = 1;
		int b = a;
		System.out.println("------");
		System.out.println(a);
		System.out.println(b);
		
		a++; //a = a + 1
		System.out.println("------");
		System.out.println(a);
		a--; //a = a - 1
		System.out.println("------");
		System.out.println(a);
	
		--b; //b = b - 1
		System.out.println("------");
		System.out.println(b);
		++b; //b = b + 1
		System.out.println("------");
		System.out.println(b);	

	}

}
