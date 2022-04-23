package classesMetodos;

public class AreaCirc {
	double raio;
	//quando definimos o pi como static, uma vez o valor dele alterado, ser� alterado para todos
	//as suas instancias static double pi = 3.14;
	//quando declaramos o pi sendo static final o seu valor declarado na incializa��o continuar�
	//pertencedno a classe e n�o poder� ser mais alterado
	static final double PI = 3.14;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return raio * raio * PI;
		//ou podemos usar
		//return Math.pow(raio, 2) * pi;
	}
}
