package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain;

public class ImpressoraEstudantes {
    public void imprime(Estudantes estudante) {
        System.out.println("------------------");

        // estudante.nome = "Gohan"; \\ Se eu colocar aqui, ele imprime gohan antes

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        // Colocando o estudante.nome = "gohsn"; aqui, no primeiro ele nao vai mudar
        // Já o segundo vai mudar. Ex:
        // Pra isso funcionarm eu tenho que imprimir novamente a classe estudante
        // La no arquivo .test

        estudante.nome = "Gohan";
    }
}
