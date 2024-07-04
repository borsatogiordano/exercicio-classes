package com.poo.classes;

public class Gerente extends Funcionario {
    
    public Gerente(String nome, String cpf, Endereco endereco, String login, String senha, double salario){
        super(nome, cpf, endereco, login, senha,salario);
    }
}