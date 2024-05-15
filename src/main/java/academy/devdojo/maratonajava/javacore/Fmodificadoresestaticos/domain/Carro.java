package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Carro {
    //O modificador estatico faz o atributo sair de dentro do objeto e sim pertencer
    //a classe.

    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;//Agora está statico, o indexador é do carro
    //Se eu setar qualquer carro no test e colocar velocidade limite 180, ele altera para todos os carros, nao somente para o setado
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime() {
        System.out.println("--------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
        //System.out.println("Velocidade Limite: " + this.velocidadeLimite);
        //O this. se refere ao objeto, mas agora a vel limite não é do objeto, é do this.
        System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
    }

    public static void setVelocidadeLimite(double velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public static Double getVelocidadeLimite() {
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
