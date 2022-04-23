package generics;

public class CaixaTeste {

    public static void main(String[] args) {

        /* ao isntanciar o objeto generics e não informa o seu tipo
        por padrão ele recebe op tipo de objects
         */

        Caixa<String> caixaA = new Caixa<>();
        caixaA.guardar("Segredo!");

        String coisaA = caixaA.abrir();
        System.out.println(coisaA);

        Caixa<Double> caixaB = new Caixa<>();
        caixaB.guardar(3.1415);

        Double coisaB = caixaB.abrir();
        System.out.println(coisaB);

    }
}
