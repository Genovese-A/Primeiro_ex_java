package Trabalho;

public class Aluno {
    String nome;
    String matricula;
    double nota1, nota2, nota3;

    double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao() {
        if (calcularMedia() >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
