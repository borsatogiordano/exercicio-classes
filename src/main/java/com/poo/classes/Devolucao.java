package com.poo.classes;
import java.time.LocalDate;

public class Devolucao {
    int devolucaoID;
    LocalDate dataDevolucao;

    public int getDevolucaoID() {
        return devolucaoID;
    }

    public LocalDate getDataDevolucao(){
        return this.dataDevolucao;
    }

    public void setDevolucaoID(int devolucaoID) {
        this.devolucaoID = devolucaoID;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
}
