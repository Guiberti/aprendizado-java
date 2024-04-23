package listasProfSandroResolucao.Lista07.test;

import listasProfSandroResolucao.Lista07.domain.Endereco;
import listasProfSandroResolucao.Lista07.domain.Loja;
import listasProfSandroResolucao.Lista07.utils.Functions;

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

            System.out.println("1. Cadastrar Gerente");
            System.out.println("2. Cadastrar Vendedores");
            System.out.println("3. Cadastrar Novo Cliente");
            System.out.println("4. Cadastrar Novo Item");
            System.out.println("5. Listar Clientes");
            System.out.println("6. Listar Itens");
            System.out.println("7. Listar Vendedores");
            System.out.println("8. Criar Novo Pedido");
            System.out.println("9. Processar Novo Pedido");
            System.out.println("0. Sair do Sistema");

            System.out.print("Digite sua opção: ");
            opcaoMenuLoja = new Scanner(System.in).nextInt();
            if (opcaoMenuLoja == 0) {
                System.out.println("Saindo do sistema...");
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
    }
    public static class LojaGlobal {
        public static Loja loja;
    }

}

