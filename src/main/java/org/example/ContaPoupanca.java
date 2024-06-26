package org.example;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-------------------------------");
        System.out.println("        CONTA POUPANÇA         ");
        System.out.println("-------------------------------");
        super.imprimirInfosComuns();
    }
}
