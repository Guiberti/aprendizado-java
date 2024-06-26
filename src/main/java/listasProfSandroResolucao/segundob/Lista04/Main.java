package listasProfSandroResolucao.segundob.Lista04;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String[] opcoes = {"Consultar Convênio", "Consultar Boleto"};
        String selecionar = (String) JOptionPane.showInputDialog(null, "Selecione a opção desejada: ",
                "Menu", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (selecionar) {
            case "Consultar Convênio" -> System.out.println(ConsultarConvenio.getJsonData());
            case "Consultar Boleto" -> consultarBoleto();
            default -> JOptionPane.showMessageDialog(null, "Nenhuma Opção selecionada", "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void consultarBoleto() throws IOException, InterruptedException {
        String linhaDigitavel = (String) JOptionPane.showInputDialog(
                null,
                "Informe a Linha Digitavel",
                "Inserir",
                JOptionPane.QUESTION_MESSAGE,
                null,
                null,
                null);
        ConsultarBoleto.getJsonData(linhaDigitavel);

    }
}
