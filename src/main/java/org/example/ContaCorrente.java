package org.example;

public class ContaCorrente extends Conta{

    public ContaCorrente(Banco banco, Cliente cliente) {
        super(banco, cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("-------------------------------");
        System.out.println("        CONTA CORRENTE         ");
        System.out.println("-------------------------------");
        super.imprimirInfosComuns();

    }
}
