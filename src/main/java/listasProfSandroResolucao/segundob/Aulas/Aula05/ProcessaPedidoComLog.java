package listasProfSandroResolucao.segundob.Aulas.Aula05;

public class ProcessaPedidoComLog extends ProcessaPedido {

    public void processaComLog(Pedido pedido) {
        super.processa(pedido);

        System.out.println("Log: Pedido criado" + pedido.getId());
    }

}
