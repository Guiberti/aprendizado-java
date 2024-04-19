package listasProfSandroResolucao.Lista06.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pedido {
    private Long id;
    private LocalDate dataCriacao;
    private LocalDate dataPagamento;
    private LocalDate dataVencimentoReserva;
    private Cliente cliente;
    private Vendedor vendedor;
    private Loja loja;
    private List<Item> itens;

    public Pedido(Long id,
                  Cliente cliente, Vendedor vendedor, Loja loja, List<Item> itens) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.loja = loja;
        this.itens = itens;
        this.dataCriacao = LocalDate.now();
        this.dataPagamento = dataCriacao.plusDays(1);
        this.dataVencimentoReserva = dataCriacao.plusDays(3);
    }
    public Long getId() {
        return id;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }
    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public LocalDate getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Loja getLoja() {
        return loja;
    }

    public List<Item> getItens() {
        return itens;
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValor();
        }
        return total;
    }

    public String gerarDescricaoVenda() {
        String descricao = "================== Pedido ======================\n";
        descricao += "ID Pedido: " + id + "\n";
        descricao += "Data de Criação: " + dataCriacao.format(DateTimeFormatter.ISO_DATE) + "\n";
        descricao += "Cliente: " + cliente.getNomePessoa() + "\n";
        descricao += "Vendedor: " + vendedor.getNomePessoa() + "\n";
        descricao += "Loja: " + loja.getNomeFantasia() + "\n";
        descricao += "\n";
        descricao += "Itens:\n";
        for (Item item : itens) {
            descricao += item.gerarDescricao() + "\n";
        }
        descricao += "\n";
        descricao += "Valor Total: R$" + String.format("%.2f", calcularValorTotal());
        descricao += "\n=============================================\n";
        return descricao;
    }


    public static final class PedidoBuilder {
        private Long id;
        private LocalDate dataCriacao;
        private LocalDate dataPagamento;
        private LocalDate dataVencimentoReserva;
        private Cliente cliente;
        private Vendedor vendedor;
        private Loja loja;
        private List<Item> itens;

        private PedidoBuilder() {
        }

        public static PedidoBuilder builder() {
            return new PedidoBuilder();
        }

        public PedidoBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public PedidoBuilder dataCriacao(LocalDate dataCriacao) {
            this.dataCriacao = dataCriacao;
            return this;
        }

        public PedidoBuilder dataPagamento(LocalDate dataPagamento) {
            this.dataPagamento = dataPagamento;
            return this;
        }

        public PedidoBuilder dataVencimentoReserva(LocalDate dataVencimentoReserva) {
            this.dataVencimentoReserva = dataVencimentoReserva;
            return this;
        }

        public PedidoBuilder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public PedidoBuilder vendedor(Vendedor vendedor) {
            this.vendedor = vendedor;
            return this;
        }

        public PedidoBuilder loja(Loja loja) {
            this.loja = loja;
            return this;
        }

        public PedidoBuilder itens(List<Item> itens) {
            this.itens = itens;
            return this;
        }

        public Pedido build() {
            return new Pedido(id, cliente, vendedor, loja, itens);
        }
    }
}
