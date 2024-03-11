package cod.limpo.apostila.djava;

public class InicioApostilaCasting {
    public static void main(String[] args) {

        double d3 = 3.14;
        int i = (int) d3;

        System.out.println(i);

        // imprime a idade.
        int idade = 20;
        System.out.println(idade);
        // gera uma idade no ano seguinte.
        int idadeNoAnoQueVem;
        idadeNoAnoQueVem = idade + 1;
        // imprime a idade.
        System.out.println(idadeNoAnoQueVem);

        /*
         * ADENDO: Os numeros quando sao double e tentamos atribuir para int, ele nao
         * compila, ja vice-versa, compila!
         * Lembrando que para compilar double para int precisamos utilziar o metodo
         * "casting" como descrito a cima!
         */

        long x = 10000;
        int i2 = (int) x;
        System.out.println(i2);
        System.out.println("---");

        double d = 5;
        float f = 3;
        float x2 = f + (float) d;
        System.out.println(x2);
        System.out.println("---");

        int idade2 = 15;
        boolean amigoDoDono = true;
        if (idade2 < 18 && !amigoDoDono) {
            System.out.println("Não pode entrar");
        } else {
            System.out.println("Pode entrar");
        }

    }
}
