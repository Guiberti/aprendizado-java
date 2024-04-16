package listasProfSandroResolucao.Lista06.domain;

import java.time.LocalDate;
import java.util.List;

public class ProcessarPedido {
    private final Loja loja;
    public ProcessarPedido(Loja loja) {
        this.loja = loja;
    }
    public Pedido processar(Loja loja, Cliente cliente, Vendedor vendedor, List<Item> itens, LocalDate dataCriacao,
                            LocalDate dataPagamento, LocalDate dataVencimentoReserva) {
        Pedido pedido = Pedido.PedidoBuilder.builder()
                .loja(loja)
                .cliente(cliente)
                .vendedor(vendedor)
                .itens(itens)
                .dataCriacao(dataCriacao)
                .dataPagamento(dataPagamento)
                .dataVencimentoReserva(dataVencimentoReserva)
                .build();

        if (confirmarPagamento(dataCriacao, dataPagamento)) {
            System.out.println("Pagamento confirmado! Pedido registrado com sucesso.");
            return pedido;
        } else {
            System.out.println("Falha no pagamento: reserva vencida ou data inválida.");
            return null;
        }
    }
    private boolean confirmarPagamento(LocalDate dataCriacao, LocalDate dataPagamento) {
        LocalDate dataVencimentoReserva = dataCriacao.plusDays(3); // Vencimento da reserva após 3 dias

        return !dataCriacao.isAfter(dataVencimentoReserva) && dataCriacao.isBefore(dataPagamento);
    }


}
