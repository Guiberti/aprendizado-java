package listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain;

import java.time.LocalDate;

public class Ingresso {
    private Integer id;
    private Cliente cliente;
    private Evento evento;
    private String descricao;
    private Integer qtndDias;
    private LocalDate dataUtl;
    private Double valorTotal;

    public Ingresso(Integer id, Cliente cliente, Evento evento, String descricao, Integer qtndDias, LocalDate dataUtl,
                    Double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.evento = evento;
        this.descricao = descricao;
        this.qtndDias = qtndDias;
        this.dataUtl = dataUtl;
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Ingresso{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", evento=" + evento +
                ", descricao='" + descricao + '\'' +
                ", qtndDias=" + qtndDias +
                ", dataUtl=" + dataUtl +
                ", valorTotal=" + valorTotal +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQtndDias() {
        return qtndDias;
    }

    public void setQtndDias(Integer qtndDias) {
        this.qtndDias = qtndDias;
    }

    public LocalDate getDataUtl() {
        return dataUtl;
    }

    public void setDataUtl(LocalDate dataUtl) {
        this.dataUtl = dataUtl;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
