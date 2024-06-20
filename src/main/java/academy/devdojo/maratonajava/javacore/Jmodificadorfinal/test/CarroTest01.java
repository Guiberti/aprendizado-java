package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(Carro.COMPRADOR);
        Carro.COMPRADOR.setNome("Kuririn");
        System.out.println(Carro.COMPRADOR);
        System.out.println("-----------");
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Mustang");
        ferrari.imprime();

    }
}

// PROX AULA: 79 - Orientação Objetos - Modificador final pt 03 - Classes e métodos
