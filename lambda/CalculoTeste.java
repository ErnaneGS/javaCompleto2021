package lambda;

public class CalculoTeste {
    public static void main(String[] args) {

        //aqui iremos definir uma variável do tipo da imterface e usaremos a função para executar o
        //método da interface

        Calculo calc = (x, y) -> { return x + y; };
        System.out.println(calc.executar(2, 3));

        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2,3));

    }
}