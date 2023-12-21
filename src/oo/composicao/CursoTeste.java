package oo.composicao;

public class CursoTeste {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java Completo");
        Curso curso2 = new Curso("Web 2023");
        Curso curso3 = new Curso("React Native");


        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso3.alunos) {
            System.out.println("Estou matricualdo no curso " + curso3.nome + "...");
            System.out.println("... e o meu nome é " + aluno.nome);
            System.out.println();
        }

        System.out.println(aluno1.cursos.get(0).alunos);// na lista get(0) representa a primeira vaga.

        Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");// Solicitando o curso por nome através do aluno 1

        if(cursoEncontrado != null) { // Se o curso for diferente de null(que é o padrão), imprimir o nome do curso.
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);//Se for diferente de nulo vai Imprimir os nomes de todos os alunos.
        }

    }





}
