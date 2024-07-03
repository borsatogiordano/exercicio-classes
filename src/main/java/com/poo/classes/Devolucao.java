package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {
    private static int contadorDevolucao=0;
    private int devolucaoID;
    private LocalDate dataDevolucao;

    public Devolucao() {
        devolucaoID = contadorDevolucao;
        contadorDevolucao++;
    }

    public int getDevolucaoID() {
        return devolucaoID;
    }

    public LocalDate getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDevolucaoID(int devolucaoID) {
        this.devolucaoID = devolucaoID;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
