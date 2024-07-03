package com.poo.classes;

import java.time.LocalDate;

public class Emprestimo {
    private static int contadorEmprestimo;
    private int emprestimoID;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevisaoDevolucao;
    private Pessoa pessoa;

    public Emprestimo() {
        emprestimoID = contadorEmprestimo;
        contadorEmprestimo++;
    }

    public int getEmprestimoID() {
        return emprestimoID;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataPrevisaoDevolucao() {
        return dataPrevisaoDevolucao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setEmprestimoID(int emprestimoID) {
        this.emprestimoID = emprestimoID;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public void setDataPrevisaoDevolucao(LocalDate dataPrevisaoDevolucao) {
        this.dataPrevisaoDevolucao = dataEmprestimo.plusDays(7);
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
