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

    @Test
    public void testarSalarioBonus() {
        Vendedor vendedor = new Vendedor("João", 30, null, "Santa Lúcia", "Centro", "Rua A", 1800, new double[]{1500,1800,1900});

        double resultadoEsperado = 360;
        double resultadoAtual = vendedor.calcularBonus();

        assertEquals(resultadoEsperado, resultadoAtual, 0.02);
    }

    @Test
    public void testarMediaSalarial() {
        Vendedor vendedor = new Vendedor("João", 30, null, "Santa Lúcia", "Centro", "Rua A", 1800, new double[]{1500,1800,1900});

        double resultadoEsperado = 1733.33;
        double resultadoAtual = vendedor.calcularMedia();

        assertEquals(resultadoEsperado, resultadoAtual, 3);

    }

}
