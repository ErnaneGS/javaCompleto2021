package controle;

public class Break02 {
	public static void main(String[] args) {
//Nesse caso iremos rotular os nossos for com um nome para que o break saia do for retulado
//Caso não rotule o for o break irá encerrar o for em que ele esta
		
		externo: for(int i = 0; i < 3; i ++) { //for rotulado
			for(int j = 0; j < 3; j ++) {
				if(i == 1) {
					break externo;
				}
				System.out.println(i + "--" + j);
			}
		}
	}
}
