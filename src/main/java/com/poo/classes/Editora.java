package com.poo.classes;

public class Editora {
    private static int contadorEditora = 0;
    private int editoraID;
    private String nome;

    public Editora(String nome){
        this.nome = nome;
        contadorEditora = editoraID;
        contadorEditora++;
    }

    public int getEditoraID() {
        return editoraID;
    }

    public String getNome(String nome) {
        return this.nome;
    }

    public void setEditoraID(int editoraID) {
        this.editoraID = editoraID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
