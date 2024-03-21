package exemplosAulasSandro.codigos;

public class ExercicioDeFixacaoAulaQuatro {
    public static void main(String[] args) {

        int[][] matrizUm = {
                { 31, 27, 4 },
                { 44, 32, 95 },
                { 9, 16, 56 },
        };

        int[][] matrizDois = new int[][] {
                { 10, 88, 12 },
                { 38, 32, 73 },
                { 14, 21, 52 }
        };

        System.out.println("Printar o numero 95 da primeira matriz e o numero 14 da segunda matriz: ");
        System.out.println(matrizUm[1][2]);
        System.out.println(matrizDois[2][0]);
        System.out.println("\n ----------------------------------------------------------------");

        int[][] matrizTres = somaMatrizes(matrizUm, matrizDois);
        System.out.println("A soma da matriz 1 e da matriz 2 é");

        for (int i = 0; i < matrizTres.length; i++) {
            for (int j = 0; j < matrizTres.length; j++) {
                System.out.print(matrizTres[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n ----------------------------------------------------------------");

        int[][] matrizPorQuatro = mulplicarMatrizQuatro(matrizDois);
        System.out.println("O resultado da multiplicacao escalar da matriz dois por quatro é: ");
        for (int i = 0; i < matrizPorQuatro.length; i++) {
            for (int j = 0; j < matrizPorQuatro.length; j++) {
                System.out.print(matrizPorQuatro[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("\n ----------------------------------------------------------------");

    }

    private static int[][] somaMatrizes(int[][] matrizUm, int[][] matrizDois) {

        int[][] result = new int[3][3];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                result[i][j] = matrizUm[i][j] + matrizDois[i][j];
            }
        }
        return result;
    }

    private static int[][] mulplicarMatrizQuatro(int[][] matrizDois) {
        int[][] matrizPorQuatro = new int[3][3];

        for (int i = 0; i < matrizPorQuatro.length; i++) {
            for (int j = 0; j < matrizPorQuatro.length; j++) {
                matrizPorQuatro[i][j] = matrizDois[i][j] * 4;
            }
        }
        return matrizPorQuatro;
    }

}
