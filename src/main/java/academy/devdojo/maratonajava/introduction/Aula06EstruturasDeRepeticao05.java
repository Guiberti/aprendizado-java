package academy.devdojo.maratonajava.introduction;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
        double valorParcela = valorTotal / parcela;
        //Se eu não colocar o if abaixo, o sistema vai imprimir infinitos numeros, assim ele fixa até 1000
        if (valorParcela < 1000) {
            continue;
        }
        System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}