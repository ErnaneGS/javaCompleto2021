/*Fazer um programa que imprima a m�dia aritm�tica dos n�meros 8,9 e 7. A m�dia dos 
n�meros 4, 5 e 6. A soma das duas m�dias. A m�dia das m�dias.*/

package fundamentos;

public class Media {

	public static void main(String[] args) {
		double media01 = (8+9+7)/3;
		double media02 = (4+5+6/3);
		double somMed = media01 + media02;
		double medMed = somMed/2;
		
		System.out.println("M�dia aritim�tica de 8, 9 e 7: " + media01);
		System.out.println("M�dia aritm�tica de 4, 5 e 6:" + media02);
		System.out.println("Soma das m�dias: " + somMed);
		System.out.println("M�dias das medias: " + medMed);
		
	} 

}
