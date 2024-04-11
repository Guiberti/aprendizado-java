package listasProfSandroResolucao.Lista05.test;

import listasProfSandroResolucao.Lista05.domain.Cliente;
import listasProfSandroResolucao.Lista05.domain.Loja;
import listasProfSandroResolucao.Lista05.domain.Vendedor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LojaTest {
    @Test
    public void testarConstrutor() {
        Loja loja = Loja.LojaBuilder.builder()
                .Cidade("Santa Lúcia")
                .Bairro("Centro")
                .Rua("Av. O. L. Z.")
                .NomeFantasia("Vandir Rech")
                .RazaoSocial("Magazine Móveis")
                .Cnpj("17235604000110")
                .Vendedores(null)
                .Clientes(null)
                .build();
        // Asserções para verificar os atributos da loja
        assertEquals("Santa Lúcia", loja.getCidade());
        assertEquals("Centro", loja.getBairro());
        assertEquals("Av. O. L. Z.", loja.getRua());
        assertEquals("Vandir Rech", loja.getNomeFantasia());
        assertEquals("Magazine Móveis", loja.getRazaoSocial());
        assertEquals("17235604000110", loja.getCnpj());
    }

    @Test
    public void testarContarVendedores() {
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
        Loja loja = Loja.LojaBuilder.builder()
                .Cidade("Salu")
                .Bairro("Centro")
                .Rua("AVLZ")
                .NomeFantasia("Magazine ST")
                .RazaoSocial("Vandir")
                .Cnpj("17235604000110")
                .Vendedores(new Vendedor[]{vendedor1, vendedor2})
                .Clientes(new Cliente[]{})
                .build();


        int numeroVendedoresEsperado = 2;
        int numeroVendedoresAtual = loja.contarVendedores();

        assertEquals(numeroVendedoresEsperado, numeroVendedoresAtual);
    }

    @Test
    public void testarContarClientes() {
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
                .Cidade("Salu")
                .Bairro("Centro")
                .Rua("AVLZ")
                .NomeFantasia("Magazine ST")
                .RazaoSocial("Vandir")
                .Cnpj("17235604000110")
                .Vendedores(new Vendedor[]{})
                .Clientes(new Cliente[]{cliente1, cliente2})
                .build();
        int numeroClientesEsperado = 2;
        int numeroClientesAtual = loja.contarClientes();

        assertEquals(numeroClientesEsperado, numeroClientesAtual);
    }
}
