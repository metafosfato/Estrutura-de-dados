package Exercicio2;

public class Aluno{
    private int idade;
    private double nota;
    private String nome;

    public Aluno(String nome, int idade, double nota){
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome(){
        return this.nome;
    }       

    public int getIdade(){
        return this.idade;
    }

    public double getNota(){
        return this.nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNota(double nota){
        this.nota = nota;
    }
 
}