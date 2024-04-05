package exemplosAulasSandro.codigos.aulaseis;

public class Professor {
    String nome;

    String materia;

    Arma arma;

    // O .concat funciona da mesma forma que o +

    public void apresentarse() {
        String msg = "Olá! Sou o professor(a) "
                .concat(nome)
                .concat("e vou lecionar ")
                .concat(materia);

        System.out.println(msg);
    }
}
