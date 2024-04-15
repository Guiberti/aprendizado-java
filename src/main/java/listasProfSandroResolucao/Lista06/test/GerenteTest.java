package listasProfSandroResolucao.Lista06.test;

import listasProfSandroResolucao.Lista06.domain.Gerente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GerenteTest {

    @Test
    void apresentarse() {
        Gerente gerente = Gerente.GerenteBuilder.builder()
                .nomePessoa("Vania")
                .idade(28)
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Avenida OLZ")
                .salarioBase(2200)
                .salarioRecebido(new double[]{2520, 1500, 3820})
                .loja(null)
                .build();

        String resultadoEsperado = "Meu nome é: Vania, minha idade é: 28, sou gerente da loja: null.";
        String resultadoAtual = gerente.apresentarse();
    }

    @Test
    void calcularBonus() {
        Gerente gerente = Gerente.GerenteBuilder.builder()
                .nomePessoa("Vania")
                .idade(28)
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Avenida OLZ")
                .salarioBase(2200)
                .salarioRecebido(new double[]{2520, 1500, 3820})
                .loja(null)
                .build();

        double resultadoEsperado = 770;
        double resultadoAtual = gerente.calcularBonus();

        assertEquals(resultadoEsperado, resultadoAtual, 0.35);
    }

    @Test
    void calcularMedia() {
        Gerente gerente = Gerente.GerenteBuilder.builder()
                .nomePessoa("Vania")
                .idade(28)
                .cidade("Santa Lúcia")
                .bairro("Centro")
                .rua("Avenida OLZ")
                .salarioBase(2200)
                .salarioRecebido(new double[]{2520, 1500, 3820})
                .loja(null)
                .build();

        double resultadoEsperado = 2613.33;
        double resultadoAtual = gerente.calcularMedia();

        assertEquals(resultadoEsperado, resultadoAtual, 3);
    }
}