package com.poo.classes;

abstract class Funcionario extends Pessoa {

    private String login;
    private String senha;
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, String login, String senha, double salario) {
        super(nome, cpf, endereco);
        this.salario = salario;
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

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean autentica(String login, String senha) {
        return this.login.equals(login) && this.senha.equals(senha);
    }

    private double calcularINSS() {
        return salario * 0.1;
    }

    private double calcularFGTS() {
        return salario * 0.08;
    }

    private double calcularSalarioLiquido() {
        return salario - calcularINSS() - calcularFGTS() + calcularBonificacao();
    }

    public abstract double calcularBonificacao();
}
