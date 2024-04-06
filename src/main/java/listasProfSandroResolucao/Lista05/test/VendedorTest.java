package listasProfSandroResolucao.Lista05.test;

import listasProfSandroResolucao.Lista05.domain.Vendedor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendedorTest {

    @Test
    public void testarApresentarse() {
        Vendedor vendedor = new Vendedor("João", 30, null, "Santa Lúcia", "Centro", "Rua A", 1800, new double[]{1500,1800,1900});

        String resultadoEsperado = "Meu nome é: João, minha idade é: 30, minha loja é: null.";
        String resultadoAtual = vendedor.apresentarse();

        assertEquals(resultadoEsperado, resultadoAtual);
    }

}
