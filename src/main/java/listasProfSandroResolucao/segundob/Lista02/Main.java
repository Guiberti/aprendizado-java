package listasProfSandroResolucao.segundob.Lista02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Main {

    public static void main(String[] args) {
        System.out.println("ATV1_________");
        atvUm();
        System.out.println("\nATV2_________");
        atvDois();
        System.out.println("\nATV3_________");
        atvTres();
        System.out.println("\nATV4_________");
        atvQuatro();
        System.out.println("\nATV5_________");
    }

    public static void atvUm() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
        List<Integer> pairNumbers = numbers.stream().filter(n -> n % 2 == 0)
                .toList();

        pairNumbers.forEach(number -> System.out.println(number));
    }

    public static void atvDois() {
        List<String> names = new ArrayList<>();
        names.add("roberto");
        names.add("josé");
        names.add("caio");
        names.add("vinicius");

        List<String> capitalizedNames = names.stream().map(String::toUpperCase).toList();
        capitalizedNames.forEach(name -> System.out.println(name));
    }

    public static void atvTres() {

        List<String> words = new ArrayList<>();
        words.add("se");
        words.add("talvez");
        words.add("hoje");
        words.add("sábado");
        words.add("se");
        words.add("quarta");
        words.add("sábado");

    }

    public static void atvQuatro() {

    }

    public static void atvCinco() {

    }

}
