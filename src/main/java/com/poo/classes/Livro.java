package com.poo.classes;

public class Livro {
    private static int contadorLivro = 0;
    private int livroID;
    private String edicao;
    private String titulo;
    private int ano;
    private Editora editora;
    private Autor autor;

    Livro(String edicao, String titulo, int ano, Editora editora, Autor autor) {
        contadorLivro = livroID;
        contadorLivro++;
        this.edicao = edicao;
        this.titulo = titulo;
        this.ano = ano;
        this.editora = editora;
        this.autor = autor;
    }

    public int getLivroID() {
        return livroID;
    }

    public String getEdicao() {
        return edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public Editora getEditora() {
        return editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setLivroID(int livroID) {
        this.livroID = livroID;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
