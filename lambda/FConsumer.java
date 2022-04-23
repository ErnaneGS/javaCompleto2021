package lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class FConsumer {
    public static void main(String[] args) {

        Produto prod01 = new Produto("Notebook", 300.00, 0.15);
        Produto prod02 = new Produto("Celular", 300.00, 0.15);
        Produto prod03 = new Produto("Impressora", 300.00, 0.15);

        Consumer<Produto> imprimir = prod -> System.out.println(prod.nome + " " + prod.preco);
        imprimir.accept(prod01);

        List<Produto> produtos = Arrays.asList(prod01, prod02, prod03);
        //usando o consumer na lista de produtos
        produtos.forEach(imprimir);

    }
}
