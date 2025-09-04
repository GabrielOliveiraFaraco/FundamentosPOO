public class Main {
    public static void main(String[] args) {
        Aluno newAluno = new Aluno();

        newAluno.nome = "Roberto";
        newAluno.nota = 6.9;

        System.out.println("O aluno está " + newAluno.situacao() + "!");
    }
}