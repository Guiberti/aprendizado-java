package listasProfSandroResolucao.segundob.Lista04;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest {
    ConsultarBoleto consultarBoleto = new ConsultarBoleto();
    ConsultarConvenio consultarConvenio = new ConsultarConvenio();

    public static void main(String[] args) {

        String[] opcoes = {"Consultar Convênio", "Consultar Boleto"};
        int selecionar = JOptionPane.showOptionDialog(null, "Selecione a opção  desejada",
                "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);

        switch (selecionar) {
            case 0 -> consultarConvenio();
            case 1 -> consultarBoleto();
            default -> JOptionPane.showMessageDialog(null, "Nenhuma Opção selecionada", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

    private static void consultarBoleto() {
    }

    private static void consultarConvenio() {
    }
}
