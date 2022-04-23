package oo.composicao;

public class CursoTeste {

    public static void main(String[] args) {

        Aluno aluno01 = new Aluno("Ernane");
        Aluno aluno02 = new Aluno("Maria");
        Aluno aluno03 = new Aluno("José");

        Curso curso01 = new Curso("Java Completo");
        Curso curso02 = new Curso("Web Completo");
        Curso curso03 = new Curso("React Completo");

        curso01.adicionarAlunoNoCurso(aluno01);
        curso01.adicionarAlunoNoCurso(aluno02);

        curso02.adicionarAlunoNoCurso(aluno01);
        curso02.adicionarAlunoNoCurso(aluno03);

        aluno01.adicionarCurso(curso03);
        aluno02.adicionarCurso(curso03);
        aluno03.adicionarCurso(curso03);

        //alunos matriculados no curso 01
        System.out.println("Alunos matriculados no curso 03:");
        for (Aluno aluno : curso03.alunos){
            System.out.println(aluno.nome);
        }

        //imprimindo os alunos matriculados no primeiro curso do aluno 01
        System.out.println(aluno01.cursos.get(0).alunos);

        //pesquisar se o aluno esta fazemdo determinado curso
        Curso cursoEncontrado = aluno01.obrterCursoDoAlunoPorNome("Java Completo");
        if(cursoEncontrado != null){
            System.out.println("O curso " + cursoEncontrado.nome + " foi encontrado na matriccuo aluno.");
        } else {
            System.out.println("O curso " + cursoEncontrado.nome + " não foi encontrado na matriccuo aluno.");
        }
    }
}
