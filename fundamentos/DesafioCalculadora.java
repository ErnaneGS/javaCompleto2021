package fundamentos;
import java.util.Scanner;

public class DesafioCalculadora {

	private Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		DesafioCalculadora desafioCalculadora = new DesafioCalculadora();
		desafioCalculadora.execute();
	}

	private void execute(){

		double num01;
		double num02;
		String operacao;
		double resultado;

		apresentacaoCalculadora();

		num01 = Double.parseDouble( lerDados("Informe o primeiro número: ") );
		num02 = Double.parseDouble( lerDados("Informe o segundo número: ") );
		operacao = escolherOperacao();
		resultado = realizarOperacao(num01, num02, operacao);

		System.out.printf("%.2f %s %.2f = %.2f " ,num01 ,operacao, num02 ,resultado);
	}

	private double realizarOperacao(double num01, double num02, String operacao) {
		double resultado;

		resultado = "+".equals(operacao) ? num01 + num02 : 0;
		resultado = "-".equals(operacao) ? num01 - num02 : resultado;
		resultado =	"*".equals(operacao) ? num01 * num02 : resultado;
		resultado =	"/".equals(operacao) ? num01 / num02 : resultado;
		resultado =	"%".equals(operacao) ? num01 % num02 : resultado;

		return resultado;
	}

	private void apresentacaoCalculadora() {
		escreverTexto("------ CALCULADORA ------");
	}

	private void escreverTexto(String texto){
		System.out.println(texto);
	}

	private String lerDados(String msg){
		escreverTexto(msg);

		String dado = scanner.nextLine();

		return dado;
	}

	private String escolherOperacao(){
		escreverTexto("Escolha qual das opera��es deseja fazer: ");
		escreverTexto("Soma ( + ) ");
		escreverTexto("Subtra��o ( - ) ");
		escreverTexto("Multiplica��o ( * ) ");
		escreverTexto("Divis�o ( / ) ");
		escreverTexto("M�dulo ( % ) ");

		String operacao = lerDados("");

		return operacao;
	}
}
