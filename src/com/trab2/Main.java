// Antonio Viana
package com.trab2;

public class Main {

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.alteraNome("Weiland");
        aluno1.alteraId(1);
        aluno1.nota1 = 3.5;
        aluno1.nota2 = 6.5;
        aluno1.calculaMedia(aluno1.nota1, aluno1.nota2);
        aluno1.retornaMedia();
        aluno1.passou();


    }

}