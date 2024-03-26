package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain.Funcionario;

import java.util.Scanner;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        lerDados();

        funcionario.nome = "Sanji";
        funcionario.idade = 26;
        funcionario.salarios = (new double[]{1580, 987, 352});


        funcionario.imprimir();
    }

    private static void lerDados() {
        System.out.printf("Insira o seu nome: ");
        String nome = new Scanner(System.in).nextLine();
    }
}
