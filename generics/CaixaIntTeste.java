package generics;

public class CaixaIntTeste {

    public static void main(String[] args) {

        Caixa<String> caixaGenerica = new Caixa<>();
        CaixaInt caixaInteiro = new CaixaInt();

        caixaGenerica.guardar("Teste");
        caixaInteiro.guardar(210);


    }
}
