package Trabalho;

import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {
       
        try (Scanner scanner = new Scanner(System.in)) {
            // Carro
            Carro carro = new Carro();
            System.out.println("Informe a marca do carro:");
            carro.marca = scanner.nextLine();
            System.out.println("Informe o modelo do carro:");
            carro.modelo = scanner.nextLine();
            System.out.println("Informe o ano do carro:");
            carro.ano = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha
            carro.exibirInformacoes();
            
            // ContaBancaria
            ContaBancaria conta = new ContaBancaria();
            System.out.println("Informe o titular da conta:");
            conta.titular = scanner.nextLine();
            System.out.println("Informe o saldo inicial:");
            conta.saldo = scanner.nextDouble();
            System.out.println("Informe o valor para depósito:");
            conta.depositar(scanner.nextDouble());
            System.out.println("Informe o valor para saque:");
            conta.sacar(scanner.nextDouble());
            conta.exibirSaldo();
            
            // Produto
            Produto produto = new Produto();
            scanner.nextLine(); // Consumir quebra de linha
            System.out.println("Informe o nome do produto:");
            produto.nome = scanner.nextLine();
            System.out.println("Informe o preço do produto:");
            produto.preco = scanner.nextDouble();
            System.out.println("Informe a quantidade em estoque:");
            produto.quantidadeEmEstoque = scanner.nextInt();
            System.out.println("Informe a quantidade para vender:");
            produto.vender(scanner.nextInt());
            System.out.println("Informe a quantidade para reabastecer:");
            produto.reabastecer(scanner.nextInt());
            produto.exibirDetalhes();
            
            // Aluno
            Aluno aluno = new Aluno();
            scanner.nextLine(); // Consumir quebra de linha
            System.out.println("Informe o nome do aluno:");
            aluno.nome = scanner.nextLine();
            System.out.println("Informe a materia:");
            aluno.matricula = scanner.nextLine();
            System.out.println("Informe a primeira nota:");
            aluno.nota1 = scanner.nextDouble();
            System.out.println("Informe a segunda nota:");
            aluno.nota2 = scanner.nextDouble();
            System.out.println("Informe a terceira nota:");
            aluno.nota3 = scanner.nextDouble();
            
            System.out.println("Média: " + aluno.calcularMedia());
            aluno.verificarAprovacao();
        }
    }
}