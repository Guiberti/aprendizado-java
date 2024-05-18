package exemplosAulasSandro.segundoB.Aula03;

import java.util.ArrayList;
import java.util.List;

public class FinalOperations {

        public static void main(String[] args) {

                List<String> frutas = new ArrayList<>();

                frutas.add("melancia");
                frutas.add("limao");
                frutas.add("uva");
                frutas.add("cereja");
                frutas.add("uva");

                frutas.forEach(fruta -> System.out.print(fruta + ", "));

                System.out.println();

                frutas.stream()
                                .filter(fruta -> fruta.equals("limao"))
                                .forEach(fruta -> System.out.print(fruta + ", "));

                Long qtdLimoes = frutas.stream()
                                .filter(fruta -> fruta.equals("limao"))
                                .count();

                System.out.println("qtdLimoes: " + qtdLimoes);

                boolean contemAbacate = frutas.stream()
                                .anyMatch(fruta -> fruta.equals("abacate"));

                boolean tudoAbacate = frutas.stream()
                                .allMatch(fruta -> fruta.equals("abacate"));

                System.out.println("contemAbacate:" + contemAbacate);
                System.out.println("tudoAbacate:" + tudoAbacate);

                String melancia = frutas.stream()
                                .filter(fruta -> fruta.equals("melancia"))
                                .findFirst()
                                .orElse(null);

                System.out.println(melancia);

                List<Aluno> alunosBala = new ArrayList<>();

                alunosBala.add(new Aluno("Igor", 47));
                alunosBala.add(new Aluno("Gabriel Paludo", 32));
                alunosBala.add(new Aluno("Kaue Andrade", 22));

                List<String> nomes = alunosBala.stream()
                                .map(aluno -> aluno.getNome())
                                .toList();

                nomes.forEach(nome -> System.out.println(nome));

                Integer totalIdade = alunosBala.stream()
                                .map(aluno -> aluno.getIdade())
                                .reduce(0, (vlrAnt, vlrAt) -> vlrAnt + vlrAt);

                System.out.println("totalIdade: " + totalIdade);
        }

}
