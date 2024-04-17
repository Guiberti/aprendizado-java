package listasProfSandroResolucao.Lista06.domain;

import java.time.LocalDate;
import java.util.List;

public class ProcessarPedido {
    public void processar(Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        LocalDate dataAtual = LocalDate.now();
        LocalDate dataCriacao = LocalDate.now();
        LocalDate dataPagamento = dataAtual;
        LocalDate dataVencimentoReserva = dataCriacao.plusDays(3);

        //Incrementa automaticamente o ID
        long idPedido = proximoIdPedido++;

        Pedido pedido = Pedido.PedidoBuilder.builder()
                .id(idPedido)
                .dataCriacao(dataCriacao)
                .dataPagamento(dataPagamento)
                .dataVencimentoReserva(dataVencimentoReserva)
                .cliente(cliente)
                .vendedor(vendedor)
                .loja(loja)
                .itens(itens)
                .build();

        processar(pedido);
    }

    public void processar(Pedido pedido) {
        if (pedido == null) {
            System.out.println("Pedido inválido. Não é possível processar.");
            return;
        }

        LocalDate dataAtual = LocalDate.now();

        if (confirmarPagamento(pedido.getDataCriacao(), pedido.getDataVencimentoReserva(), pedido.getDataPagamento())) {
            System.out.println("Pedido processado com sucesso!");
            System.out.println(pedido.gerarDescricaoVenda());
        } else {
            System.out.println("Não foi possível processar o pedido. A reserva está vencida.");
        }
    }

    private boolean confirmarPagamento(LocalDate dataAtual, LocalDate dataVencimentoReserva, LocalDate dataPagamento) {
        return !dataAtual.isAfter(dataVencimentoReserva) && !dataPagamento.isAfter(dataVencimentoReserva);
    }

    // Variável para controlar o próximo ID do pedido
    private static long proximoIdPedido = 1;
}

