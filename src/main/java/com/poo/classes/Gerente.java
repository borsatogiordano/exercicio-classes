package com.poo.classes;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, String cpf, Endereco endereco, String login, String senha, double salario){
        super(nome, cpf, endereco, login, senha,salario);
    }

    @Override
    public double calcularBonificacao(){
        return getSalario() * 0.1;
    }
}