package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try {       //tratando
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {       //tratando
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    // Exceção NÃO checada ou NÃO verifica NÃO é obrigado a tratar
    static void geraErro1() {
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    // Exceção checada ou verificada deve ser tratada
    static void geraErro2() throws Exception {
        throw new Exception("Ocorreu um erro bem legal #02!");
    }

}
