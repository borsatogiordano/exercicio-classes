package com.poo.classes;

public class Exemplar {
    private static int contadorExemplar=0;
    private int exemplarID;
    private Livro livro;

    public Exemplar() {
        exemplarID = contadorExemplar;
        contadorExemplar++;
    }

    public int getExemplarID() {
        return exemplarID;
    }

    public Livro livro() {
        return livro;
    }

    public void setExemplarID(int exemplarID) {
        this.exemplarID = exemplarID;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
}
