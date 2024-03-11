package cod.limpo.apostila.djava;

public class ExTiposPrimitivos {

    public static void main(String[] args) {
        // programa de calcular receitas

        double recJaneiro = 15000;
        double recFevereiro = 23000;
        double recMarco = 17000;
        double recTotalTrimestre = recJaneiro + recFevereiro + recMarco;
        double recMedTri = recTotalTrimestre / 3;

        System.out.println("A receita total do trimestre é estimada em: R$" + recTotalTrimestre);
        System.out.println("A receita média do trimestre é estimada em: R$" + recMedTri);

    }

}
