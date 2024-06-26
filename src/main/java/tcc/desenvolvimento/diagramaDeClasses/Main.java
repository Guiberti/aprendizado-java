package tcc.desenvolvimento.diagramaDeClasses;

import java.util.Date;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Ingrediente ingrediente1 = new Ingrediente("Ingrediente 1", "KG", 10, 10.0);
    Ingrediente ingrediente2 = new Ingrediente("Ingrediente 2", "KG", 15, 15.0);
    List<Ingrediente> ingredientes = List.of(ingrediente1, ingrediente2);
    
    Passo passo1 = new Passo("Passo 1", "Executar alguma ação...", "10 minutos");
    Passo passo2 = new Passo("Passo 2", "Executar outra ação...", "10 minutos");
    List<Passo> passos = List.of(passo1, passo2);

    Receita receita = new Receita("Receita Teste", ingredientes, passos, "10 minutos");
    receita.calcularCusto();

    Producao producao = new Producao();
    producao.adicionarReceita(receita);
    producao.listarReceitas();
    producao.verificarEstoque(receita);

    System.out.println(""); // Pula linha

    Item item1 = new Item(1, "Item de teste 1", 1, 1, 10, new Date(), 10.0);
    Item item2 = new Item(2, "Item de teste 2", 1, 1, 10, new Date(), 10.0);
  
    Estoque estoque = new Estoque();
    estoque.adicionarItem(item1);
    estoque.adicionarItem(item2);

    Empresa empresa = new Empresa("Empresa Teste", "123456789", "Av. Brasil", estoque, producao);
    empresa.listarDados();
    empresa.exibirEstoque();
    empresa.exibirProducao();
  }
}