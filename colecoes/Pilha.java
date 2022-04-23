package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        //implementação de uma pilha
        Deque<String> livros = new ArrayDeque<>();

        //adicionar
        livros.add("O Pequeno Principe");
        livros.push("Livros de casa");
        livros.push("Livros para estudo");

        //retorna o ultimo elemento da pilha
        livros.peek();
        livros.element();

        //remover
        livros.poll();
        livros.remove();
        livros.pop();
    }
}