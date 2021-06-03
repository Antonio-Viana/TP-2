
package com.trab2;

public class Disciplina {
    public String[] alunos = new String[10];
    public double[] nota01 = new double[10];
    public double[] nota02 = new double[10];

    public void addNomeArray(String nome, int posicao) {
        this.alunos[posicao] = nome;
    }


}
