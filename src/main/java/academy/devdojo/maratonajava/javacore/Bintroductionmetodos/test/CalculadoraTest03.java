package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int result = (int) calculadora.dividirDoisNumeros(20,5);
        System.out.println(result);
    }
}
//Prox aula 47