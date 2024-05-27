package listasProfSandroResolucao.segundob.Lista03;

import javax.swing.JOptionPane;

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
        // Atv1 - Crie um método em Java que exiba uma mensagem simples "Olá, Mundo!"
        // usando JOptionPane.
        JOptionPane.showMessageDialog(null, "Olá, Mundo!");
    }

    private static void atv2() {
        // Atv2 - Crie um método que solicite ao usuário seu nome e exiba uma mensagem
        // de boas-vindas.
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
    }

    private static void atv3() {
        // Atv3 - Crie um método que pergunte(showConfirmDialog) ao usuário se ele
        // deseja continuar e
        // exiba uma mensagem conforme a resposta.
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
        // Atv4 - Crie um método que apresente uma lista de opções ao usuário e exiba
        // uma mensagem segundo a
        // opção escolhida. Exemplos de lista("Opção 1", "Opção 2", "Opção 3").
        String[] opcoes = { "Opção 1", "Opção 2", "Opção 3" };
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
