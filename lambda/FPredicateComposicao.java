package lambda;

import java.util.function.Predicate;

public class FPredicateComposicao {
    public static void main(String[] args) {

        //predicate retorna boolean

        Predicate<Integer> isPar = num -> num % 2 == 0;

        Predicate<Integer> isTresDig = num -> num >= 100 && num < 999;

        System.out.println(isTresDig.test(221));
        System.out.println(isPar.test(221));

        //domposição das funções isPar e isTresDig
        System.out.println(isPar.and(isTresDig).test(221));
        System.out.println(isPar.or(isTresDig).test(221));
    }
}
