package classesMetodos.desafioModulo;

public class Pessoa {

    String nomePessoa;
    double pesoPessoa;
//    double pesoAposComer;

    Pessoa(String nomePessoa, double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
//        this.pesoAposComer = pesoPessoa;
    }

    void comer(Comida comida){
        if (comida != null){
            this.pesoPessoa += comida.pesoComida;
//            this.pesoAposComer += comida.pesoComida;
        }
    }

    void escrever(){
        System.out.println("Meu nome e " + nomePessoa + " e meu peso e " +pesoPessoa);
    }
}
