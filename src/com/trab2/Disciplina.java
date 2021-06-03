
package com.trab2;

public class Disciplina {
    public Aluno[] alunos = new Aluno[10];
    public double[] nota01 = new double[10];
    public double[] nota02 = new double[10];
    private int totalAlunos = 0;
    public void addNomeArray(String nome, double newNota1, double newNota2) {

        this.alunos[totalAlunos] = new Aluno();
        this.alunos[totalAlunos].alteraNome(nome);
        this.alunos[totalAlunos].alteraId(totalAlunos);
        this.alunos[totalAlunos].nota1 = newNota1;
        this.alunos[totalAlunos].nota2 = newNota2;
        totalAlunos++;
    }

    public double mediaNota1() {
        double sum = 0;
        for (int i = 0; i < alunos.length; i++) {
            sum += this.alunos[i].nota1;

        }
        return sum / alunos.length;
    }
    public void mostra(int posicao){

        System.out.println("___________________________");

        if (posicao > totalAlunos){
           System.out.println("Valor de posicao invalido");
       }
        else if(posicao == 0){
            this.alunos[posicao+1].imprimeNome();
        }

        else if (posicao == this.totalAlunos){
            this.alunos[posicao-1].imprimeNome();

        }
        else{
            this.alunos[posicao-1].imprimeNome();
            this.alunos[posicao+1].imprimeNome();
        }

        System.out.println("___________________________");



    }
}