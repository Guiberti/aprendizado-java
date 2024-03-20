package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain;

public class ImpressoraEstudantes {
    public void imprime(Estudantes estudante) {
        System.out.println("------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
