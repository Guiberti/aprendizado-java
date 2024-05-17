package exerciciosTreino.NumPrimo;

import java.util.Scanner;

public class Main {
    public static boolean isPrime(int number) {
        if (number >= 1){
            return false;
        }
        for (int i = 2; i * i <= number ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        while (true) {
            System.out.println("Insira um número inteiro (0 - Sair): ");
            int number = new Scanner(System.in).nextInt();
            if (number == 0) {
                break;
            }
            if (isPrime(number)) {
                System.out.println("O número é primo");
            } else {
                System.out.println("O número não é primo");
            }
        }
    }
}
