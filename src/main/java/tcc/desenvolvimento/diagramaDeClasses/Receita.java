package tcc.desenvolvimento.diagramaDeClasses;

import java.util.List;

public class Receita {
  private String nome;
  private List<Ingrediente> ingredientes;
  private List<Passo> passos;
  private String tempoDePreparo;
  private double custo = 0;

  public Receita(String nome, List<Ingrediente> ingredientes, List<Passo> passos, String tempoDePreparo) {
    this.nome = nome;
    this.ingredientes = ingredientes;
    this.passos = passos;
    this.tempoDePreparo = tempoDePreparo;
  }

  public void calcularCusto() {
    double custo = 0;
    for (Ingrediente ingrediente : this.ingredientes) {
      custo += ingrediente.getQuantidade() * ingrediente.getValorUnitario();
    }
    this.custo = custo;
  }

  public double getCusto() {
    return this.custo;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Ingrediente> getIngredientes() {
    return this.ingredientes;
  }

  public void setIngredientes(List<Ingrediente> ingredientes) {
    this.ingredientes = ingredientes;
  }

  public List<Passo> getPassos() {
    return this.passos;
  }

  public void setPassos(List<Passo> passos) {
    this.passos = passos;
  }

  public String getTempoDePreparo() {
    return this.tempoDePreparo;
  }

  public void setTempoDePreparo(String tempoDePreparo) {
    this.tempoDePreparo = tempoDePreparo;
  }

  public void adicionarIngrediente(Ingrediente ingrediente) {
    this.ingredientes.add(ingrediente);
  }

  public void removerIngrediente(Ingrediente ingrediente) {
    this.ingredientes.remove(ingrediente);
  }

  public void adicionarPasso(Passo passo) {
    this.passos.add(passo);
  }

  public void removerPasso(Passo passo) {
    this.passos.remove(passo);
  }
}