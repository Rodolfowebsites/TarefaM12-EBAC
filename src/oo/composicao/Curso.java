package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;
    final List<Aluno> alunos = new ArrayList<>();

    Curso(String nome) {    //Construtor
        this.nome = nome;
    }

    void adicionarAluno(Aluno aluno) {    // metodo - Instanciando a classe Aluno
        this.alunos.add(aluno);     // Adicionando no arrayList
        aluno.cursos.add(this);     // Adicionando no arrayLis
        // Relação Bidirecional entre aluno e curso.
    }
}
