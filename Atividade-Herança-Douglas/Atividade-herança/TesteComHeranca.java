public class TesteComHeranca1 {
    public static void main(String[] args) {
    AlunoDeGraduacao aluno = new AlunoDeGraduacao ();
    aluno.nome = "Alícia";
    aluno.idade = 18;
    System.out.printf("nome: %s, idade: %d", aluno.nome, aluno.idade);
    }
}