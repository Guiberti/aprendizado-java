package listasProfSandroResolucao.segundob.Lista02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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
        System.out.println("\nATV6_________");
        atvSeis();
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
        List<String> words = new ArrayList<>(List.of("se", "talvez", "hoje", "sábado", "se",
                "quarta", "sábado"));
        Map<String, Long> uniqueWords = words.stream()
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        uniqueWords.forEach((word, counter) -> System.out.println(word + " : " + counter));
    }

    public static void atvQuatro() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Teclado", 80.00));
        products.add(new Product("Micro-ondas", 600.00));
        products.add(new Product("Mouse", 99.00));
        products.add(new Product("Monitor 144Hz", 599.90));
        List<Product> productExpensive = products.stream()
                .filter(product -> product.getPrice() > 100)
                .toList();
        productExpensive.forEach(produto -> System.out.println("Produto: " + produto.getName() +
                "\nPreço: " + produto.getPrice() + "\n"));
    }

    public static void atvCinco() {

    }

    private static void atvSeis() {

    }

}
