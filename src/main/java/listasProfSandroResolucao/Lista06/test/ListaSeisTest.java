package listasProfSandroResolucao.Lista06.test;

import listasProfSandroResolucao.Lista06.domain.*;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ListaSeisTest {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00"); // Define duas casas decimais

        // Criação e configuração do Gerente
        Gerente gerente = Gerente.GerenteBuilder.builder()
                .nomePessoa("Vânia")
                .idade(28)
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Avenida OLZ")
                .loja(null)
                .salarioBase(2200)
                .salarioRecebido(Arrays.asList(2200.0, 2500.0, 2000.0))
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
                .salarioRecebido(Arrays.asList(1800.0, 1700.0, 1850.0))
                .build();

        Vendedor vendedor2 = Vendedor.VendedorBuilder.builder()
                .nomePessoa("Talita")
                .idade(23)
                .loja(null)
                .cidade("Sta Lucia")
                .bairro("Centro")
                .rua("Rua B")
                .salarioBase(1900)
                .salarioRecebido(Arrays.asList(1900.0, 1900.0, 2200.0))
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
                .dataCriacao(LocalDate.of(2024, 4, 25))
                .dataPagamento(LocalDate.of(2024, 4, 26))
                .dataVencimentoReserva(LocalDate.of(2024, 4, 28))
                .cliente(cliente1)
                .vendedor(vendedor1)
                .loja(loja)
                .itens(List.of(item1, item2))
                .build();


        Pedido pedido2 = Pedido.PedidoBuilder.builder()
                .id(2L)
                .dataCriacao(LocalDate.of(2024, 4, 16))
                .dataPagamento(LocalDate.of(2024, 4, 17))
                .dataVencimentoReserva(LocalDate.of(2024, 4, 19))
                .cliente(cliente2)
                .vendedor(vendedor2)
                .loja(loja)
                .itens(List.of(item3))
                .build();


        //Apresentações
        System.out.println("\n==================== LOJA =======================");
        System.out.println(loja.apresentarse());
        System.out.println("Quantidade de clientes: " + loja.contarClientes());
        System.out.println("Quantidade de vendedores: " + loja.contarVendedores());

        System.out.println("\n==================== GERENTES =======================");
        System.out.println(gerente.apresentarse());
        System.out.println("Média salárial: " + df.format(gerente.calcularMedia()));
        System.out.println("Bônus salarial: " + df.format(gerente.calcularBonus()));

        System.out.println("\n==================== VENDEDORES =======================");
        System.out.println("Vendedor 1: ");
        System.out.println(vendedor1.apresentarse());
        System.out.println("Média salárial: " + df.format(vendedor1.calcularMedia()));
        System.out.println("Bônus salarial: " + df.format(vendedor1.calcularBonus()));

        System.out.println("\nVendedor 2: ");
        System.out.println(vendedor2.apresentarse());
        System.out.println("Média salárial: " + df.format(vendedor2.calcularMedia()));
        System.out.println("Bônus salarial: " + df.format(vendedor2.calcularBonus()));

        System.out.println("\n==================== CLIENTES =======================");
        System.out.println(cliente1.apresentarse());
        System.out.println(cliente2.apresentarse());

        // Apresentação dos Itens
        System.out.println("\n==================== ITENS =======================");
        System.out.println(item1.gerarDescricao());
        System.out.println(item2.gerarDescricao());

        // Apresentação dos Pedidos
        System.out.println("\n==================== PEDIDOS =======================");
        System.out.println(pedido1.gerarDescricaoVenda());
        System.out.println(pedido2.gerarDescricaoVenda());

    }
}