package academy.devdojo.maratonajava.introduction;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numeros = new int[3]; // vc tem que colocar embaixo
        int[] numeros2 = { 1, 2, 3, 4, 5 }; // colocar junto forma 1
        int[] numeros3 = new int[] { 5, 4, 3, 2, 1 }; // colocar junto forma 2

        for (int i = 0; i < numeros3.length; i++) {
            System.out.print(numeros3[i] + ",");
        }

        System.out.println("\n");

        for (int i : numeros3) { // esse é para os arrays, fica mais tranquilo de mexer
            System.out.println(i);
        }

    }
    // prox aula 36
}
