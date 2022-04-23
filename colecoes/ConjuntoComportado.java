package colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        //Set lista = new HashSet(); pode ser criado dessa forma

        //quando colocamos o <> iremos informar o tipo de dados do set
        HashSet<String> lista = new HashSet<>();
        lista.add("Ernane");
        lista.add("Maria");
        lista.add("Daniele");
        lista.add("Deizielle");

        for (String nomes : lista){
            System.out.println(nomes);
        }

        //podemos criar um set que irá ordenar os seus objetos, para isso usamos o treeSet e SortedSet
        SortedSet<String> nomes = new TreeSet<>();
        nomes.add("Ernane");
        nomes.add("Maria");
        nomes.add("Daniele");
        nomes.add("Deizielle");

        System.out.println(nomes);
    }
}
