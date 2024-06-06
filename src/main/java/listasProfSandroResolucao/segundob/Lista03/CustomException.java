package listasProfSandroResolucao.segundob.Lista03;

import javax.swing.JOptionPane;

public class CustomException extends Exception {

    public CustomException(String errorMsg) {
        JOptionPane.showMessageDialog(null,
                errorMsg,
                "ERRO!",
                JOptionPane.ERROR_MESSAGE);
    }
}
