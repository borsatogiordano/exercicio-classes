package com.poo.classes;

public class Cliente extends Pessoa {

    private static int contadorCliente = 0;
    private int clienteID;

    Cliente(String nome, String cpf, Endereco endereco) {
        super(nome,cpf,endereco);
        clienteID = contadorCliente;
        contadorCliente++;
    }

    public int getClienteID(){
        return this.clienteID;
    }
}
