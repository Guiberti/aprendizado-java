package listasProfSandroResolucao.Lista06.test;

import listasProfSandroResolucao.Lista06.domain.Cliente;
import listasProfSandroResolucao.Lista06.domain.Gerente;
import listasProfSandroResolucao.Lista06.domain.Loja;
import listasProfSandroResolucao.Lista06.domain.Vendedor;

public class ListaSeisTest {
    public static void main(String[] args) {

        Gerente gerente = Gerente.GerenteBuilder.builder()
                .nomePessoa("Vânia")
                .idade(28)
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Avenida OLZ")
                .loja(null)
                .salarioBase(2200)
                .salarioRecebido(new double[]{5000, 3900, 8100})
                .build();

        Vendedor vendedor1 = Vendedor.VendedorBuilder.builder()
                .nomePessoa("Joao")
                .idade(30)
                .loja(null)
                .cidade("Sta Lucia")
                .bairro("Centro")
                .rua("Av OLZ")
                .salarioBase(1800)
                .salarioRecebido(new double[]{1500, 1800, 1900})
                .build();

        Vendedor vendedor2 = Vendedor.VendedorBuilder.builder()
                .nomePessoa("Maria")
                .idade(45)
                .loja(null)
                .cidade("Sta Lucia")
                .bairro("Centro")
                .rua("Rua B")
                .salarioBase(1900)
                .salarioRecebido(new double[]{1600, 1300, 1200})
                .build();

        Cliente cliente1 = Cliente.ClienteBuilder.builder()
                .nomePessoa("Jorge")
                .idade(45)
                .cidade("Sta Lucia")
                .bairro("Centro")
                .rua("Av OLZ")
                .build();
        Cliente cliente2 = Cliente.ClienteBuilder.builder()
                .nomePessoa("Mario")
                .idade(50)
                .cidade("Sta Lucia")
                .bairro("Centro")
                .rua("Av Brasil")
                .build();

        Loja loja = Loja.LojaBuilder.builder()
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Avenida OLZ")
                .nomeFantasia("Magazine Luiza")
                .razaoSocial("magalu")
                .cnpj(17235604000110L)
                .vendedores(new Vendedor[]{vendedor1, vendedor2})
                .clientes(new Cliente[]{cliente1, cliente2})
                .build();

        vendedor1.setLoja(loja);
        vendedor2.setLoja(loja);
        gerente.setLoja(loja);

        System.out.println("------");

        System.out.println("Gerente: ");
        System.out.println(gerente.apresentarse());
        System.out.println("Minha média salárial: " + gerente.calcularMedia());
        System.out.println("Meu bônus salarial: " + gerente.calcularBonus());

        System.out.println("------");

        System.out.println("Vendedor 1: ");
        System.out.println(vendedor1.apresentarse());
        System.out.println("Minha média salárial: " + vendedor1.calcularMedia());
        System.out.println("Meu bônus salarial: " + vendedor1.calcularBonus());

        System.out.println("------");

        System.out.println("Vendedor 2: ");
        System.out.println(vendedor2.apresentarse());
        System.out.println("Minha média salárial: " + vendedor2.calcularMedia());
        System.out.println("Meu bônus salarial: " + vendedor2.calcularBonus());

        System.out.println("------");

        System.out.println("Clientes : ");
        System.out.println(cliente1.apresentarse());
        System.out.println(cliente2.apresentarse());

        System.out.println("------");

        System.out.println("Loja: ");
        System.out.println(loja.apresentarse());
        System.out.println("Quantidade de clientes: " + loja.contarClientes());
        System.out.println("Quantidade de vendedores: " + loja.contarVendedores());
    }
}
