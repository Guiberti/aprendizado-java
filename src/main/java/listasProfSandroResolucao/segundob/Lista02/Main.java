package listasProfSandroResolucao.segundob.Lista02;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("ATV1_________");
        atvUm();
        System.out.println("ATV2_________");
        atvDois();
        System.out.println("ATV3_________");
        atvTres();
        System.out.println("ATV4_________");
        atvQuatro();
        System.out.println("ATV5_________");
    }

    public static void atvUm() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        List<Integer> pairNumbers = numbers.stream().map(number -> {
            Integer numeroPar = number % 2 == 0;

        })
                .toList();
    }

    public static void atvDois() {

    }

    public static void atvTres() {

    }

    public static void atvQuatro() {

    }

    public static void atvCinco() {

    }

}
