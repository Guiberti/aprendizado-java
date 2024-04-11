package listasProfSandroResolucao.Lista05.test;

import listasProfSandroResolucao.Lista05.domain.Vendedor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendedorTest {

    @Test
    public void testarApresentarse() {
        Vendedor vendedor = Vendedor.VendedorBuilder.builder()
                .NomePessoa("João")
                .Idade(30)
                .Loja(null)
                .Cidade("Sta Lucia")
                .Bairro("Centro")
                .Rua("Av OLZ")
                .SalarioBase(1800)
                .SalarioRecebido(new double[]{1500, 1800, 1900})
                .build();
        String resultadoEsperado = "Meu nome é: João, minha idade é: 30, minha loja é: null.";
        String resultadoAtual = vendedor.apresentarse();

        assertEquals(resultadoEsperado, resultadoAtual);
    }

    @Test
    public void testarSalarioBonus() {
        Vendedor vendedor = Vendedor.VendedorBuilder.builder()
                .NomePessoa("Joao")
                .Idade(30)
                .Loja(null)
                .Cidade("Sta Lucia")
                .Bairro("Centro")
                .Rua("Av OLZ")
                .SalarioBase(1800)
                .SalarioRecebido(new double[]{1500, 1800, 1900})
                .build();
        double resultadoEsperado = 360;
        double resultadoAtual = vendedor.calcularBonus();

        assertEquals(resultadoEsperado, resultadoAtual, 0.02);
    }

    @Test
    public void testarMediaSalarial() {
        Vendedor vendedor = Vendedor.VendedorBuilder.builder()
                .NomePessoa("Joao")
                .Idade(30)
                .Loja(null)
                .Cidade("Sta Lucia")
                .Bairro("Centro")
                .Rua("Av OLZ")
                .SalarioBase(1800)
                .SalarioRecebido(new double[]{1500, 1800, 1900})
                .build();

        double resultadoEsperado = 1733.33;
        double resultadoAtual = vendedor.calcularMedia();

        assertEquals(resultadoEsperado, resultadoAtual, 3);

    }

}
