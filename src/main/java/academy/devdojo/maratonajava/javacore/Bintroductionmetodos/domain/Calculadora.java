package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain;

public class Calculadora {
    //quando tem void, não tem nada de retorno / return
    public void somarDoisNumeros() {
        System.out.println(10+10);
    }
    public void subtrairDoisNumeros(){
        System.out.println(21-10);
    }
    public void multiplicarDoisNumeros(int num1, float num2){
        System.out.println(num1 * num2);
    }
    public double dividirDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }
}
