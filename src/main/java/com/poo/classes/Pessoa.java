package com.poo.classes;

public class Pessoa {
    private static int contadorPessoa = 0;
    private int pessoaID;
    private int rg;
    private String cpf;
    private String nome;
    private Endereco endereco;

    Pessoa(String nome, String cpf, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        contadorPessoa = pessoaID;
        contadorPessoa++;
    }

    public int getPessoaID() {
        return pessoaID;
    }

    public int getRg() {
        return rg;
    }

    public String getCpf() {
        return cpf.substring(0, 3) + "." +
                cpf.substring(3, 6) + "." +
                cpf.substring(6, 9) + "-" +
                cpf.substring(9, 11);
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setPessoaID(int pessoaID) {
        this.pessoaID = pessoaID;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public void setCpf(String cpf) {
        if (cpf != null && cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("Cpf deve conter 11 numeros");
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
