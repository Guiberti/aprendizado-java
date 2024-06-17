package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(Carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(Carro.COMPRADOR);

    }
}

// PROX AULA: 79 - Orientação Objetos - Modificador final pt 03 - Classes e métodos
