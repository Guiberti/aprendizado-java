package academy.devdojo.maratonajava.javacore.Bintroductionmetodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;
    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        for(double salario: salarios){
            System.out.print(salario + "  ");
        }
        mediaSalarial();
    }

    public void mediaSalarial() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for(double salario: salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("\nMédia Salarial: " + media);
        }
    }

