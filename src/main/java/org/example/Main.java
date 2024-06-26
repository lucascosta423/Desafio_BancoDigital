package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Banco banco = new Banco("Itau");
        Cliente cliente1 = new Cliente("Lucas Santos", "123456789");
        Cliente cliente2 = new Cliente("Lucas Santos", "123456789");

        Conta cc = new ContaCorrente(banco,cliente1);
        Conta cp = new ContaPoupanca(banco,cliente2);

        List<Conta> contas = new ArrayList<Conta>();
        contas.add(cc);
        contas.add(cp);

        banco.setContaList(contas);

        banco.listarContas();

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        cc.depositar(100);

        cc.tranferir(50,cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();

        banco.listarContas();

    }
}