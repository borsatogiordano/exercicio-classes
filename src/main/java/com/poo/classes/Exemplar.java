package com.poo.classes;

public class Exemplar {
    int exemplarID;
    Livro livro;

    public int getExemplarID() {
        return exemplarID;
    }

    public Livro livro() {
        return livro;
    }

    public void setExemplarID(int exemplarID){
        this.exemplarID = exemplarID;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }
}
