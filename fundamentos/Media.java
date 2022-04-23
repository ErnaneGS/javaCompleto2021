/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos 
números 4, 5 e 6. A soma das duas médias. A média das médias.*/

package fundamentos;

public class Media {

	public static void main(String[] args) {
		double media01 = (8+9+7)/3;
		double media02 = (4+5+6/3);
		double somMed = media01 + media02;
		double medMed = somMed/2;
		
		System.out.println("Média aritimética de 8, 9 e 7: " + media01);
		System.out.println("Média aritmética de 4, 5 e 6:" + media02);
		System.out.println("Soma das médias: " + somMed);
		System.out.println("Médias das medias: " + medMed);
		
	} 

}
