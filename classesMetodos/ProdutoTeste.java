package classesMetodos;

import java.util.Scanner;

public class ProdutoTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	//criamos uma classe com o tipo produto e agora iremos instancia-la criando os objetos
	
		//Messe momento ao criar o novo produto deveremos usar um dos tipos de construtores
		//da classe, seja ele o padr�o sem parametros ou o com parametross criado.
		//cria��o de produto com o construtos padr�o
		Produto p1 = new Produto();
		System.out.print("Informe o nome do produto: ");
		p1.nome = entrada.next();
		System.out.print("Informe o valor do produto: ");
		p1.preco = entrada.nextDouble();
		//System.out.print("Informe o desconto em % a ser aplicado no produto: ");
		//p1.desconto = entrada.nextDouble()/100;
		System.out.println("--- --- ---");
		
	//podemos criar um novo objeto por meio da inferencia, que ir� instanciar o tipo, nesse caso o produto
		
		var p2 = new Produto("Celular", 2500.00);
		//System.out.print("Informe o nome do produto: ");
		//p2.nome = entrada.next();
		//System.out.print("Informe o valor do produto: ");
		//p2.preco = entrada.nextDouble();
		//System.out.print("Informe o desconto em % a ser aplicado no produto: ");
		//p2.desconto = entrada.nextDouble()/100;
		//System.out.println("--- --- ---");
		
		//usando a clase produto para alterar o valor de desconto que � static a classe produto
		//nesse momento o desconto de p1 e p2 e qualquer outrto que seja instanciado passa a ser 30%.
		Produto.desconto = 0.30;
		
		//o c�lculo do pre�o final � igual ao m�todo de desconto da classe produto
		double precoFinalP1 = p1.precoComDesconto();
		double precoFinalP2 = p2.precoComDesconto();
		
		System.out.println("--- CARRINHO DE COMPRAS ---");
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("Produto: %s Valor: R$ %.2f Desconto: %.2f %% Valor final: %.2f\n", p1.nome, p1.preco, (Produto.desconto*100), precoFinalP1);
		System.out.printf("Produto: %s Valor: R$ %.2f Desconto: %.2f %% Valor final: %.2f\n", p2.nome, p2.preco, (Produto.desconto*100), precoFinalP2);
		System.out.println("-------------------------------------------------------------------");
		System.out.printf("Valor total do carrinho R$ %.2f\n", precoFinalP1 + precoFinalP2);
		System.out.println("-------------------------------------------------------------------");
		entrada.close();
	}
}
