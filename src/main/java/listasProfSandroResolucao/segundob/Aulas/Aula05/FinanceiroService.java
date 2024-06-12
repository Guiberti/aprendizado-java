package listasProfSandroResolucao.segundob.Aulas.Aula05;

public class FinanceiroService implements IGerarRelatorioExcel, IGerarRelatorioPDF {

    @Override
    public void gerarPdf() {
        System.out.println("Gerando PDF no financeiro!");
    }

    @Override
    public void gerarExcel() {
        System.out.println("Gerando Excel no financeiro!");
    }

}
