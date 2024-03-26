package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain;

public class Calculadora {
    //quando tem void, não tem nada de retorno / return
    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 10);
    }

    public void multiplicarDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void imprimeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Igual a 0");
            return;
        }
            System.out.println("normal");
    }

    public void ateraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois números");
        System.out.println("Num1 " + numero1);
        System.out.println("Num2 " + numero2);
    }

    //Utilizando Array da forma normal (somando)
    public void somaArray(int[] numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma += num;
            System.out.println(soma);
        }
    }

    // Utilizando o Array de forma melhor
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for(int num: numeros) {
            soma += num;
            System.out.println(soma);
        }
    }
}
