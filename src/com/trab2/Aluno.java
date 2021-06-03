package com.trab2;

public class Aluno {
    private String nome;
    private int id;
    private double media;
    protected double nota1;
    protected double nota2;

    public void alteraNome(String novoNome){
        nome = novoNome;
    }
    public void imprimeNome (){
        System.out.println(nome);
    }
    public void alteraId(int novoId){
        id = novoId;
    }
    public void imprimeId(){
        System.out.println(id);
    }

    protected void calculaMedia (double nota1, double nota2){
        media = (nota1 + nota2)/2;
    }
    public void retornaMedia (){
        System.out.println("A média é " + media);
    }

    public void passou (){
        if(media >= 7){

            System.out.println("O aluno foi aprovado!");
        }else{
            System.out.println("O aluno foi reprovado.");
        }
    }





}
