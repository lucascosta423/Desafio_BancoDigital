package org.example;

public interface Iconta {
    void sacar(double valor);

    void depositar(double valor);

    void tranferir(double valor, Iconta contaDestino);

    void imprimirExtrato();
}
