package lambda;

public class FPredicate {

    public static void main(String[] args) {

        Produto produto01 = new Produto("Notebook", 300.00, 0.15);

        //usar a function predicate para saber se um produto é caro ou não
        //todos os produtos com valor  acima de 715,00 reais serão caros
        java.util.function.Predicate<Produto> isCaro = prod -> (prod.preco > 715.0);

        //restando a função com o produto01
        System.out.println(isCaro.test(produto01));

    }
}
