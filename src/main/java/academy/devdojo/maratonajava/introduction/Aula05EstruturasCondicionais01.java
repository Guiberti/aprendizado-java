package academy.devdojo.maratonajava.introduction;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida == false) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Não autorizado com else!");
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado sem else!");
        }

        System.out.println("Fora do if");
    }
}
