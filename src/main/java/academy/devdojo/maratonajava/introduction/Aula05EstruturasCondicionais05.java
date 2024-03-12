package academy.devdojo.maratonajava.introduction;
import java.util.Scanner;
public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        //no switch = char, int byte, short enum, String

        System.out.print("Insira um dia da semana: ");
        int opcao = new Scanner(System.in).nextByte();
        switch (opcao) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Ter");
            case 4 -> System.out.println("Qua");
            case 5 -> System.out.println("Quin");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Opção Inválida!");
        }
    }
}
