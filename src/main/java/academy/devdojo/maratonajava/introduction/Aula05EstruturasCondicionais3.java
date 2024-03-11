package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais3 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
        // operador ternario, ele precisa colocar o resultado e colocar em algum lugar
        // String resultado = (condicao) ? verdadeiro : falso;
        String resultado = salario > 5000 ? "Eu vou doar 500 pro Guilherme" : "Ainda não tenho condições, mas vou ter";
        System.out.println(resultado);
    }
}
// aula 23, prox 24