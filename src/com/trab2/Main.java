// Antonio Viana
package com.trab2;

public class Main {

    public static void main(String[] args) {
        // instâncias
        Aluno aluno1 = new Aluno();
        aluno1.alteraNome("Frusciante");
        aluno1.alteraId(1);
        aluno1.nota1 = 3.5;
        aluno1.nota2 = 6.5;

        // metodos separados
        aluno1.calculaMedia(aluno1.nota1, aluno1.nota2);
        aluno1.retornaMedia();
        aluno1.passou();

        Disciplina calculo = new Disciplina();
        calculo.addNomeArray("Frusciante", 10, 10);
        calculo.addNomeArray("Flea", 9, 9);
        calculo.addNomeArray("Anthony", 0,0);
        calculo.addNomeArray("Chad", 8, 8);
        calculo.addNomeArray("Cobain", 5, 5);

        calculo.mostra(3);
        calculo.mostra(0);
        calculo.mostra(6);

    }

}