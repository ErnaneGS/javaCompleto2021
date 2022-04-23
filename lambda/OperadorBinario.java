package lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

        Function<Double, String> conceito = n -> n >= 7 ? "Aprovado" : "Reprovado";

        //agora iremos passar a nossa função de media para conceito (composição)
        System.out.println(media.andThen(conceito).apply(9.7, 4.1));

        //se quisermnos receber dois valores calcular a media e dizer se esta aprovado na mesma função
        //podemos usar o Bifunction
        BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado.apply(1.8, 5.7));

    }
}