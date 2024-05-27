package listasProfSandroResolucao.segundob.Aulas.Aula02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.List;

public class IteracaoSample {
    private static final String List = null;

    public static void main(String[] args) {

        Map<String, Integer> vehicles = new HashMap<>();
        vehicles.put("BMW", 5);
        vehicles.put("Mercedes", 3);
        vehicles.put("Audi", 4);
        vehicles.put("Ford", 10);

        for (String chave : vehicles.keySet()) {
            System.out.println("Valor chave: " + chave);
        }

        System.out.println("\n__________________\n");

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(4);
        listNumbers.add(5);
        for (Integer number : listNumbers) {
            System.out.println(number);
        }

        Iterator<Integer> iterator = listNumbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}
