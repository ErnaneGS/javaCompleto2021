package lambda;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Produto p1 = new Produto("Ipad", 3235.89, 0.13);

        Function<Produto, Double> valorComDesconto = prod -> prod.preco - (prod.preco * prod.desconto); //2610,00

        UnaryOperator<Double> valorComDescontoEImpostoMun = valor -> valor >= 2500.00 ? valor += valor * 8.5 / 100 : valor; //2831.85

        UnaryOperator<Double> valorTotalComFrete = valor -> valor >= 3000.00 ? valor + 100.00 : valor + 50.0; //2881,85

        Function<Double, String> arredondarValor = valor -> String.format("%.2f", valor);

        Function<String,String> formatarValor = valor -> ("R$ " + valor).replace(".", ",");

        System.out.println("Valor Total do produto: "
                + valorComDesconto
                .andThen(valorComDescontoEImpostoMun)
                .andThen(valorTotalComFrete)
                .andThen(arredondarValor)
                .andThen(formatarValor)
                .apply(p1));
    }
}
