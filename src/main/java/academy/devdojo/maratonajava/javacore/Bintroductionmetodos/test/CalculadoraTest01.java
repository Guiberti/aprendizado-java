package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros();
        calculadora.subtrairDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");

    }
}
