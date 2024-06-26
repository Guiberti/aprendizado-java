package tcc.desenvolvimento.diagramaDeClasses;

public class Passo {
  private String titulo;
  private String descricao;
  private String duracao;

  public Passo(String titulo, String descricao, String duracao) {
    this.titulo = titulo;
    this.descricao = descricao;
    this.duracao = duracao;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getDuracao() {
    return this.duracao;
  }

  public void setDuracao(String duracao) {
    this.duracao = duracao;
  }
}
