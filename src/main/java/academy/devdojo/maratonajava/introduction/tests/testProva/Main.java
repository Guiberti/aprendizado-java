package academy.devdojo.maratonajava.introduction.tests.testProva;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String[] opcoes = {"Listar Alunos", "Criar Registro de Testemunho", "Sair"};
        while (true) {
            String selecionar = (String) JOptionPane.showInputDialog(null, "Selecione a opção desejada: ",
                    "Menu", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            switch (selecionar) {
                case "Listar Alunos" -> listarAlunos();
                case "Criar Registro de Testemunho" -> criarRegistroTestemunho();
                case "Sair" -> {
                    return;
                }
                default -> JOptionPane.showMessageDialog(null, "Nenhuma Opção selecionada", "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static void listarAlunos() {
        System.out.println(ListarAlunos.getJsonData());
    }

    private static void criarRegistroTestemunho() {
        String urlAluno = (String) JOptionPane.showInputDialog(
                null,
                "Informe a sua URL",
                "Inserir",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null);
        String raAluno = (String) JOptionPane.showInputDialog(
                null,
                "Informe o seu Registro de Aluno",
                "Inserir",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null);
        String testemunhoAluno = (String) JOptionPane.showInputDialog(
                null,
                "Digite o seu testemunho",
                "Inserir",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null);

        CriarRegistroTestemunho.getJsonData(urlAluno, raAluno, testemunhoAluno);
    }
}
