package Trabalho;

public class ContaBancaria {
    String titular;
    double saldo;

    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saque inválido. Saldo insuficiente.");
        }
    }
    public void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
