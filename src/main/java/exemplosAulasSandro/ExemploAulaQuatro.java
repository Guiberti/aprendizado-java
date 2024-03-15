package exemplosAulasSandro;

public class ExemploAulaQuatro {
    public static void main(String[] args) {

        for (int i = 0; i < 8; i++) {
            if (i != 1 && i != 7) {
                continue;
            }
            System.out.println("Hoje é" + (i == 1 ? "Domingo" : "Sabado"));
        }

    }
}
