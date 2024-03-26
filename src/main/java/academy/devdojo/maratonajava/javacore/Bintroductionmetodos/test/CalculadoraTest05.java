package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);

        System.out.println("-----------------------");

        //Com o VARARGS, eu consigo passar a lista dentro dele, nao precisa do int[]
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7, 8, 12, 13, 14, 15, 16, 12312);
        //Adendo, se dentro da public voce tiver mais atributos,
        //O VarArgs precisa sempre ser o ÚLTIMO!!!!
        //Coloque as outras váriaveis antes e por ultimo o VarArgs
    }
}
