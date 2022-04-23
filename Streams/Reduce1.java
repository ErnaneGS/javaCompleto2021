package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        // Somar todos os elementos da lista usando o Reduce
        // podemos passar um valor inicial (ac) para que seja somado a cada elemento
        // e nos retorne o valor final

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        Integer total1 = nums.parallelStream().reduce(soma).get(); //ac =- 0
        System.out.println(total1); // total01 = 45

        Integer total2 = nums.stream().reduce(100, soma); //ac = 100
        System.out.println(total2); //total02 = 145

        // Resultado foi um Opcional<Integer>...
        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);
    }

}
