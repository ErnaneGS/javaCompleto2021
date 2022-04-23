package classesMetodos;

public class Produto {
	//atributos
	String nome;
	double preco;
	//neste momento quando passamos o desconto para static, deveremos acessalo usando a classe e n�o as instancias
	static double desconto = 0.25;
	
	//Construtor
	public Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//Construtor padr�o explicito, ao criar um construtor na classe se quisermos utilizar o padr�o devemos
	//rescrever ele, explicito
	Produto(){
		
	}
	
	//somente iremos passar parametos ao m�todo que ainda n�o foram declarados na classe
	double precoComDesconto() {
		return preco *(1-desconto);
	}
	//em java o retorno e os par�mtros dos m�tos � uma identidade, assim � imposs�vel criar mais de 
	//umn m�todo com a mesma identidade
	
	double preComDesconto(double descontoDoGerente) {
		return preco *(1-desconto+descontoDoGerente);
	}
}
