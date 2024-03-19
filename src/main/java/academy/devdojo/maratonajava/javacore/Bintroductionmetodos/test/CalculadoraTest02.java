package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.test;

import academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicarDoisNumeros(40,80.5F);
    }
}
//Boa prática, se sua funcao ou metodo tem mais que 3 argumentos, voce pode dividir, ta grande demais