package listasProfSandroResolucao.segundob.Aulas.Aula04;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JPanelSample {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Tela Bala");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(0);

        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);

        JLabel label = new JLabel("Clique no Botão!");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        JButton btn = new JButton("Clique Aqui!");

        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Fui clicado!!!");
            }

        });

        frame.add(panel);
        frame.add(label);
        frame.add(btn);
        frame.setVisible(true);

    }
}
