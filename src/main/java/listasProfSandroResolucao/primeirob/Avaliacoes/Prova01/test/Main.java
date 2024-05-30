package listasProfSandroResolucao.primeirob.Avaliacoes.Prova01.test;

import java.time.LocalDate;
import java.util.Scanner;

import listasProfSandroResolucao.primeirob.Avaliacoes.Prova01.domain.Aluno;
import listasProfSandroResolucao.primeirob.Avaliacoes.Prova01.domain.Livro;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            imprimirConsole();
            int opcao = input.nextInt();
        }

    }

    private static void imprimirConsole() {
        System.out.println("----Sistema Biblioteca----");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Livro");
        System.out.println("3 - Realizar Empréstimo");
        System.out.println("0 - Sair");
    }

}

// Aluno aluno = new Aluno(1, "Guilherme", 18, "Eng Software", 1535205l,
// "T04");
// Livro livro1 = new Livro(1, "Pai Rico Pai Pobre",
// LocalDate.of(2024, 05, 28), "Berti André", "Disney");
