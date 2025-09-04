public class Aluno {

    public String nome;
    public double nota;

    public boolean aprovado() {
        if (nota >= 7) {
            return true;
        } else {
            return false;
        }
    }

    public String situacao(){
        if (aprovado()){
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

}
