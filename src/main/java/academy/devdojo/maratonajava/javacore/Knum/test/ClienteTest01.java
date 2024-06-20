package academy.devdojo.maratonajava.javacore.Knum.test;

import academy.devdojo.maratonajava.javacore.Knum.domain.Cliente;
import academy.devdojo.maratonajava.javacore.Knum.domain.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Oliveer", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Rivau", TipoCliente.PESSOA_FISICA);
        Cliente cliente4 = new Cliente("Arteta", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);

    }
}

//81 - Orientação Objetos - Enumeração pt 02 - Construtores e atributos

