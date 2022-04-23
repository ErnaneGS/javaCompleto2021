package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "João Pesdro";
        c1.itensDaCompra.add(new Item("Caneta", 20, 7.45));
        c1.itensDaCompra.add(new Item("Lapis", 10, 5.45));
        c1.itensDaCompra.add(new Item("Borracha", 5, 6.90));

        System.out.println(c1.obterValorTotal());
    }
}
