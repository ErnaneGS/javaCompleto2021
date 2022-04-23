package lambda;

import java.util.function.UnaryOperator;

public class OpeardorUnario {
    public static void main(String[] args) {

        //o tipo de parametro que passamos é o que teremos de  retorno
        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> quadrado = n -> n * n;

        System.out.println(maisDois.andThen(vezesDois.andThen(quadrado)).apply(2));
    }

}
