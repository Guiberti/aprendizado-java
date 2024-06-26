package tcc.desenvolvimento.diagramaDeClasses;

import java.util.ArrayList;
import java.util.List;

public class Producao {
  private List<Receita> receitas = new ArrayList<>();

  public void adicionarReceita(Receita receita) {
    receitas.add(receita);
  }

  public void listarReceitas() {
    for (Receita receita : this.receitas) {
      System.out.println(receita.getNome());
    }
  }

  public void verificarEstoque(Receita receita) {
    for (Ingrediente ingrediente : receita.getIngredientes()) {
      System.out.println("Verificando estoque do ingrediente " + ingrediente.getNome());
    }
  }

  public List<Receita> getReceitas() {
    return this.receitas;
  }
}
