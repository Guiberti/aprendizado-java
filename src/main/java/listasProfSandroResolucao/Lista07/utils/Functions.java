package listasProfSandroResolucao.Lista07.utils;

import listasProfSandroResolucao.Lista07.domain.Endereco;
import listasProfSandroResolucao.Lista07.domain.Gerente;
import listasProfSandroResolucao.Lista07.test.MenuPrincipal;

import java.util.Scanner;

public class Functions {

    public static void cadastrarGerente() {
        System.out.println("Insira o nome do seu Gerente: ");
        String nomeGerente = new Scanner(System.in).nextLine();

        System.out.println("Insira a idade do Gerente: ");
        Integer idadeGerente = new Scanner(System.in).nextInt();

        System.out.println("Insira o salário base do seu Gerente: ");
        Double salarioBaseGerente = new Scanner(System.in).nextDouble();

        Endereco endereco = Endereco.EnderecoBuilder.builder()

                .build();

        Gerente gerente = Gerente.GerenteBuilder.builder()
                .nomePessoa(nomeGerente)
                .idade(idadeGerente)
                .salarioBase(salarioBaseGerente)
                .salarioRecebido(null)
                .loja(null)
                .endereco()
                .build();

    }
    public static void cadastrarVendedor() {
        System.out.println("aaaa");

    }
    public static void cadastrarCliente() {
        System.out.println("aaaa");

    }
    public static void cadastrarNovoItem() {
        System.out.println("aaaa");

    }

    public static void listarClientes(){
        System.out.println("aaaa");

    }

    public static void listarVendedores(){
        System.out.println("aaaa");

    }
    public static void listarItens() {
        System.out.println("aaaa");

    }

    public static void criarNovoPedido() {
        System.out.println("aaaa");

    }

    public static void processarNovoPedido() {
        System.out.println("aaaa");

    }
}
