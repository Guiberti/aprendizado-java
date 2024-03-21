package listasProfSandroResolucao.Lista03.domain;

import java.text.NumberFormat;
import java.util.Scanner;

public class SalvarFuncoes {
    private static final NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance();
    private static final double[] LISTA_VENDAS = new double[100];
    private static int size = 0;
    private static double valorTotalDeVenda = 0;
    private static final double[][] LISTA_MENSAL = new double[29][12];

    public static void salvar(double valorVenda) {
        LISTA_VENDAS[size++] = valorVenda;
        valorTotalDeVenda += valorVenda;
    }

    public static void salvarTotalVenda() {
        System.out.println("Total de Vendas: " + size);
        System.out.println("Valor Total de Vendas: " + CURRENCY_FORMAT.format(valorTotalDeVenda));
        System.out.print("Vendas: ");
        for (int i = 0; i < size; i++) {
            System.out.print(CURRENCY_FORMAT.format(LISTA_VENDAS[i]) + ", ");
        }
    }

    public static void salvarDiaMes() {
        System.out.print("Qual dia?: ");
        int dia = new Scanner(System.in).nextInt();
        System.out.print("Qual mês?: ");
        int mes = new Scanner(System.in).nextInt();
        if (dia < 1 || dia > 29 || mes < 1 || mes > 12) {
            System.out.println("Dia ou mês inválido. Tente novamente.");
            return;
        }
        System.out.print("Qual o valor total da venda?: ");
        double valorDeVenda = new Scanner(System.in).nextDouble();
        salvarDiaMes(dia, mes, valorDeVenda);
        System.out.println("Valor da venda " + CURRENCY_FORMAT.format(valorDeVenda) + " salvo para o dia " + dia + " do mês " + mes + ".");
    }

    public static void salvarDiaMes(int dia, int mes, double valorDeVenda) {
        LISTA_MENSAL[dia - 1][mes - 1] = valorDeVenda;
        //Aqui ele vai zerar as váriaveis (como se tivesse inicializado novo dia)
        valorTotalDeVenda = 0;
        for (int i = size; i >= 0; i--) {
            LISTA_VENDAS[i] = 0;
        }
        size = 0;
    }

    public static void exibirVendaDiaEscolhido(int diaEsc, int mesEsc) {
        System.out.println("O valor total de vendas para o dia escolhido foi dê: " + CURRENCY_FORMAT.format(LISTA_MENSAL[diaEsc - 1][mesEsc - 1]));
    }
}
