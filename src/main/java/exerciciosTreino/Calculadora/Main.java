package exerciciosTreino.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;

        while (true) {
            printConsole();
            option = scan.nextInt();
            if (option == 0) {
                System.out.println("Exiting...");
                break;
            }
            switch (option) {
                case 1 -> addition();
                case 2 -> subtract();
                case 3 -> multiply();
                case 4 -> division();
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    public static void printConsole() {
        System.out.println("-----CALCULATOR-----");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Division");
        System.out.println("0 - Exit");
    }

    private static void addition() {
        System.out.println("Insira o primeiro número: ");
        double numberOne = new Scanner(System.in).nextDouble();
        System.out.println("Insira o segundo número: ");
        double numberTwo = new Scanner(System.in).nextDouble();
        System.out.println("A soma dos números é: " + (numberOne + numberTwo));
    }

    private static void subtract() {
        System.out.println("Insira o primeiro número: ");
        double numberOne = new Scanner(System.in).nextDouble();
        System.out.println("Insira o segundo número: ");
        double numberTwo = new Scanner(System.in).nextDouble();
        System.out.println("A subtração dos números é: " + (numberOne - numberTwo));
    }

    private static void multiply() {
        System.out.println("Insira o primeiro número: ");
        double numberOne = new Scanner(System.in).nextDouble();
        System.out.println("Insira o segundo número: ");
        double numberTwo = new Scanner(System.in).nextDouble();
        System.out.println("A multiplicação dos números é: " + (numberOne * numberTwo));
    }

    private static void division() {
        System.out.println("Insira o primeiro número: ");
        double numberOne = new Scanner(System.in).nextDouble();
        System.out.println("Insira o segundo número: ");
        double numberTwo = new Scanner(System.in).nextDouble();
        System.out.println("A divisão dos números é: " + (numberOne / numberTwo));
    }
}
