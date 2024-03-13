package cod.limpo.apostila.djava;

import java.util.Scanner;

public class InicioApostilaLacoRepet {
    public static void main(String[] args) {
        int idade = 15;
        while (idade < 18) {
            System.out.println(idade);
            idade = idade + 1;
        }

        int x = 0;
        System.out.print("Insira um número para Y: ");
        int y = new Scanner(System.in).nextInt();

        for (int i = x; i < y; i++) {
            if (i % 19 == 0) {
                System.out.println("Achei um número divisível por 19 entre x e y");
                break;
            }
        }

        /*
         * // aqui, a variável i não existe.
         * int i = 5;
         * // a partir daqui, ela existe.
         * while (condicao) {
         * // o i ainda vale aqui.
         * int j = 7;
         * // o j passa a existir.
         * }
         * // aqui, o j não existe mais, porém o i continua dentro do escopo.
         */

        // LEBEDED LOOPING
        loopExterno: for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i * j > 2) {
                    break loopExterno;
                }
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }

    }
    // PG 28 APOSTILA
    /*
     * Porém, o código do for indica claramente que a variável i serve, em especial,
     * para controlar a
     * quantidade de laços executados. Quando usar o for ? Quando usar o while ?
     * Depende do gosto e da
     * ocasião.
     */

}
