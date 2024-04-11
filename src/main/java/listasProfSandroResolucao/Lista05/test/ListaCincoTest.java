package listasProfSandroResolucao.Lista05.test;

import listasProfSandroResolucao.Lista05.domain.Cliente;
import listasProfSandroResolucao.Lista05.domain.Loja;
import listasProfSandroResolucao.Lista05.domain.Vendedor;

import java.util.List;

public class ListaCincoTest {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor("João", 30, null, "Santa Lúcia", "Centro", "Rua A", 1800, new double[]{1500,1800,1900});
        Vendedor vendedor2 = new Vendedor("Maria", 45, null, "Santa Lúcia", "Centro", "Rua B", 1900, new double[]{1600,1300,1200});

        Cliente cliente1 = new Cliente("Joao", "CLM", "centro", "dos geranios", 35);
        Cliente cliente2 = new Cliente("Jorge", "CLM", "casinhas", "manjerituba", 75);


        Loja loja = new Loja("Santa Lúcia", "Centro", "Aveniada OLZ",
                "Loja's Guilherme", "Gdberti", "77.777.777/7777-77", new Vendedor[]{vendedor1, vendedor2}, new Cliente[]{cliente1, cliente2});

        vendedor1.setLoja(loja);
        vendedor2.setLoja(loja);

        System.out.println(vendedor1.apresentarse());
        System.out.println(vendedor1.calcularMedia());
        System.out.println(vendedor1.calcularBonus());

        System.out.println("------");

        System.out.println(vendedor2.apresentarse());
        System.out.println(vendedor2.calcularMedia());
        System.out.println(vendedor2.calcularBonus());

        System.out.println("------");

        System.out.println(cliente1.apresentarse());
        System.out.println(cliente2.apresentarse());

        System.out.println("------");

        System.out.println(loja.contarClientes());
        System.out.println(loja.contarVendedores());

    }
}
