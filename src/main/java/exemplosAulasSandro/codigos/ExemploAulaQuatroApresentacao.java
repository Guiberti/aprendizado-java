package exemplosAulasSandro.codigos;

public class ExemploAulaQuatroApresentacao {
    public static void main(String[] args) {

        int[][] multArray = new int[][] { { 3, 9 }, { 5, 4 } };

        System.out.println(multArray[0][1]); // 9
        System.out.println(multArray[1][1]); // 4
        System.out.println("\n");

        int[][] multArray2 = {
                { 43, 27, 12 },
                { 32, 74, 33 },
                { 22, 8, 37 }
        };
        // indices para percorrer a matriz
        int linha = 0;
        int coluna = 0;

        // com do while
        do {
            do {
                System.out.println("Elemento na posição [" + linha + "][" + coluna + "]: " + multArray2[linha][coluna]);
                coluna++;
            } while (coluna < multArray2[linha].length);

            // reinicia a coluna e avança para a próxima linha
            coluna = 0;
            linha++;
        } while (linha < multArray2.length);

        System.out.println("\n");
        System.out.println("\n");
        linha = 0;
        coluna = 0;

        // com for / podemos utilizar i e j ao inves de linha e coluna
        for (linha = 0; linha < multArray2.length; linha++) {
            for (coluna = 0; coluna < multArray2[linha].length; coluna++) {
                System.out
                        .println("Elemento na posição [" + linha + "] [" + coluna + "]: " + multArray2[linha][coluna]);
            }
        }

        System.out.println("\n");
        System.out.println("\n");

        // com foreach
        linha = 0;
        for (int[] linhaMatriz : multArray2) {
            coluna = 0;
            for (int elemento : linhaMatriz) {
                System.out
                        .println("Elemento na posição [" + linha + "] [" + coluna + "]: " + multArray2[linha][coluna]);
                coluna++;
            }
            linha++;
        }

    }
}
