package exemplosAulasSandro.primeiroB;

public class ExemploAulaTres {

    public static void main(String[] args) {

        int idade = 20;
        String valorPrint = idade >= 18 ? "É maior de idade" : "Não é maior de idade";

        System.out.println(valorPrint);
        // -------

        int[] umNovoVetor;

        umNovoVetor = new int[] { 23, 34, 21, 34, 45 };
        System.out.println(umNovoVetor[3]);
        System.out.println(umNovoVetor[4]); // se eu colocar 5 ele da o erro

    }

}
