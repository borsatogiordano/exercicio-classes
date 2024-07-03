package com.poo.classes;

public class Endereco {
    private static int contadorEndereco = 0;
    private Pessoa pessoa;
    private int enderecoID;
    private String uf;
    private String cidade;
    private String tipo;
    private int numeroResidencia;
    private String complemento;
    private int cep;

    public Endereco(int cep) {
        this.cep = cep;
        enderecoID = contadorEndereco;
        contadorEndereco++;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public int getEnderecoID() {
        return enderecoID;
    }

    public String getUf() {
        return uf;
    }

    public String getCidade() {
        return cidade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroResidencia() {
        return numeroResidencia;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getCep() {
        return cep;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setEnderecoID(int enderecoID) {
        this.enderecoID = enderecoID;
    }

    public void setUf(String uf) {
        if (uf != null && uf.length() == 2) {
            this.uf = uf.toUpperCase();
        } else {
            throw new IllegalArgumentException("UF deve ter exatamente 2 caraceteres.");
        }
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroResidencia(int numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
