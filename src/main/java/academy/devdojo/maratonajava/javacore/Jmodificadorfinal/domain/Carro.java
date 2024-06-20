package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain;

public class Carro {
    //se voce quiser que outras classes nào extenda essa classe, você pode fazer um public final class Carro {}
    //assim nenhuma outra classe poderá extende-lá

    //se eu colocar a classe privada, não preciso colocar os métodos privados também
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public static final Comprador COMPRADOR = new Comprador();

    public final void imprime() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
