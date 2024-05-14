package listasProfSandroResolucao.primeirob.Lista03.test;

import listasProfSandroResolucao.primeirob.Lista03.domain.ExibirFuncoes;
import listasProfSandroResolucao.primeirob.Lista03.domain.SalvarFuncoes;

import java.util.Scanner;

public class Lista03Test {
    public static void main(String[] args) {
        while (true) {
            impressaoConsole();

            int opcao = new Scanner(System.in).nextInt();
            if (opcao == 0)
                break;

            switch (opcao) {

                case 1 -> ExibirFuncoes.exibirPrecoTotal();
                case 2 -> ExibirFuncoes.exibirTroco();
                case 3 -> ExibirFuncoes.exibirTotalVenda();
                case 4 -> SalvarFuncoes.salvarDiaMes();
                case 5 -> ExibirFuncoes.exibirVendaDiaEscolhido();
                default -> System.out.println("Opção inválida!");
            }
        }
    }

    private static void impressaoConsole() {
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
}
