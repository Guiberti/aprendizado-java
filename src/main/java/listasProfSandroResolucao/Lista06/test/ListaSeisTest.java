package listasProfSandroResolucao.Lista06.test;

import listasProfSandroResolucao.Lista06.domain.*;

import java.text.DecimalFormat;
import java.time.LocalDate;
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
                .idade(23)
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
                .dataVencimentoReserva(LocalDate.of(2024, 4, 13))
                .cliente(cliente1)
                .vendedor(vendedor1)
                .loja(loja)
                .itens(List.of(item1, item2))
                .build();

        Pedido pedido2 = Pedido.PedidoBuilder.builder()
                .id(2L)
                .dataCriacao(LocalDate.of(2024, 4, 10))
                .dataPagamento(LocalDate.of(2024, 4, 12))
                .dataVencimentoReserva(LocalDate.of(2024, 4, 13))
                .cliente(cliente2)
                .vendedor(vendedor2)
                .loja(loja)
                .itens(List.of(item3))
                .build();

        // Criação e configuração da instância de ProcessarPedido
        ProcessarPedido processarPedido = new ProcessarPedido(loja);

        // Processamento dos pedidos
        Pedido pedidoProcessado1 = processarPedido.processar(
                pedido1.getLoja(), pedido1.getCliente(), pedido1.getVendedor(), pedido1.getItens(),
                pedido1.getDataCriacao(), pedido1.getDataPagamento(), pedido1.getDataVencimentoReserva()
        );
        Pedido pedidoProcessado2 = processarPedido.processar(
                pedido2.getLoja(), pedido2.getCliente(), pedido2.getVendedor(), pedido2.getItens(),
                pedido2.getDataCriacao(), pedido2.getDataPagamento(), pedido2.getDataVencimentoReserva()
        );


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

        // Apresentação dos pedidos processados
        System.out.println("\n==================== PEDIDOS PROCESSADOS =======================");
        if (pedidoProcessado1 != null) {
            System.out.println("Pedido 1 processado com sucesso:");
            System.out.println(pedidoProcessado1.gerarDescricaoVenda());
        } else {
            System.out.println("Falha ao processar o pedido 1.");
        }

        if (pedidoProcessado2 != null) {
            System.out.println("Pedido 2 processado com sucesso:");
            System.out.println(pedidoProcessado2.gerarDescricaoVenda());
        } else {
            System.out.println("Falha ao processar o pedido 2.");
        }
    }
}
