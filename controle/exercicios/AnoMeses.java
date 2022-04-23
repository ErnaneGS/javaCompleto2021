package controle.exercicios;

public class AnoMeses {
    public static void main(String[] args) {
        int mes = 1;

        switch(mes){
            case 1:
                System.out.println("Janeiro");
                mes++;
            case 2:
                System.out.println("Fevereiro");
                mes++;
            case 3:
                System.out.println("Março");
                mes++;
            case 4:
                System.out.println("Abril");
                mes++;
            case 5:
                System.out.println("Maio");
                mes++;
            case 6:
                System.out.println("Junho");
                mes++;
            case 7:
                System.out.println("Julho");
                mes++;
            case 8:
                System.out.println("Agosto");
                mes++;
            case 9:
                System.out.println("Setembro");
                mes++;
            case 10:
                System.out.println("Outubro");
                mes++;
            case 11:
                System.out.println("Novembro");
                mes++;
            case 12:
                System.out.println("Dezembro");
                mes++;
                break;
            default:
                System.out.println("Inválido");
        }
    }
}
