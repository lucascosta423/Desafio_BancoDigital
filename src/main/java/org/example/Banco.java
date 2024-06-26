package org.example;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contaList;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Conta> getContaList() {
        return contaList;
    }

    public void setContaList(List<Conta> contaList) {
        this.contaList = contaList;
    }

    public void adicionarConta(Conta conta) {
        contaList.add(conta);
    }

    public void listarContas() {
        System.out.println("Contas do Banco " + nome + ":");
        for (Conta conta : contaList) {
            System.out.println(conta);
        }
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", contaList=" + contaList +
                '}';
    }
}
