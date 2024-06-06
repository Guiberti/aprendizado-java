package listasProfSandroResolucao.segundob.Lista03;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Atividade 01: ");
        atv1();
        System.out.println("Atividade 02: ");
        atv2();
        System.out.println("Atividade 03: ");
        atv3();
        System.out.println("Atividade 04: ");
        atv4();
        System.out.println("Atividade 05: ");
        atv5();
        System.out.println("Atividade 06: ");
        atv6();
    }

    private static void atv1() {
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    private static void atv2() {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
    }

    private static void atv3() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        switch (resposta) {
            case JOptionPane.YES_OPTION:
                JOptionPane.showMessageDialog(null, "Continuando...");
                break;
            case JOptionPane.NO_OPTION:
                JOptionPane.showMessageDialog(null, "Parando...");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Cancelando...");
                break;
        }
    }

    private static void atv4() {
        JFrame frame = new JFrame("Escolha uma Opção!");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(0);

        String[] opcoes = { "Opção 1", "Opção 2", "Opção 3" };
        JComboBox<String> comboBox = new JComboBox<>(opcoes);
        JButton btn = new JButton("Escolher");
        JLabel messageLabel = new JLabel("");

        btn.addActionListener(e -> {
            String escolha = (String) comboBox.getSelectedItem();
            switch (escolha) {
                case "Opção 1":
                    messageLabel.setText("Escolhida opção 1.");
                    break;
                case "Opção 2":
                    messageLabel.setText("Escolhida opção 2.");
                    break;
                case "Opção 3":
                    messageLabel.setText("Escolhida opção 3.");
                    break;
                case null:
                    break;
                default:
                    messageLabel.setText("Opção Inválida.");
                    break;
            }
        });
        frame.setLayout(new FlowLayout());
        frame.add(comboBox);
        frame.add(btn);
        frame.add(messageLabel);
        frame.setVisible(true);
    }

    private static void atv5() {
        // Atv5 - Crie uma exceção personalizada que apresente um dialog(ERROR_MESSAGE)
        // com a mensagem do erro que ocorreu.

    }

    private static void atv6() {
        // Atv6 - Crie uma calculadora utilizando JOptionPane, apresente as quatro
        // opções matemáticas ao
        // usuário, após selecionada a opção e avançar, requisite os dois números para
        // realizar o cálculo,
        // apresente o resultado em um dialog(INFORMATION_MESSAGE) e em caso de erro
        // lance sua exceção
        // personalizada da atividade 5.
    }

}
