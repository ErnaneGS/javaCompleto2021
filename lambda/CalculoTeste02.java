package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste02 {

    public static void main(String[] args) {

        Calculo calc = (x, y) -> { return x + y; };
        System.out.println(calc.executar(2, 3));

        //aqui iremos substituir as funções (métoddos) implementados em nossa interface por uma
        //função do pacote java util, ou seja ja implemntada pelo java, nessas funções não poderemos usar
        // os primitivos, deveremos usar Classes (xdoublex Double)

        BinaryOperator<Double> calc2 = (x, y) -> { return x + y; };
        System.out.println(calc2.apply(2.0, 3.0));

        calc2 = (x, y) -> x * y;
        System.out.println(calc2.apply(2.0,3.0));

    }

}
