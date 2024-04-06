package listasProfSandroResolucao.Lista05.test;

import listasProfSandroResolucao.Lista05.domain.Cliente;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClienteTest {

    @Test
    public void testarApresentarse(){
        Cliente cliente = new Cliente("Joao", "CLM", "centro", "dos geranios", 35);

        String resultadoEsperado = "Meu nome é: Joao, minha idade é: 35.";
        String resultadoAtual = cliente.apresentarse();

        assertEquals(resultadoEsperado, resultadoAtual);

    }
}
