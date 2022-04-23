package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        //criação de uma fila
        Queue<String> fila = new LinkedList<>();

        //adicionar
        fila.add("Ana"); //retorna false caso a fila tenha atingido o seu limite, fila cheia.
        fila.offer("Bia"); //retorna um erro caso a fila tenha atingido o seu limite, fila cheia.
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Andre");
        fila.offer("Jose");

        //obtém o próximo elemento na fila sem remover
        System.out.println(fila.peek()); //retorna null quando a fila esta vazia
        System.out.println(fila.element()); //apresenta exceção quando a fila esta vazia

        //para saber se a fila esta vazia
        fila.isEmpty();

        //pega o primeiro elemento e remove
        System.out.println(fila.poll()); //lista vazia retorna null
        System.out.println(fila.remove()); //quando a lista esta vazia resulta um excessão
    }
}