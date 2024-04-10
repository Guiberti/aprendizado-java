package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain;

public class Pessoa {
    private String nome;
    private int idade;
    //Quando voce coloca private, voce tem que criar o método setNome e setIdade para poder puxar os valores
    //set pra setar e get pra puxar

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade Inválida");
            return;
        }
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }
}
