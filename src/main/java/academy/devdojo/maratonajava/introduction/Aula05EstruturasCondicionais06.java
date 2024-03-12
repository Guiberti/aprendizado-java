package academy.devdojo.maratonajava.introduction;
import java.util.Scanner;
public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Dados os valores de 1 a 7, imprima se é dia util ou final de semana
        //considere 1 como domingo

        System.out.print("Insira um dia da semana: ");
        int opcao = new Scanner(System.in).nextByte();
        switch (opcao) {
            case 1:
            case 7: System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6: System.out.println("Util");
                break;
            default: System.out.println("Invalido");
        }
    }
}
