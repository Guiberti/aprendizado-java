package tcc.desenvolvimento.diagramaDeClasses;

public class Empresa {
  private String nome;
  private String cnpj;
  private String endereco;
  private Estoque estoque;
  private Producao producao;

  public Empresa(String nome, String cnpj, String endereco, Estoque estoque, Producao producao) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.endereco = endereco;
    this.estoque = estoque;
    this.producao = producao;
  }

  public void listarDados() {
    System.out.println("Nome: " + this.nome);
    System.out.println("CNPJ: " + this.cnpj);
    System.out.println("Endereço: " + this.endereco);
  }

  public void exibirEstoque() {
    System.out.println("\nEstoque:");
    for (Item item : this.estoque.getItens()) {
      System.out.println("ID: " + item.getId());
      System.out.println("Nome: " + item.getNome());
      System.out.println("Quantidade: " + item.getQuantidade());
      System.out.println("Quantidade Mínima: " + item.getQuantidadeMinima());
      System.out.println("Quantidade Máxima: " + item.getQuantidadeMaxima());
      System.out.println("Data de Validade: " + item.getDataValidade());
      System.out.println("Valor Unitário: " + item.getValorUnitario());
      System.out.println("");
    }
  }

  public void exibirProducao() {
    System.out.println("Produção:");
    for (Receita receita : this.producao.getReceitas()) {
      System.out.println("Nome: " + receita.getNome());
      System.out.println("Tempo de Preparo: " + receita.getTempoDePreparo());
      System.out.println("Custo: " + receita.getCusto());
      System.out.println("");
    }
  }

  public String getNome() {
    return this.nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return this.cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getEndereco() {
    return this.endereco;
  }
  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public Estoque getEstoque() {
    return this.estoque;
  }

  public void setEstoque(Estoque estoque) {
    this.estoque = estoque;
  }
}