package listasProfSandroResolucao.Lista07.utils;


import listasProfSandroResolucao.Lista07.domain.*;
import listasProfSandroResolucao.Lista07.test.MenuSecundario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainFunctions {
    private static Loja lojaGlobal = MenuSecundario.LojaGlobal.loja;
    private static List<Cliente> clientesDaLoja = new ArrayList<>();
    private static List<Vendedor> vendedoresDaLoja = new ArrayList<>();
    private static List<Gerente> gerentesDaLoja = new ArrayList<>();
    private static List<Item> itensDaLoja = new ArrayList<>();

    public static void gerentes() {
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
                .valorFixo1(17000)
                .valorFixo2(18000)
                .valorFixo3(14900)
                .endereco(endereco)
                .build();
    }

    public static void cadastrarVendedor() {

        System.out.println("Insira o nome do seu Vendedor(a): ");
        String nomeVendedor = new Scanner(System.in).nextLine();

        System.out.println("Insira a idade do Vendedor(a): ");
        Integer idadeVendedor = new Scanner(System.in).nextInt();

        System.out.println("Insira o salário base do seu Vendedor(a): ");
        Double salarioBaseVendedor = new Scanner(System.in).nextDouble();

        System.out.println("Qual estado seu Vendedor(a) reside: ");
        String estadoVendedor = new Scanner(System.in).nextLine();

        System.out.println("Qual cidade seu Vendedor(a) reside: ");
        String cidadeVendedor = new Scanner(System.in).nextLine();

        System.out.println("Qual bairro seu Vendedor(a) reside: ");
        String bairroVendedor = new Scanner(System.in).nextLine();

        System.out.println("Qual rua seu Vendedor(a) reside: ");
        String ruaVendedor = new Scanner(System.in).nextLine();

        System.out.println("Qual o número da casa em que seu Vendedor(a) reside: ");
        Integer numeroCasaVendedor = new Scanner(System.in).nextInt();

        System.out.println("Passe um complemento do endereço do seu Vendedor(a): ");
        String complementoVendedor = new Scanner(System.in).nextLine();

        Endereco endereco = Endereco.EnderecoBuilder.builder()
                .estado(estadoVendedor)
                .cidade(cidadeVendedor)
                .bairro(bairroVendedor)
                .rua(ruaVendedor)
                .numero(numeroCasaVendedor)
                .complemento(complementoVendedor)
                .build();

        Vendedor vendedor = Vendedor.VendedorBuilder.builder()
                .nomePessoa(nomeVendedor)
                .idade(idadeVendedor)
                .salarioBase(1800)
                .salarioRecebido(null)
                .endereco(endereco)
                .loja(lojaGlobal)
                .build();

        vendedoresDaLoja.add(vendedor);
        System.out.println("Vendedor cadastrado com sucesso...");

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

    public static void listarVendedores() {
        System.out.println("\n\nLista de Vendedores da Loja:" + lojaGlobal.getNomeFantasia());
        System.out.println("----------------------------------");

        if (vendedoresDaLoja.isEmpty()) {
            System.out.println("Ainda não há vendedores cadastrados nessa loja.");
        } else {
            for (Vendedor vendedor : vendedoresDaLoja) {
                System.out.println(vendedor.apresentarse());
            }
        }

        System.out.println("\nTotal de Vendedores: " + vendedoresDaLoja.size());
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

    public static void criarNovoPedido() {
        System.out.println("aaaa");

    }

    public static void processarNovoPedido() {
        System.out.println("aaaa");

    }
}

