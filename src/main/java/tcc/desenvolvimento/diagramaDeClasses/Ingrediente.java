package tcc.desenvolvimento.diagramaDeClasses;

public class Ingrediente {
  private String nome;
  private String unidadeDeMedida;
  private Integer quantidade;
  private double valorUnitario;

  public Ingrediente(String nome, String unidadeDeMedida, Integer quantidade, double valorUnitario) {
    this.nome = nome;
    this.unidadeDeMedida = unidadeDeMedida;
    this.quantidade = quantidade;
    this.valorUnitario = valorUnitario;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getUnidadeDeMedida() {
    return this.unidadeDeMedida;
  }

  public void setUnidadeDeMedida(String unidadeDeMedida) {
    this.unidadeDeMedida = unidadeDeMedida;
  }

  public Integer getQuantidade() {
    return this.quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public double getValorUnitario() {
    return this.valorUnitario;
  }

  public void setValorUnitario(double valorUnitario) {
    this.valorUnitario = valorUnitario;
  }
}
