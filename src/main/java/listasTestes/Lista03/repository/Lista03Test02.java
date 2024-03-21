package listasTestes.Lista03.repository;

import listasTestes.Lista03.domain.SalvarFuncoes;

import java.text.NumberFormat;
import java.util.Scanner;

public class Lista03Test02 {

    private static final NumberFormat CURRENCY_FORMAT = NumberFormat.getCurrencyInstance();
    public static void main(String[] args) {
        while (true) {
            int opcao = new Scanner(System.in).nextInt();
            if (opcao == 0){
                break;
            }
            imprimirConsole();

            switch (opcao){
                case 1 -> ExibirFuncoes.exibirPrecoTotal();
                case 2 -> {}
                case 3 -> {}
                case 4 -> {}
                case 5 -> {}
                default -> System.out.println("Opção Inválida");
            }
        }
    }

    private static void imprimirConsole() {
        System.out.println("|----------------------------------------------|");
        System.out.println("|          CALCULADORA DONA GABRIELINHA        |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| Escolha uma das opções abaixo:               |");
        System.out.println("|----------------------------------------------|");
        System.out.println("| [1] - Calcular Preço Total.                  |");
        System.out.println("| [2] - Calcular Troco.                        |");
        System.out.println("| [3] - Exibir Vendas Do Dia Atual             |");
        System.out.println("| [4] - Registrar Venda - Selecionar Dia/Mês   |");
        System.out.println("| [5] - Verificar Vendas - Selecionar Dia/Mês  |");
        System.out.println("| [0] - Sair.                                  |");
        System.out.println("|----------------------------------------------|");
        System.out.print("Insira a opção: ");
    }

    public static class ExibirFuncoes {
        private static void exibirPrecoTotal(){
            System.out.println("Insira a quantidade de plantas:");
            int qntd = new Scanner(System.in).nextInt();
            System.out.println("Insira o valor unitário de cada planta");
            double preco = new Scanner(System.in).nextDouble();
            if (qntd <= 0 || preco <= 0){
                System.out.println("Insira um valor válido!");
                return;
            }
            CalcularFuncoes.calcularPrecoTotal(qntd, preco);
        }

    }

    public static class CalcularFuncoes {
        public static double calcularPrecoTotal(int qtnd, double preco) {
            double total;
            if (qtnd > 10){
                total = (preco * qtnd) * 0.95;
            } else {
                total = preco * qtnd;
            }
            SalvarFuncoes.salvar(total);
            return total;
        }
        public static double calcularTroco(double rec, double tot){
            return rec - tot;
        }
    }

    public static class SalvarFuncoes {
        private static final double[] LISTA_VENDAS = new double[100];
        private static int size;

        private static double valorDeVendaFinal;
        private static final double[][] LISTA_MES = new double[29][12];

        private static void salvar(double valorDeVendaFinal) {
            LISTA_VENDAS[size++] = valorDeVendaFinal;
            valorDeVendaFinal += valorDeVendaFinal;
        }


    }

}
