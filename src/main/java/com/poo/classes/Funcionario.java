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

    public void imprimeContraCheque() {
        System.out.println("==== Contra-cheque ====");
        System.out.println("Cargo: " + this.getClass().getSimpleName());
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Salario Base: R$ " + this.getSalario());
        System.out.println("INSS (10%): R$ " + this.calcularINSS());
        System.out.println("FGTS (8%^): R$ " + this.calcularFGTS());
        System.out.println("Bonificação: R$ " + this.calcularBonificacao());
        System.out.println("Salário Líquido R$ " + this.calcularSalarioLiquido());
    }
}
