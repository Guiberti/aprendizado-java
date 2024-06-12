package listasProfSandroResolucao.segundob.Aulas.Aula05;

public class ProcessaPedido {

    public void processa(Pedido pedido) {

        EnviaEmailConfirmacao emailConfirmacao = new EnviaEmailConfirmacao();
        PgRepository pgRepository = new PgRepository();

        boolean isSalvoDB = pgRepository.salvar(pedido);

        if (pedido.isValido() && isSalvoDB) {
            emailConfirmacao.enviarEmailConfirmacao(pedido);
        }

    }

}
