package com.poo.classes;

public class Autor {
    private static int contador = 0;
    private int autorID;
    private String nome;

    public Autor(String nome, int autorID) {
        this.nome = nome;
        contador = autorID;
        contador++;
    }

    public int getAutorID() {
        return autorID;
    }

    public String getNome() {
        return nome;
    }

    public void setAutorID(int autorID) {
        this.autorID = autorID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
