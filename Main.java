package Exercicio2;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);
        Aluno aluno1 = new Aluno("João", 20, 8.5);
        Aluno aluno2 = new Aluno("Maria", 22, 9.0);

        vetor.AdicionarAluno(aluno1);
        vetor.AdicionarAluno(aluno2);
        
        vetor.exibirVetor();
    }
    
}
