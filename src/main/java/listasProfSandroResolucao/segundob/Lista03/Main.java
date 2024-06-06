package listasProfSandroResolucao.segundob.Lista03;

import javax.swing.*;
import java.util.List;

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
        List<String> opcoes = List.of("Opcão 1", "Opcão 2", "Opcão 3");

        String opcao = (String) JOptionPane.showInputDialog(frame,
                "Qual opção deseja selecionar? ",
                "Sua opção",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes.toArray(),
                opcoes.toArray()[0]);

        JOptionPane.showMessageDialog(frame, "A opção selecionada é: " + opcao);
    }

    private static void atv5() {
        try {
            throw new CustomException("ERRO!");
        } catch (CustomException ignored) {
        }
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
