package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain.Funcionario;

import java.util.Scanner;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        System.out.print("Insira o seu nome: ");
        String nome = new Scanner(System.in).nextLine();
        System.out.print("Insira sua idade:");
        int idade = new Scanner(System.in).nextInt();

        double[] salarios = lerSalarios();

        funcionario.setNome(nome);
        funcionario.setIdade(idade);
        funcionario.setSalarios(salarios);

        System.out.println("-------------------------------------------");

        funcionario.imprimir();
    }
    private static double[] lerSalarios() {
        double[] salarios = new double[3];
        for (int i = 0; i < salarios.length; i++) {
            System.out.printf("Digite o salário %d: ", i + 1);
            salarios[i] = new Scanner(System.in).nextDouble();
        }
        return salarios;
    }
}
//prox aula 57 - Orientacao objetos - sobrecarga de metodos
