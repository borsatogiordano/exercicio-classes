package com.poo.classes;

public class Autor {
    private static int contadorAutor = 0;
    private int autorID;
    private String nome;

    public Autor(String nome, int autorID) {
        this.nome = nome;
        autorID = contadorAutor;
        contadorAutor++;
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
