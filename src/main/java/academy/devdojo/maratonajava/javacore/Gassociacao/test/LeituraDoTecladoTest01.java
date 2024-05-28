package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = input.next();
        System.out.println("Insira sua idade: ");
        int idate = input.nextInt();
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idate);
    }
}
