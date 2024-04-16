package listasProfSandroResolucao.Lista06.test;

import listasProfSandroResolucao.Lista06.domain.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaSeisTest {
    public static void main(String[] args) {

        // Criação e configuração do Gerente
        Gerente gerente = Gerente.GerenteBuilder.builder()
                .nomePessoa("Vânia")
                .idade(28)
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Avenida OLZ")
                .loja(null)
                .salarioBase(2200)
                .salarioRecebido(new double[]{5000, 3900, 8100})
                .build();

        // Criação e configuração dos Vendedores
        Vendedor vendedor1 = Vendedor.VendedorBuilder.builder()
                .nomePessoa("Guilherme")
                .idade(18)
                .loja(null)
                .cidade("Sta Lucia")
                .bairro("Centro")
                .rua("Av OLZ")
                .salarioBase(1800)
                .salarioRecebido(new double[]{1500, 1800, 1900})
                .build();

        Vendedor vendedor2 = Vendedor.VendedorBuilder.builder()
                .nomePessoa("Talita")
                .idade(45)
                .loja(null)
                .cidade("Sta Lucia")
                .bairro("Centro")
                .rua("Rua B")
                .salarioBase(1900)
                .salarioRecebido(new double[]{1600, 1300, 1200})
                .build();

        // Criação e configuração dos Clientes
        Cliente cliente1 = Cliente.ClienteBuilder.builder()
                .nomePessoa("Fátima")
                .idade(54)
                .cidade("Sta Lucia")
                .bairro("Centro")
                .rua("Av OLZ")
                .build();
        Cliente cliente2 = Cliente.ClienteBuilder.builder()
                .nomePessoa("Dalci")
                .idade(62)
                .cidade("Sta Lucia")
                .bairro("Centro")
                .rua("Av Brasil")
                .build();

        // Criação e configuração da Loja
        Loja loja = Loja.LojaBuilder.builder()
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Avenida OLZ")
                .nomeFantasia("Magazine Móveis")
                .razaoSocial("magamo")
                .cnpj(17235604000110L)
                .vendedores(new Vendedor[]{vendedor1, vendedor2})
                .clientes(new Cliente[]{cliente1, cliente2})
                .build();

        // Associa os vendedores à loja
        vendedor1.setLoja(loja);
        vendedor2.setLoja(loja);
        // Associa o gerente à loja
        gerente.setLoja(loja);

        //Criaçào e Configuração dos Itens
        Item item1 = Item.ItemBuilder.builder()
                .id(15L)
                .nome("Electrolux LED-17")
                .tipo("Lavadora")
                .valor(2499.00)
                .build();

        Item item2 = Item.ItemBuilder.builder()
                .id(16L)
                .nome("Cafeteira Cadence")
                .tipo("Cafeteira")
                .valor(249.00)
                .build();

        Item item3 = Item.ItemBuilder.builder()
                .id(17L)
                .nome("Sanduicheira Cadence")
                .tipo("Sanduicheira")
                .valor(99.00)
                .build();

        //Criaçào e Configuração do Pedido
        Pedido pedido1 = Pedido.PedidoBuilder.builder()
                .id(1L)
                .dataCriacao(LocalDate.of(2024, 4, 10))
                .dataPagamento(LocalDate.of(2024, 4, 15))
                .dataVencimentoReserva(LocalDate.of(2024, 4, 25))
                .cliente(cliente1)
                .vendedor(vendedor1)
                .loja(loja)
                .itens(List.of(item1, item2))
                .build();

        Pedido pedido2= Pedido.PedidoBuilder.builder()
                .id(2L)
                .dataCriacao(LocalDate.of(2024, 4, 10))
                .dataPagamento(LocalDate.of(2024, 4, 15))
                .dataVencimentoReserva(LocalDate.of(2024, 4, 25))
                .cliente(cliente2)
                .vendedor(vendedor2)
                .loja(loja)
                .itens(List.of(item3))
                .build();


        System.out.println("\n==================== LOJA =======================");
        System.out.println(loja.apresentarse());
        System.out.println("Quantidade de clientes: %d\\n" + loja.contarClientes());
        System.out.println("Quantidade de vendedores: %d\\n" + loja.contarVendedores());

        System.out.println("\n==================== GERENTES =======================");
        System.out.println(gerente.apresentarse());
        System.out.println("Minha média salárial: " + gerente.calcularMedia());
        System.out.println("Meu bônus salarial: " + gerente.calcularBonus());

        System.out.println("\n==================== VENDEDORES =======================");
        System.out.println("Vendedor 1: ");
        System.out.println(vendedor1.apresentarse());
        System.out.println("Minha média salárial: " + vendedor1.calcularMedia());
        System.out.println("Meu bônus salarial: " + vendedor1.calcularBonus());

        System.out.println("\nVendedor 2: ");
        System.out.println(vendedor2.apresentarse());
        System.out.println("Minha média salárial: " + vendedor2.calcularMedia());
        System.out.println("Meu bônus salarial: " + vendedor2.calcularBonus());

        System.out.println("\n==================== CLIENTES =======================");
        System.out.println(cliente1.apresentarse());
        System.out.println(cliente2.apresentarse());

        System.out.println("\n==================== PEDIDOS =======================");
        System.out.println(pedido1.gerarDescricaoVenda());
        System.out.println(pedido2.gerarDescricaoVenda());

    }
}
