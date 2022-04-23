package generics;

import jdk.jfr.Unsigned;

public class Caixa<T> {

    /* Quando criamos uma classe com <T> definimos que o tipo da
    classe será genérico, sendo informado no moemtno em que ela for
    usada ou através da herança /// T é o tipo da classe que ainda
    não foi definido
     */

    private T coisa;

    public void guardar(T coisa) {
        this.coisa = coisa;
    }

    public T abrir() {
        return coisa;
    }


}
