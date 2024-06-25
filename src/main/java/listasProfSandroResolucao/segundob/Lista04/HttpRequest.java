package listasProfSandroResolucao.segundob.Lista04;

import javax.swing.*;

public class HttpRequest {
    public static void main(String[] args) {
        ConsultarBoleto consultarBoleto = new ConsultarBoleto();
        ConsultarConvenio consultarConvenio = new ConsultarConvenio();

        String[] opcoes = {"Consultar Convênio", "Consultar Boleto"};
        int selecionar = JOptionPane.showOptionDialog(null, "Selecione a opção  desejada",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (selecionar) {
            case 0 -> System.out.println(ConsultarConvenio.getJsonData());
            case 1 -> consultarBoleto();
            default -> JOptionPane.showMessageDialog(null, "Nenhuma Opção selecionada", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void consultarBoleto() {
    }


}
