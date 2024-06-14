package listasProfSandroResolucao.primeirob.Avaliacoes.Prova02.domain;

import java.time.LocalDate;

public class Evento {
    private Integer id;
    private String descricao;
    private Integer numMaxCliente;
    private Double valorDiario;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    public Evento(Integer id, String descricao, Integer numMaxCliente, Double valorDiario, LocalDate dataInicio,
                  LocalDate dataFim) {
        this.id = id;
        this.descricao = descricao;
        this.numMaxCliente = numMaxCliente;
        this.valorDiario = valorDiario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", numMaxCliente=" + numMaxCliente +
                ", valorDiario=" + valorDiario +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getNumMaxCliente() {
        return numMaxCliente;
    }

    public void setNumMaxCliente(Integer numMaxCliente) {
        this.numMaxCliente = numMaxCliente;
    }

    public Double getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(Double valorDiario) {
        this.valorDiario = valorDiario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

}
