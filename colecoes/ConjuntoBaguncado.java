package colecoes;

import java.util.HashSet;

public class ConjuntoBaguncado {
    public static void main(String[] args) {

        //criação de um novo conjunto SET com o nome conjunto
        HashSet conjunto = new HashSet();

        //adicionando pbjetos a esse conjunto, caso sejam valores sejam
        //primitivos ele converterá em Wrappers
        conjunto.add(1.2);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add(true);
        conjunto.add('x');

        //imprimindo o tamnho do conjunto
        System.out.println("O tamanho do conjunto é:" + conjunto.size());

        //removendo um elemento do conjunto
        conjunto.remove(1.2);
        conjunto.remove(true);

        //consultando se o conjunto possui um objeto
        System.out.println(conjunto.contains("teste"));
        System.out.println("Teste");

        //cirando um novo conjunto SET e adicionando objektos a ele
        HashSet numero = new HashSet();
        numero.add(2);
        numero.add(102);

        //união de dois conjuntos
        conjunto.addAll(numero);

        //intersessão de conjuntos, apresenta somente os mesmos valores
        conjunto.retainAll(numero);

        //limpa os dados de um conjunto
        conjunto.clear();
    }
}
