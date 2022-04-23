package classesMetodos;

public class EqualsHashcode {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Silva";
        u1.email = "email.com.br";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Silva";
        u2.email = "email.com.br";

        //comparações dos objetos
        System.out.println(u1 == u2); //false, pois == compara local de memória
        System.out.println(u1.equals(u2)); //false, pois como o metodo n foi implementado ele irá funcionar como o ==


    }
}