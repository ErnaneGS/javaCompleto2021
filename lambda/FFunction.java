package lambda;

import java.util.function.Function;

public class FFunction {
    public static void main(String[] args) {

        Function<Integer, String> parImpar = numero -> numero % 2 == 0 ? "O numero é par" : "O numero e impar";
        //System.out.println(parImpar.apply(5));

    }
}

