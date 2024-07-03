package com.poo.classes;

public class ExemplarEmprestimo {
        private static int contadorExemplarEmprestimo = 0;
        private int exemplarEmprestimoID;
        private Exemplar exemplar;
        private Emprestimo emprestimo;
        private Devolucao devolucao;

        ExemplarEmprestimo() {
                exemplarEmprestimoID = contadorExemplarEmprestimo;
                contadorExemplarEmprestimo++;
        }

        public int getExemplarEmprestimoID() {
                return exemplarEmprestimoID;
        }

        public Exemplar getExemplar() {
                return exemplar;
        }

        public Emprestimo getEmprestimo() {
                return emprestimo;
        }

        public Devolucao getDevolucao() {
                return devolucao;
        }

        public void setExemplarEmprestimoID(int exemplarEmprestimoID) {
                this.exemplarEmprestimoID = exemplarEmprestimoID;
        }

        public void setExemplar(Exemplar exemplar) {
                this.exemplar = exemplar;
        }

        public void setEmprestimo(Emprestimo emprestimo) {
                this.emprestimo = emprestimo;
        }

        public void setDevolucao(Devolucao devolucao) {
                this.devolucao = devolucao;
        }

}
