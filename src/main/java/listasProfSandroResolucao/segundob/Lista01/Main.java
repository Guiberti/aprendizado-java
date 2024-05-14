package listasProfSandroResolucao.segundob.Lista01;


import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("ATV 1___");
        List<String> nomes = new ArrayList<>(List.of("Rafael", "Anderson", "Bernardo", "Kauê", "Lucas"));
        nomes.forEach(nome -> System.out.println("G - " + nome));

        System.out.println("\nATV 2___");
        HashSet<Integer> numInt = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 5, 3, 1));
        System.out.println("Existe o número 3? " + numInt.contains(3));
        System.out.println("Lista de números: ");
        numInt.forEach(System.out::println);

        System.out.println("\nATV 3___");
        List<String> jogosZerados = new ArrayList<>();
        jogosZerados.add("GTA SA");
        jogosZerados.add("GTA SA");
        jogosZerados.add("Minecraft");
        jogosZerados.add("Minecraft");
        jogosZerados.add("Minecraft");
        jogosZerados.add("Minecraft");
        jogosZerados.add("GOD OF WAR");
        List<String> jogosZeradosUnicos = new ArrayList<>(new HashSet<>(jogosZerados));
        System.out.println("Todos os jogos zerados únicos: ");
        jogosZeradosUnicos.forEach(System.out::println);

        System.out.println("\nATV 4___");
        Queue<String> melhoresAnimesSeries = new PriorityQueue<>(Comparator.naturalOrder());
        melhoresAnimesSeries.add("Naruto");
        melhoresAnimesSeries.add("Naruto Shippuden");
        melhoresAnimesSeries.add("Dragon Ball");
        melhoresAnimesSeries.add("My Hero Academia");
        melhoresAnimesSeries.add("Death Note");
        melhoresAnimesSeries.add("One Piece");
        melhoresAnimesSeries.add("Captain Tsubasa");
        melhoresAnimesSeries.add("SuperOnze");
        melhoresAnimesSeries.add("Pokémon");
        melhoresAnimesSeries.add("The Walking Dead");
        melhoresAnimesSeries.add("La Casa de Papel");
        melhoresAnimesSeries.add("Reacher");
        melhoresAnimesSeries.add("Jack Ryan");
        melhoresAnimesSeries.add("Dark");
        melhoresAnimesSeries.add("O Gambito da Rainha");
        melhoresAnimesSeries.add("Nanatsu no Taizai");
        melhoresAnimesSeries.add("The 100");
        melhoresAnimesSeries.forEach(serie -> System.out.println(serie));

        System.out.println("\nATV 5___");

    }

}
