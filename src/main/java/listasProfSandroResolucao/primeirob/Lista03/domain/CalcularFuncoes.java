package listasProfSandroResolucao.primeirob.Lista03.domain;

public class CalcularFuncoes {
    public static double calcularPrecoTotal(int quantidade, double preco) {
        double total;
        if (quantidade > 10) {
            total = (quantidade * preco) * 0.95;
        } else {
            total = quantidade * preco;
        }
        SalvarFuncoes.salvar(total);
        return total;

    }

    public static double calcularTroco(double recebido, double total) {
        return recebido - total;
    }
}
