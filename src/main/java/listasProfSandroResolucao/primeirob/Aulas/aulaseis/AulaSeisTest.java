package listasProfSandroResolucao.primeirob.Aulas.aulaseis;

public class AulaSeisTest {
    public static void main(String[] args) {

        Professor profeUm = new Professor();
        Professor oMelhorProfe = new Professor();

        profeUm.nome = "Guilherme";
        profeUm.materia = "A.I";

        oMelhorProfe.nome = "Sandrolaxx";
        oMelhorProfe.materia = "POO";

        profeUm.apresentarse();
        oMelhorProfe.apresentarse();

        Arma awp = new Arma();

        awp.nome = "AWP - Fever Dream";
        awp.tipo = "Rifle";
        awp.dano = 110;

        profeUm.arma = awp;

    }
}
