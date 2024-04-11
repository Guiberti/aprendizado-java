package listasProfSandroResolucao.Lista05.test;

import listasProfSandroResolucao.Lista05.domain.Cliente;
import listasProfSandroResolucao.Lista05.domain.Loja;
import listasProfSandroResolucao.Lista05.domain.Vendedor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LojaTest {
    @Test
    public void testarConstrutor() {
        Loja loja = new Loja("Santa Lúcia", "Centro",
                "Av. O. L. Z.", "Vandir Rech", "Magazine Móveis",
                "17235604000110", null, null);
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
        Loja loja = new Loja("Salu", "Centro", "AVLZ", "Magazine ST", "Vandir", "17235604000110", new Vendedor[]{vendedor1, vendedor2}, new Cliente[]{});

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
        Loja loja = new Loja("Salu", "Centro", "AVLZ", "Magazine ST", "Vandir", "17235604000110", new Vendedor[]{}, new Cliente[]{cliente1, cliente2});

        int numeroClientesEsperado = 2;
        int numeroClientesAtual = loja.contarClientes();

        assertEquals(numeroClientesEsperado, numeroClientesAtual);
    }
}
