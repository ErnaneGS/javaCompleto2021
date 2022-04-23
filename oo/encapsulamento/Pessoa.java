package oo.encapsulamento;

public class Pessoa {
    private int idade;
    private String nome;
    private String sobrenome;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeCompelto () {
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                '}';
    }
}
