package exemplosAulasSandro;

public class ExercicioFicacaoMatriz {
    public static void main(String[] args) {

        int[][] multArray1 = { // modelo 1 de matriz
                { 31, 27, 4 },
                { 44, 32, 95 },
                { 9, 16, 56 },
        };

        int[][] multArray2 = new int[][] { // modelo 2 matriz
                { 10, 88, 12 },
                { 38, 32, 73 },
                { 14, 21, 52 }
        };

        /*
         * existe a matriz 3 também, declara de outra forma (tem nos slides do professor
         * no prezi pelo notion)
         */

        int[][] multArray3 = somaMatrizes(multArray1, multArray2);

        System.out.println("Ex de fixaçao, soma da primeira e segunda matriz: \n");
        for (int linha = 0; linha < multArray3.length; linha++) {
            for (int coluna = 0; coluna < multArray3[linha].length; coluna++) {
                System.out.println("Posição de vetor [" + linha + "][" + coluna + "]: " + multArray3[linha][coluna]);
            }
        }

        System.out.println("\nEx de fixaçao, printar no console os valores 95 e 14:\n");
        System.out.println("Posição 1 e 2 da primeira matriz: " + multArray1[1][2]);
        System.out.println("Posição 2 e 0 da segunda matriz: " + multArray2[2][0]);

        System.out.println("----------------------------------");

        for (int[] arrBase: multArray1){
            for (int num: arrBase){
                System.out.print(num + "  ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------");

    }

    private static int[][] somaMatrizes(int[][] multArray1, int[][] multArray2) {
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = multArray1[i][j] + multArray2[i][j];
            }
        }
        return result;
    }

}
