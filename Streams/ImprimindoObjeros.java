package Streams;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjeros {
    public static void main(String[] args) {

        List<String> aprovados = new ArrayList<>();
        //usando strean para imprimir os objetos da lista
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }
}
