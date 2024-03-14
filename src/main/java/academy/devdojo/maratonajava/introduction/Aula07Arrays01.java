package academy.devdojo.maratonajava.introduction;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //guardando idades
        //arrays é tipo reference, não é mais primitivo
        //arrays sao considerados objetos na memória
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        //voce nao consegue imprimir um valor que nao existe
        System.out.println(idades[3]);
    }
}
