package listasProfSandroResolucao.Lista05.test;

import listasProfSandroResolucao.Lista05.domain.Cliente;
import listasProfSandroResolucao.Lista05.domain.Loja;
import listasProfSandroResolucao.Lista05.domain.Vendedor;

import java.util.List;

public class ListaCincoTest {
    public static void main(String[] args) {

        Vendedor vendedor1 = Vendedor.VendedorBuilder.builder()
                .NomePessoa("Joao")
                .Idade(30)
                .Loja(null)
                .Cidade("Sta Lucia")
                .Bairro("Centro")
                .Rua("Av OLZ")
                .SalarioBase(1800)
                .SalarioRecebido(new double[]{1500, 1800, 1900})
                .build();

        Vendedor vendedor2 = Vendedor.VendedorBuilder.builder()
                .NomePessoa("Maria")
                .Idade(45)
                .Loja(null)
                .Cidade("Sta Lucia")
                .Bairro("Centro")
                .Rua("Rua B")
                .SalarioBase(1900)
                .SalarioRecebido(new double[]{1600, 1300, 1200})
                .build();

        Cliente cliente1 = Cliente.ClienteBuilder.builder()
                .NomePessoa("Jorge")
                .Idade(45)
                .Cidade("Sta Lucia")
                .Bairro("Centro")
                .Rua("Av OLZ")
                .build();
        Cliente cliente2 = Cliente.ClienteBuilder.builder()
                .NomePessoa("Mario")
                .Idade(50)
                .Cidade("Sta Lucia")
                .Bairro("Centro")
                .Rua("Av Brasil")
                .build();

        Loja loja = Loja.LojaBuilder.builder()
                .Cidade("Santa Lúcia")
                .Bairro("Centro")
                .Rua("Avenida OLZ")
                .NomeFantasia("Loja's Guilherme")
                .RazaoSocial("Gdberti")
                .Cnpj("77.777.777/7777-77")
                .Vendedores(new Vendedor[] {vendedor1, vendedor2})
                .Clientes(new Cliente[]{cliente1, cliente2})
                .build();


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
