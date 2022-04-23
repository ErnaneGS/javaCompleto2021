package classesMetodos;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; //atribui��o por valor (tipo primitivo)
		a++;
		b--;
		System.out.println(a + "---" + b);
		
		Data d1 = new Data(8, 1, 1999);
		Data d2 = d1; //atribui��o por refer^cnia (objeto)
		
		//como a atribui��o � por refer�ncia, tanto d1 quanto d2 aponta para o mesmo objeto
		//assim alterando qualquer um deles impacta nos dois.
		d1.ano=2015;
		d2.mes=01;
		
		System.out.println(d1.obterDataFormatada() + "---" + d2.obterDataFormatada());
	}

}
