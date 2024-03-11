package academy.devdojo.maratonajava.introduction;

public class Aula04Operadores {
    public static void main(String[] args) {

        int numero01 = 10;
        int numero02 = 20;
        int resultadoAdd = numero01 + numero02;
        double resultDiv = numero01 / (double) numero02;

        System.out.println(numero01 + numero02);
        System.out.println("VALOR" + numero01 + numero02);
        System.out.println(resultadoAdd);

        // abaixo vc pode fazer um casting, ou colocar como double na declaracao de
        // variavel
        System.out.println(resultDiv); // nao funciona a div, ele sempre deve
        // resultar em um valor inteiro

        // %s
        int resto = 19 % 2;
        System.out.println(resto);

        // < > <= >= == != sempre valores booleanos
        // com booleano, sempre começar com is
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        // && (AND) || (OR)

        int idade = 35;
        float salario = 3588F;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " +
                isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " +
                isDentroDaLeiMenorQueTrinta);

        String name = "Bruno Cardoso";
        int age = 18;
        String dataSalario = "07/03/2024";
        double salar = 1709;
        String bruno = "Meu nome é: " + name + ", tenho " + age + " anos, meu salário é: R$" + salar
                + ", e recebo no dia: " + dataSalario;

        System.out.println(bruno);
        System.out.println(bruno);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000F;

        boolean isPlaystationCincoCompra = valorTotalContaCorrente > valorPlayStation
                || valorTotalContaPoupanca > valorPlayStation;

        System.out.println("isPlaystationCincoCompra" + isPlaystationCincoCompra);

        // = += -= /= %=

        double bonus = 1000;
        bonus += 1000;
        bonus += 1000;
        bonus -= 1000;
        bonus -= 1000;
        bonus /= 2; // até aq temq que ta 500
        bonus *= 6; // aqui 3 mil

        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1; // contador = contador + 1
        // forma certa de fazer isso
        contador++;
        contador--;
        ++contador; // depende do momento que voce quer que seja executado
        --contador;

        int contador2 = 0;

        System.out.println(contador2++); // primeiro voce faz o que tem que fazer com a variavel, depois voce soma,
                                         // portanto nessa situacao ele fez a impressao e depois ele somou +
        System.out.println(contador2);
    }
}
