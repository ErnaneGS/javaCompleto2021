package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fsupplier {
    public static void main(String[] args) {

        //recebe uma ArrayList que ainda não foi implementada, sendo assim como ainda não temos parametros
        //temos que colocar os parenteses
        Supplier<List> lista = () -> Arrays.asList("Bia", "Gui", "Leo");
        System.out.println(lista.get());

    }
}
