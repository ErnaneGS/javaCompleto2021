//N�o poderemos utilizar valor num�rico para controlar o la�o
package controle;

public class DesafioFor {
	public static void main(String[] args) {
		String valorLim = "######";
		
		//aqui geralmente usamos os valores num�ricos
		for(String i = "#";!i.equals(valorLim); i=i.concat("#")) {
			System.out.println(i);
		}
	}
}
