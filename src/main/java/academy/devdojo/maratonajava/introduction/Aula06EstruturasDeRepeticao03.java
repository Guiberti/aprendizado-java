package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        //Imprima os primeiros 25 numeros de um dado valor. Por Ex: 50.

        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
           if (i>25){
               break;
           }
            System.out.print(i + ",");
        }
    }
}
//Prox aula é 31
