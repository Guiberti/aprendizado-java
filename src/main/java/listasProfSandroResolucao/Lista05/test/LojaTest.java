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
        Vendedor vendedor1 = new Vendedor("Guilherme", 18, null, "Salu",
                "Centro", "AVLZ", 1802, new double[]{1502, 2500, 2600});
        Vendedor vendedor2 = new Vendedor("Talita", 23, null, "Salu",
                "Centro", "AVLZ", 1820, new double[]{2000, 1500, 1200});
        Loja loja = new Loja("Salu", "Centro", "AVLZ", "Magazine ST", "Vandir", "17235604000110", new Vendedor[]{vendedor1, vendedor2}, new Cliente[]{});

        int numeroVendedoresEsperado = 2;
        int numeroVendedoresAtual = loja.contarVendedores();

        assertEquals(numeroVendedoresEsperado, numeroVendedoresAtual);
    }

    @Test
    public void testarContarClientes() {
        Cliente cliente1 = new Cliente("Joao", "CLM", "centro", "dos geranios", 35);
        Cliente cliente2 = new Cliente("Maria", "Lindoeste", "centro", "da iguacu", 44);
        Loja loja = new Loja("Salu", "Centro", "AVLZ", "Magazine ST", "Vandir", "17235604000110", new Vendedor[]{}, new Cliente[]{cliente1, cliente2});

        int numeroClientesEsperado = 2;
        int numeroClientesAtual = loja.contarClientes();

        assertEquals(numeroClientesEsperado, numeroClientesAtual);
    }
}
