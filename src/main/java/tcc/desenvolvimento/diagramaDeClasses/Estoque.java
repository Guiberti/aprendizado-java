package tcc.desenvolvimento.diagramaDeClasses;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
  private List<Item> itens = new ArrayList<>();

  public void adicionarItem(Item item) {
    this.itens.add(item);
  }

  public void removerItem(Item item) {
    this.itens.remove(item);
  }

  public List<Item> getItens() {
    return this.itens;
  }
}
