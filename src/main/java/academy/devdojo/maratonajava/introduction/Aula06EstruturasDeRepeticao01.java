package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        int count = 0; //se for falor falso (11) ele nao é executado
        while (count < 10) {
            System.out.print(++count + ", ");
        }

        System.out.println("\n");
        count = 0;

        do {
            System.out.println("dentro do do-while " + ++count);
        } while (count < 10);

        System.out.println("\n");

        for (int i=0; i < 10; i++){
            System.out.println("For "+i);
        }
    }
}
