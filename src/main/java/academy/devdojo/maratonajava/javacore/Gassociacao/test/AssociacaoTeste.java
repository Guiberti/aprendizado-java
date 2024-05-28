package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

import java.util.ArrayList;
import java.util.List;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Laranjeiras, 325");
        Aluno aluno = new Aluno("Luffy", 18);
        Professor professor = new Professor("Barba Branca", "Pirata");
        List<Aluno> alunos = new ArrayList<>(List.of(aluno));
        Seminario seminario = new Seminario("Onde achar One Piece", alunos, local);
        List<Seminario> seminarios = new ArrayList<>(List.of(seminario));
        professor.setSeminarios(seminarios);
        professor.imprime();

    }
}
