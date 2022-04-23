package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		//para a conversão de número para String podemos usar o Wrappers
		//abaixo pegamoso num1 convertemos para toString e assim ja podemos usar o 
		//lenggth que é uma função específica para tipos não primitivos como o String
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		//abaixo declaramos a variavel do tipo inteiro, para que consigamos converter a mesma
		//para o tipo String primeiro devemos converte-la para o wraooers integer e somente
		//depois para o toString
		 int num2 = 10000;
		 System.out.println(Integer.toString(num2).length());
		 
		 System.out.println();
	}

}
