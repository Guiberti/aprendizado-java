package listasProfSandroResolucao.segundob.Aulas.Aula05;

public class Galinha extends Ave {

    @Override
    public void voar() {
        throw new RuntimeException("Não sei voar!");
    }

}
