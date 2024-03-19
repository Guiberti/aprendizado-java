package listasTestes.Lista03.domain;

import java.text.NumberFormat;
import java.util.Scanner;

public class ExibirFuncoes {
    private static final NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance();

    public static void exibirPrecoTotal() {
        System.out.print("Quantidade de itens:");
        int quantidade = new Scanner(System.in).nextInt();
        System.out.print("Preço por item:");
        double preco = new Scanner(System.in).nextDouble();
        if (quantidade <= 0 || preco <= 0) {
            System.out.print("Os valores devem ser maiores que zero!");
            return;
        }
        double precoTotal = CalcularFuncoes.calcularPrecoTotal(quantidade, preco);
        System.out.println("Preço total: " + CURRENCY_FORMAT.format(precoTotal));
    }

    public static void exibirTroco() {
        System.out.print("Valor Total da Compra: ");
        double total = new Scanner(System.in).nextDouble();
        System.out.print("Valor recebido: ");
        double recebido = new Scanner(System.in).nextDouble();
        if (total <= 0 || recebido <= 0) {
            System.out.print("Os valores devem ser maiores que 0");
            return;
        } else if (recebido < total) {
            System.out.print("O valor que você repassar, deve ser igual ou maior que o valor total da compra!");
            return;
        }
        double troco = CalcularFuncoes.calcularTroco(recebido, total);
        System.out.println("Troco a ser entregue para o cliente é: " + CURRENCY_FORMAT.format(troco));
    }

    public static void exibirTotalVenda() {
        SalvarFuncoes.salvarTotalVenda();
    }

    public static void exibirVendaDiaEscolhido() {
        System.out.println("Digite o dia e o mês para obter o valor da venda (dia mês):");
        System.out.print("Qual dia?: ");
        int diaEsc = new Scanner(System.in).nextInt();
        System.out.print("Qual mês?: ");
        int mesEsc = new Scanner(System.in).nextInt();
        if (diaEsc < 1 || diaEsc > 29 || mesEsc < 1 || mesEsc > 12) {
            System.out.println("Dia ou mês inválido. Tente novamente.");
            return;
        }
        SalvarFuncoes.exibirVendaDiaEscolhido(diaEsc, mesEsc);
    }
}
