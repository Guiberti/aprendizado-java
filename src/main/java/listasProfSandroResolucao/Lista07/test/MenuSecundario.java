package listasProfSandroResolucao.Lista07.test;

import listasProfSandroResolucao.Lista07.domain.Endereco;
import listasProfSandroResolucao.Lista07.domain.Loja;
import listasProfSandroResolucao.Lista07.utils.MainFunctions;

import java.util.Scanner;

public class MenuSecundario {
    public static void main(String[] args) {

        Loja loja = Loja.LojaBuilder.builder()
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
                .build();

        LojaGlobal.loja = loja;
        int opcaoMenuLoja;

        while (true) {
            System.out.println("\n\nMenu Loja: " + loja.getNomeFantasia());
            System.out.println("-----------------");

            System.out.println("1. Cadastrar Novo Cliente");
            System.out.println("2. Cadastrar Novo Item");
            System.out.println("3. Listar Vendedores");
            System.out.println("4. Listar Clientes");
            System.out.println("5. Listar Itens");
            System.out.println("6. Criar Novo Pedido");
            System.out.println("7. Processar Novo Pedido");
            System.out.println("0. Sair do Sistema");

            System.out.print("Digite sua opção: ");
            opcaoMenuLoja = new Scanner(System.in).nextInt();
            if (opcaoMenuLoja == 0) {
                System.out.println("Saindo do sistema...");
                break;
            }
            switch (opcaoMenuLoja) {
                case 1 -> MainFunctions.cadastrarCliente();
                case 2 -> MainFunctions.cadastrarNovoItem();
                case 3 -> MainFunctions.listarVendedores();
                case 4 -> MainFunctions.listarClientes();
                case 5 -> MainFunctions.listarItens();
                case 6 -> MainFunctions.criarNovoPedido();
                case 7 -> MainFunctions.processarNovoPedido();
                default -> System.out.println("Opcão Inválida...");
            }
        }
    }

    public static class LojaGlobal {
        public static Loja loja;
    }

}

