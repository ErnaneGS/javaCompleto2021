package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//informações do funcionario
		
		//tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//tipos numéricos (flutuantes)
		float salario = 11_445.44f;
		double vendasAcumuladas = 2_991_797_183.81;
		
		//tipo booleano
		boolean estaDeFerias = false; //ou true
		
		//tipo caractere
		char status = 'A'; // ou ATIVO
		
		//Dias de empresa
		System.out.println("O profissional em questão possui " + 23 * anosDeEmpresa + " anos de empresa.");
		
		//Núemros de viagens
		System.out.println("O profissional fez " + numeroDeVoos / 2 + " viagens.");
		
		//Pontos por real 
		System.out.println("O profissional tem " +  pontosAcumulados / vendasAcumuladas + " pontos.");
		
		System.out.println("O profissional de ID " + id + " ganha um salário de " + salario + " reais.");
		System.out.println("Esta de férias? " + estaDeFerias);
		System.out.println("Status do profissional: " + status);

	}

}
