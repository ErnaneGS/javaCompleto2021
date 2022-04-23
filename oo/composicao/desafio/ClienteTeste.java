package oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        //instanciando o cliente
        Cliente cliente01 = new Cliente("Ernane Geraldo de Sousa");

        //instanciar os nossos produtos
        Produto caneta = new Produto("Caneta", 2.50);
        Produto caderno = new Produto("Caderno" , 12.50);
        Produto agenda = new Produto("Agenda", 7.90);

        //adicionando os itens na lista de compra 01 e adicionando a compra ao cliente
        Compra compra01 = new Compra();

        compra01.adicionarItem(caneta, 10);
        compra01.adicionarItem(agenda, 2);

        cliente01.compra.add(compra01);

        System.out.println("O valor da compra 01 do cliente " + cliente01.nome + " e igual a: " + compra01.totalCompra());

        //adicionando os itens ma lista da compra 02 e adicionando a compra ao cliente
        Compra compra02 = new Compra();

        compra02.adicionarItem(caneta, 10);
        compra02.adicionarItem(caderno, 5);

        cliente01.compra.add(compra02);

        System.out.println("O valor da compra 02 do cliente " + cliente01.nome + " e igual a: " + compra02.totalCompra());

        System.out.println("O valor total gasto pelo " + cliente01.nome + " foi de: " + cliente01.valorGasto());

    }
}
