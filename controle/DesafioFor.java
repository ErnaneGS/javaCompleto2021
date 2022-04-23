//Não poderemos utilizar valor numérico para controlar o laço
package controle;

public class DesafioFor {
	public static void main(String[] args) {
		String valorLim = "######";
		
		//aqui geralmente usamos os valores numéricos
		for(String i = "#";!i.equals(valorLim); i=i.concat("#")) {
			System.out.println(i);
		}
	}
}
