package listasProfSandroResolucao.segundob.Aulas.Aula05;

public class Pj implements IProcessaFolha {

    private Double salario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public void processar() {
        Double salario = getSalario();

        System.out.println("Meu salário de pj: " + salario);
    }

}
