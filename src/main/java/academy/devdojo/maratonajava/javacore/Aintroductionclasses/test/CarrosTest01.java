package academy.devdojo.maratonajava.javacore.Aintroductionclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroductionclasses.domain.Carros;

public class CarrosTest01 {
    public static void main(String[] args) {
        Carros carros1 = new Carros();
        Carros carros2 = new Carros();

        carros1.nome = "Fiat";
        carros1.modelo = "Uno";
        carros1.ano = 1986;

        carros2.nome = "Volks";
        carros2.modelo = "Jetta";
        carros2.ano = 2018;

        carros1 = carros2;

        //Como fazer que o carros1 seja igual ao carros2?
        //Simplesmente fazendo carros1 = carros2;
        //Assim que perdido uma memória de referência, para sempre perdida, voce nunca mais encontra.
        //Só se tiver uma terceira váriavel salvando a primeira que virou secunda.

        System.out.println("Nome: " + carros1.nome + ", modelo: " + carros1.modelo + ", ano: " + carros1.ano);

        System.out.println("\n--------------------------\n");

        System.out.println("Nome: " + carros2.nome + ", modelo: " + carros2.modelo + ", ano: " + carros2.ano);

    }
}
