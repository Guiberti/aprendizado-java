package listasProfSandroResolucao.Lista07.utils;

import listasProfSandroResolucao.Lista07.domain.*;
import listasProfSandroResolucao.Lista07.test.MenuPrincipal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainFunctions {
    private static Loja lojaGlobal = MenuPrincipal.LojaGlobal.loja;
    private static List<Cliente> clientesDaLoja = new ArrayList<>();
    private static List<Vendedor> vendedoresDaLoja = new ArrayList<>();
    private static List<Gerente> gerentesDaLoja = new ArrayList<>();
    private static List<Item> itensDaLoja = new ArrayList<>();
    private static List<Pedido> pedidosDaLoja = new ArrayList<>();
    private static long proximoIdPedido = 1;


    public static void gerente() {
        Endereco endereco = Endereco.EnderecoBuilder.builder()
                .estado("Paraná")
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Rua das Palmeiras")
                .numero(345)
                .complemento("Casa")
                .build();

        Gerente gerente = Gerente.GerenteBuilder.builder()
                .nomePessoa("Sandro Ramos")
                .idade(25)
                .loja(lojaGlobal)
                .salarioBase(15600)
                .salarioRecebido(Arrays.asList(15600.00, 15700.00, 16000.00))
                .endereco(endereco)
                .build();

        gerentesDaLoja.add(gerente);
    }

    public static void vendedores() {
        Endereco endereco = Endereco.EnderecoBuilder.builder()
                .estado("Paraná")
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Rua das Palmeiras")
                .numero(35)
                .complemento("Casa")
                .build();

        Vendedor vendedor1 = Vendedor.VendedorBuilder.builder()
                .nomePessoa("Guilherme")
                .idade(18)
                .loja(lojaGlobal)
                .salarioBase(2000)
                .salarioRecebido(Arrays.asList(2100.00, 1950.00, 2150.00))
                .endereco(endereco)
                .build();

        Vendedor vendedor2 = Vendedor.VendedorBuilder.builder()
                .nomePessoa("Rafael")
                .idade(18)
                .loja(lojaGlobal)
                .salarioBase(2000)
                .salarioRecebido(Arrays.asList(2100.00, 1950.00, 2150.00))
                .endereco(endereco)
                .build();

        Vendedor vendedor3 = Vendedor.VendedorBuilder.builder()
                .nomePessoa("Anderson")
                .idade(18)
                .loja(lojaGlobal)
                .salarioBase(2000)
                .salarioRecebido(Arrays.asList(2100.00, 1950.00, 2150.00))
                .endereco(endereco)
                .build();

        vendedoresDaLoja.add(vendedor1);
        vendedoresDaLoja.add(vendedor2);
        vendedoresDaLoja.add(vendedor3);
    }

    public static void cadastrarCliente() {
        System.out.println("Insira o nome do seu Cliente: ");
        String nomeCliente = new Scanner(System.in).nextLine();

        System.out.println("Insira a idade do Cliente: ");
        Integer idadeCliente = new Scanner(System.in).nextInt();

        System.out.println("Qual estado seu Cliente reside: ");
        String estadoCliente = new Scanner(System.in).nextLine();

        System.out.println("Qual cidade seu Cliente reside: ");
        String cidadeCliente = new Scanner(System.in).nextLine();

        System.out.println("Qual bairro seu Cliente reside: ");
        String bairroCliente = new Scanner(System.in).nextLine();

        System.out.println("Qual rua seu Cliente reside: ");
        String ruaCliente = new Scanner(System.in).nextLine();

        System.out.println("Qual o número da casa em que seu Cliente reside: ");
        Integer numeroCasaCliente = new Scanner(System.in).nextInt();

        System.out.println("Passe um complemento do endereço do seu Cliente: ");
        String complementoCliente = new Scanner(System.in).nextLine();

        Endereco endereco = Endereco.EnderecoBuilder.builder()
                .estado(estadoCliente)
                .cidade(cidadeCliente)
                .bairro(bairroCliente)
                .rua(ruaCliente)
                .numero(numeroCasaCliente)
                .complemento(complementoCliente)
                .build();

        Cliente cliente = Cliente.ClienteBuilder.builder()
                .nomePessoa(nomeCliente)
                .idade(idadeCliente)
                .endereco(endereco)
                .build();

        clientesDaLoja.add(cliente);
        System.out.println("Cliente cadastrado com sucesso...");
    }

    public static void cadastrarNovoItem() {

        System.out.println("Insira o ID do novo Item: ");
        Long idItem = new Scanner(System.in).nextLong();

        System.out.println("Insira o nome do Item: ");
        String nomeItem = new Scanner(System.in).nextLine();

        System.out.println("Insira o tipo do Item: ");
        String tipoItem = new Scanner(System.in).nextLine();

        System.out.println("Insira o valor do Item: ");
        Double valorItem = new Scanner(System.in).nextDouble();

        Item item = Item.ItemBuilder.builder()
                .id(idItem)
                .nome(nomeItem)
                .tipo(tipoItem)
                .valor(valorItem)
                .build();

        itensDaLoja.add(item);
        System.out.println("Item cadastrado com sucesso...");
    }

    public static void listarClientes() {

        System.out.println("\n\nLista de Clientes da Loja:" + lojaGlobal.getNomeFantasia());
        System.out.println("----------------------------------");

        if (clientesDaLoja.isEmpty()) {
            System.out.println("Ainda não há clientes cadastrados nessa loja.");
        } else {
            for (Cliente cliente : clientesDaLoja) {
                System.out.println(cliente.apresentarse());
            }
        }

        System.out.println("\nTotal de Clientes:" + clientesDaLoja.size());
    }

    public static void listarItens() {
        System.out.println("\n\nLista de Itens da Loja:" + lojaGlobal.getNomeFantasia());
        System.out.println("----------------------------------");

        if (itensDaLoja.isEmpty()) {
            System.out.println("Ainda não há itens cadastrados nessa loja.");
        } else {
            for (Item item : itensDaLoja) {
                System.out.println(item.gerarDescricao());
            }
        }

        System.out.println("\nTotal de Itens: " + itensDaLoja.size());
    }

    public static Cliente encontrarClientePorNome(String nomeCliente) {
        for (Cliente cliente : clientesDaLoja) {
            if (cliente.getNomePessoa().equalsIgnoreCase(nomeCliente)) {
                return cliente;
            }
        }
        return null;
    }

    public static Vendedor encontrarVendedorPorNome(String nomeVendedor) {
        for (Vendedor vendedor : vendedoresDaLoja) {
            if (vendedor.getNomePessoa().equalsIgnoreCase(nomeVendedor)) {
                return vendedor;
            }
        }
        return null;
    }

    public static Item encontrarItemPorId(long idItem) {
        for (Item item : itensDaLoja) {
            if (item.getId() == idItem) {
                return item;
            }
        }
        return null;
    }

    public static void criarNovoPedido() {

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = new Scanner(System.in).nextLine();
        Cliente cliente = encontrarClientePorNome(nomeCliente);
        if (cliente == null) {
            System.out.println("Cliente não encontrado. Pedido não pode ser criado.");
            return;
        }

        System.out.println("Digite o nome do vendedor: ");
        String nomeVendedor = new Scanner(System.in).nextLine();
        Vendedor vendedor = encontrarVendedorPorNome(nomeVendedor);
        if (vendedor == null) {
            System.out.println("Vendedor não encontrado. Pedido não pode ser criado.");
            return;
        }

        List<Item> itensSelecionados = new ArrayList<>();
        boolean continuarAdicionandoItens = true;
        while (continuarAdicionandoItens) {
            System.out.println("Digite o ID do item a ser adicionado ao pedido (ou 0 para sair): ");
            long idItem = new Scanner(System.in).nextLong();
            if (idItem == 0) {
                continuarAdicionandoItens = false;
            } else {
                Item itemEncontrado = encontrarItemPorId(idItem);
                if (itemEncontrado != null) {
                    itensSelecionados.add(itemEncontrado);
                    System.out.println("Item adicionado ao pedido com sucesso!");
                } else {
                    System.out.println("Item não encontrado na loja. Tente novamente.");
                }
            }
        }

        Pedido pedido = new Pedido.PedidoBuilder()
                .id(proximoIdPedido++)
                .cliente(cliente)
                .vendedor(vendedor)
                .loja(lojaGlobal)
                .itens(itensSelecionados)
                .build();

        pedidosDaLoja.add(pedido);

        System.out.println("Pedido criado com sucesso!");
    }

    public static void processarNovoPedido() {
        System.out.println("aaaa");

    }
}

