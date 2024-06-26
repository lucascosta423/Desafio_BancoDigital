package org.example;

public class Conta implements Iconta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected Banco banco;
    protected Cliente cliente;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(Banco banco,Cliente cliente) {
        this.banco = banco;
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para saque de R$" + valor);
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }
    @Override
    public void tranferir(double valor, Iconta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    @Override
    public void imprimirExtrato() {

    }


    protected void imprimirInfosComuns() {
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: R$" + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia =" + agencia +
                ", numero =" + numero +
                ", saldo= R$" + saldo +
                ", cliente= " + cliente +
                '}';
    }
}
