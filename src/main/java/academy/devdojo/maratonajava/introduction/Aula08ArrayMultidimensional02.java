package academy.devdojo.maratonajava.introduction;

public class Aula08ArrayMultidimensional02 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[]{1, 2};
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        System.out.println("-----------------------------");
        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");
        for (int[] arrayBase : arrayInt2) {
            for (int num : arrayBase) {
                System.out.print(num + "  ");
            }
            System.out.println();
        }
    }
}
