package listasProfSandroResolucao.Lista07.test;

import listasProfSandroResolucao.Lista07.domain.Cliente;
import listasProfSandroResolucao.Lista07.domain.Endereco;
import listasProfSandroResolucao.Lista07.domain.Loja;
import listasProfSandroResolucao.Lista07.domain.Vendedor;
import listasProfSandroResolucao.Lista07.utils.Functions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    public static List<Loja> lojas;
    public static List<Vendedor> vendedoresDaLoja;
    public static List<Cliente> clientesDaLoja;

    private static int selectedStoreIndex = -1;

    public static void main(String[] args) {
        lojas = new ArrayList<>();
        vendedoresDaLoja = new ArrayList<>();
        clientesDaLoja = new ArrayList<>();


        lojas.add(Loja.LojaBuilder.builder()
                .nomeFantasia("My Plant")
                .razaoSocial("plantmay")
                .cnpj("12345678912345")
                .endereco(Endereco.EnderecoBuilder.builder()
                        .estado("Paraná")
                        .cidade("Santa Lúcia")
                        .bairro("Centro")
                        .rua("Avenida Orlando Luiz Zampronio")
                        .numero(261)
                        .complemento("Loja")
                        .build())
                .clientes(null)
                .vendedores(null)
                .build());
        lojas.add(Loja.LojaBuilder.builder()
                .nomeFantasia("Magazine Móveis")
                .razaoSocial("magalu")
                .cnpj("17235604000110")
                .endereco(Endereco.EnderecoBuilder.builder()
                        .build())
                .clientes(null)
                .vendedores(null)
                .build());

        menuPrincipal();
    }

    private static void menuPrincipal() {
        int opcao;

        while (true) {


            System.out.println("\n\nMenu Principal");
            System.out.println("-----------------");

            for (int i = 0; i < lojas.size(); i++) {
                System.out.println((i + 1) + ". " + lojas.get(i).getNomeFantasia());
            }

            System.out.println("0. Sair");

            System.out.print("Digite sua opção: ");
            opcao = new Scanner(System.in).nextInt();
            if (opcao == 0) {
                System.out.println("Saindo do sistema ...");
                break;
            }

            switch (opcao) {
                case 1 -> acessarMenuLoja(0);
                case 2 -> acessarMenuLoja(1);
                default -> System.out.println("Opção inválida!");
            }

        }
    }

    public static Loja acessarMenuLoja(int indiceLoja) {
        if (indiceLoja < 0 || indiceLoja >= lojas.size()) {
            System.out.println("Loja inválida!");
            return null;
        }
        selectedStoreIndex = indiceLoja;

        Loja lojaAtual = lojas.get(indiceLoja);

        int opcaoMenuLoja;

        while (true) {
            System.out.println("\n\nMenu Loja: " + lojaAtual.getNomeFantasia());
            System.out.println("-----------------");

            System.out.println("1. Cadastrar Gerente");
            System.out.println("2. Cadastrar Vendedores");
            System.out.println("3. Cadastrar Novo Cliente");
            System.out.println("4. Cadastrar Novo Item");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Itens");
            System.out.println("7. Listar Vendedores");
            System.out.println("8. Criar Novo Pedido");
            System.out.println("9. Processar Novo Pedido");
            System.out.println("0. Voltar para o Menu Principal");

            System.out.print("Digite sua opção: ");
            opcaoMenuLoja = new Scanner(System.in).nextInt();
            if (opcaoMenuLoja == 0) {
                System.out.println("Voltando para o menu principal...");
                break;
            }
            switch (opcaoMenuLoja) {
                case 1 -> Functions.cadastrarGerente();
                case 2 -> Functions.cadastrarVendedor();
                case 3 -> Functions.cadastrarCliente();
                case 4 -> Functions.cadastrarNovoItem();
                case 5 -> Functions.listarClientes();
                case 6 -> Functions.listarItens();
                case 7 -> Functions.listarVendedores();
                case 8 -> Functions.criarNovoPedido();
                case 9 -> Functions.processarNovoPedido();
                default -> System.out.println("Opcão Inválida...");
            }
        }
        return lojaAtual;
    }

    public static int getSelectedStoreIndex() {
        return selectedStoreIndex;
    }

    public static List<Loja> getLojas() {
        return lojas;
    }
}


