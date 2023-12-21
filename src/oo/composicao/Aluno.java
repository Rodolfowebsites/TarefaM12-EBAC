package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    final String nome;
    final List<Curso> cursos = new ArrayList<>();

    Aluno(String nome) {
        this.nome = nome;
    }

    void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    // Vai retornar o curso a partir do nome, esse metodo pode encontrar caso o nome do curso seja igual ao nome que você passou, caso contrartio ele vai passar por todos os cursos e nã ovai entrar em nenbum momento pelo if e vai retornar null.
    Curso obterCursoPorNome(String nome) { // Se o nome do curso for igual aos nomes cadastrados no arraylist, então vai retornar o nome do curso do contrário, retorna nulo.
        for(Curso curso: this.cursos) {
            if(curso.nome.equalsIgnoreCase(nome)){
                return curso;
            }
        }
        return null;
    }

    public String toString() {
        return nome;
    }
}
// Quando você cria uma variavel, por exemplo, cursos que é uma lista, ela tem um endereco de memoria
// cursos = 0x1234 - quando digo que agora ela é final, estou dizendo que esse endereco não muda.
// Sempre apontara para uma lista, mas não perde as funcionalidades de adicionar itens ou remover.