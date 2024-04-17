package listasProfSandroResolucao.Lista06.domain;

import java.time.LocalDate;
import java.util.List;

public class ProcessarPedido {
    private static long proximoIdPedido = 1;
    private Pedido pedido;

    public Pedido processar(Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataCriacao = LocalDate.now();
        LocalDate dataVencimentoReserva = dataCriacao.plusDays(3);

        Pedido pedido = Pedido.PedidoBuilder.builder()
                .id(proximoIdPedido++)
                .dataCriacao(dataCriacao)
                .dataPagamento(dataAtual)
                .dataVencimentoReserva(dataVencimentoReserva)
                .cliente(cliente)
                .vendedor(vendedor)
                .loja(loja)
                .itens(itens)
                .build();

        processar(pedido);
        return pedido;
    }

    public void processar(Pedido pedido) {
        this.pedido = pedido;
        if (pedido == null) {
            System.out.println("Pedido inválido. Não é possível processar.");
            return;
        }

        LocalDate dataAtual = LocalDate.now();

        if (verificarPagamento()) {
            System.out.println("\n\n    Pedido processado com sucesso!");
            System.out.println(pedido.gerarDescricaoVenda());
        } else {
            System.out.println("Não foi possível processar o pedido. A reserva está vencida.\n");
        }
    }

    private boolean verificarPagamento() {
        return !pedido.getDataCriacao().isAfter(pedido.getDataPagamento()) &&
                !pedido.getDataPagamento().isAfter(pedido.getDataVencimentoReserva());
    }
}

