package listasProfSandroResolucao.Lista05.test;
import org.junit.Test;
import listasProfSandroResolucao.Lista05.domain.Vendedor;

public class TestListaCinco {
    @Test
    public void testarApresentarse() {
        Vendedor vendedor = new Vendedor("Guilherme", 18, "", "Santa Lúcia", "Centro", "Avenida Orlando Z P");

        //String resultadoEsperado = "Meu nome é: Guilherme, minha idade é: 18, minha loja é: null.";
        String resultadoAtual = vendedor.apresentarse();

    }


}
