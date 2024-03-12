package academy.devdojo.maratonajava.introduction;

/**Quero saber quanto tenho que pagar na Holanda em 2020 com
base no meu salário anual**/

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.7 /100;
        double segundaFaixa = 37.35 /100;
        double terceiraFaixa = 49.50 /100;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println("Com base nas taxas da Holanda, vou ter que pagar: R$" + valorImposto);

    }
}
