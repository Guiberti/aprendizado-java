package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares até 10000000

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
        System.out.println("\n");
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + ",");
        }
        System.out.println("\n");

        System.out.println("\n");
        for (int i = 0; i <= 100; i += 2) {
            System.out.print("i".concat(String.valueOf(i)).concat("N"));
        }

    }
}
