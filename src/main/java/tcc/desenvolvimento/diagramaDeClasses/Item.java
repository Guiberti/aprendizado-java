package tcc.desenvolvimento.diagramaDeClasses;

import java.util.Date;

public class Item {
  private Integer id;
  private String nome;
  private Integer quantidade;
  private Integer quantidadeMinima;
  private Integer quantidadeMaxima;
  private Date dataValidade;
  private double valorUnitario;

  public Item(Integer id, String nome, Integer quantidade, Integer quantidadeMinima, Integer quantidadeMaxima, Date dataValidade, double valorUnitario) {
    this.id = id;
    this.nome = nome;
    this.quantidade = quantidade;
    this.quantidadeMinima = quantidadeMinima;
    this.quantidadeMaxima = quantidadeMaxima;
    this.dataValidade = dataValidade;
    this.valorUnitario = valorUnitario;
  }

  public Integer getId() {
    return this.id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getQuantidade() {
    return this.quantidade;
  }
  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Integer getQuantidadeMinima() {
    return this.quantidadeMinima;
  }
  public void setQuantidadeMinima(Integer quantidadeMinima) {
    this.quantidadeMinima = quantidadeMinima;
  }

  public Integer getQuantidadeMaxima() {
    return this.quantidadeMaxima;
  }
  public void setQuantidadeMaxima(Integer quantidadeMaxima) {
    this.quantidadeMaxima = quantidadeMaxima;
  }

  public Date getDataValidade() {
    return this.dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  public double getValorUnitario() {
    return this.valorUnitario;
  }
  public void setValorUnitario(double valorUnitario) {
    this.valorUnitario = valorUnitario;
  }
}
