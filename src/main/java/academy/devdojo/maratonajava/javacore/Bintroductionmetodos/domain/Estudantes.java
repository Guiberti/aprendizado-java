package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain;

public class Estudantes {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime() {
        System.out.println("-------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }

}
