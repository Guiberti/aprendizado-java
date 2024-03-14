package academy.devdojo.maratonajava.introduction;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        // byte, shor, int, long, float e double o valor é 0
        // char '\u0000' ''
        // boolean false
        // String null

        String[] names = new String[4];
        names[0] = "Goku";
        names[1] = "Vegetta";
        names[2] = "Luffy";
        names[3] = "Naruto";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // quando voce faz isso abaixo, ele apaga os arquivos e limpa os espaços, pois
        // vovce aderiu outro
        names = new String[5];
        // a impressao vai dar null
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

    }
}
