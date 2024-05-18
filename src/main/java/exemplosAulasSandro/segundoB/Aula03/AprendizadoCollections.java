package exemplosAulasSandro.segundoB.Aula03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AprendizadoCollections {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("um", 1);
        hashMap.put("dois", 2);
        Integer valor = hashMap.get("um"); // valor é 1
        System.out.println(valor);

        System.out.println("_______________________");

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);

        System.out.println("_______________________");

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        // Convertendo Map para List usando Streams
        List<String> keys = map.keySet().stream().collect(Collectors.toList());
        List<Integer> values = map.values().stream().collect(Collectors.toList());

        // Processando a lista de valores
        List<Integer> processedValues = values.stream()
                .filter(v -> v > 1)
                .map(v -> v * 2)
                .sorted()
                .collect(Collectors.toList());

        // Exibindo os resultados
        processedValues.forEach(System.out::println);

    }

}
