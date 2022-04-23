package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item> itensDaCompra = new ArrayList<>();

    void adicionarItem(Produto produto, int quantidade) {
        itensDaCompra.add(new Item(produto, quantidade));
    }

    double totalCompra() {
        double total = 0;
        for (Item item : itensDaCompra) {
            total += item.quantidadeProduto * item.produto.preco;
        }
        return total;
    }
}
