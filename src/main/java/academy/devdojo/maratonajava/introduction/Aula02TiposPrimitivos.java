package academy.devdojo.maratonajava.introduction;

public class Aula02TiposPrimitivos {
    public static void main(String[] arg) {
        // int, double, float, char, byte, short, long, boolean
        int age = 1000000000; // se colocar mais um 0 vira long
        long numeroGrande = 1000000L; // num longo
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041'; // um caractere seja na tabela asc ou na outra

        // casting
        int idade = (int) 10000000000L;
        long testelong = (long) 253.12;

        // String
        String nome = "goku"; // aspas duplas, pode ter assento
        var nome2 = "vegeta";

        System.out.println("A idade é: " + age + "anos");
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println("char" + caractere);
        System.out.println(numeroGrande);
        // castings abaixo
        System.out.println(idade);
        System.out.println(testelong);
        System.out.println(nome);
        System.out.println(nome2);
    }
}
