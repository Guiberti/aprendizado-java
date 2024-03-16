package listasTestes;

import java.util.Scanner;

public class Lista03 {
    public static void main(String[] args) {
        while (true) {
            impressaoConsole();

            int opcao = new Scanner(System.in).nextInt();
            if (opcao == 0)
                break;

            switch (opcao) {
                case 1 -> calcularPrecoTotal();
                case 2 -> calcularTroco();
                case 3 -> exibirTotalVenda();
                case 4 -> salvarMes();
                case 5 -> exibirVendaDiaEscolhido();
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private static void impressaoConsole() {
        System.out.println("|----------------------------------------------|");
        System.out.println("|-------- CALCULADORA DONA GABRIELINHA --------|");
        System.out.println("|----------------------------------------------|");
        System.out.println("| Escolha uma das opções abaixo: --------------|");
        System.out.println("| [1] - Calcular Preço Total. -----------------|");
        System.out.println("| [2] - Calcular Troco. -----------------------|");
        System.out.println("| [3] - Exibir Vendas Do Dia Atual ------------|");
        System.out.println("| [4] - Registrar Venda Total Diária ----------|");
        System.out.println("| [5] - Verificar Venda - Selecionar Dia/Mês --|");
        System.out.println("| [0] - Sair. ---------------------------------|");
        System.out.println("|----------------------------------------------|");
        System.out.print("Insira a opção: ");
    }

    private static void calcularPrecoTotal() {
        System.out.print("Quantidade de itens:");
        int quantidade = new Scanner(System.in).nextInt();
        System.out.print("Preço por item:");
        double preco = new Scanner(System.in).nextDouble();
        double precoTotal = CalculadoraFuncoes.calcularPrecoTotal(quantidade, preco);
        CalculadoraFuncoes.salvar(precoTotal);
        System.out.println("Preço total: R$" + precoTotal);
    }

    private static void calcularTroco() {
        System.out.print("Valor Total da Compra: ");
        double total = new Scanner(System.in).nextDouble();
        System.out.print("Valor recebido: ");
        double recebido = new Scanner(System.in).nextDouble();
        double troco = CalculadoraFuncoes.calcularTroco(recebido, total);
        System.out.println("Troco a ser entregue para o cliente é: R$ " + troco);
    }

    private static void exibirTotalVenda() {
        CalculadoraFuncoes.exibirTotalVenda();
    }

    private static void salvarMes() {
        System.out.print("Qual dia?: ");
        int dia = new Scanner(System.in).nextInt();
        System.out.print("Qual mês?: ");
        int mes = new Scanner(System.in).nextInt();
        if (dia < 1 || dia > 29 || mes < 1 || mes > 12) {
            System.out.println("Dia ou mês inválido. Tente novamente.");
            return;
        }
        System.out.print("Qual o valor da venda?: ");
        double valorDeVenda = new Scanner(System.in).nextDouble();
        CalculadoraFuncoes.salvarMes(dia, mes, valorDeVenda);
        System.out.println("Valor da venda salvo para o dia " + dia + " do mês " + mes + ".");
    }

    private static void exibirVendaDiaEscolhido() {
        System.out.println("Digite o dia e o mês para obter o valor da venda (dia mês):");
        int diaEsc = new Scanner(System.in).nextInt();
        int mesEsc = new Scanner(System.in).nextInt();
        CalculadoraFuncoes.exibirVendaDiaEscolhido(diaEsc, mesEsc);
    }

    private static class CalculadoraFuncoes {

        private static final double[] LISTA_VENDAS = new double[100];
        private static int size = 0;
        private static double valorTotalDeVenda = 0;
        private static final double[][] LISTA_MENSAL = new double[29][12];

        public static double calcularPrecoTotal(int quantidade, double preco) {
            if (quantidade <= 0 || preco <= 0) {
                System.out.println("O valor deve ser maior que zero!");
                return Double.NaN;
            }
            return calcularDescontoEspecial(quantidade, preco);
        }

        private static double calcularDescontoEspecial(int quantidade, double preco) {
            if (quantidade > 10) {
                return (quantidade * preco) * 0.95;
            } else {
                return quantidade * preco;
            }
        }

        public static double calcularTroco(double recebido, double total) {
            if (recebido <= 0 || total <= 0) {
                System.out.println("O valor total da compra deve ser maior que zero, e o que você repassar também!");
                return Double.NaN;
            } else if (recebido < total) {
                System.out.println("O valor que você der de dinheiro, deve ser igual ou maior que o total da compra!");
                return Double.NaN;
            }
            return recebido - total;
        }

        public static void salvar(double valorVenda) {
            LISTA_VENDAS[size++] = valorVenda;
            valorTotalDeVenda += valorVenda;
        }

        public static void exibirTotalVenda() {
            System.out.println("Total de Vendas: " + size);
            System.out.println("Valor Total de Vendas: " + valorTotalDeVenda);
            System.out.print("Vendas: ");
            for (int i = 0; i < size; i++) {
                System.out.print(LISTA_VENDAS[i] + ", ");
            }
        }

        public static void salvarMes(int dia, int mes, double valorDeVenda) {
            LISTA_MENSAL[dia - 1][mes - 1] = valorDeVenda;
            valorTotalDeVenda = 0;
            for (int i = size; i >= 0; i--) {
                LISTA_VENDAS[i] = 0;
            }
            size = 0;
        }

        public static void exibirVendaDiaEscolhido(int diaEsc, int mesEsc) {
            if (diaEsc < 1 || diaEsc > 29 || mesEsc < 1 || mesEsc > 12) {
                System.out.println("Dia ou mês inválido. Tente novamente.");
                return;
            }
            System.out.println("O total de vendas para o dia escolhido foi dê: " + LISTA_MENSAL[diaEsc - 1][mesEsc - 1]);
        }
    }
}
