package com.poo.classes;

abstract class Funcionario extends Pessoa {

    private String login;
    private String senha;

    public Funcionario(String nome, String cpf, Endereco endereco, String login, String senha) {
        super(nome, cpf, endereco);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean autentica(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }
}
