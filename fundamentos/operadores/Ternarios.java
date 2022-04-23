package fundamentos.operadores;

public class Ternarios {

	public static void main(String[] args) {
		double media = 7.6;
		//na linha baixo temos uma variavel String declarada com uma exppressão
		//usamos tres operadores( >= // maior igual // ? interrogação // : casso contrario
		String resultado = media >=7.0? "Aprovado" : "Reprovado";
		System.out.println(resultado);
		
		double compra = 300;
		String desconto = compra >= 500? "Desconto aplicado" : "Desconto não aplicado";
		System.out.println(desconto);

	}

}
