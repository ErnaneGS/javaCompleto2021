package controle.exercicios;

public class NumeroCerto {
    public static void main(String[] args) {
        int numero = 5;
        int i;

        for(i = 0; i<10;i++){
            if(i ==  numero){
                System.out.println("Parabéns!");
                continue;
            }
            System.out.println( i+ "---" + numero);
        }
    }
}
