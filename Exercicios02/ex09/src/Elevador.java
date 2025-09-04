public class Elevador {

    public int andarAtual;
    public int totalAndares;
    public int capacidade;
    public int pessoas;

    public void entrar(){
        if (pessoas < capacidade){
            pessoas++;
            System.out.printf("\nO total de pessoas no elevador é de %d. O máximo é de %d.", pessoas, capacidade);
        } else {
            System.out.printf("\nO total de pessoas não pode exceder a capacidade total de %d.", capacidade);
        }
    }

    public void sair(){
        if (pessoas > 0){
            pessoas--;
            System.out.printf("\nO total de pessoa é de %d.", pessoas);
        } else {
            System.out.println("\nNão tem ninguém no elevador.");
        }
    }

    public void subir(){
        if (andarAtual < totalAndares){
            andarAtual++;
            System.out.printf("\nVocê está no andar %d.", andarAtual);
        } else {
            System.out.println("\nVocê já chegou na Cobertura");
        }
    }

    public void descer(){
        if (andarAtual > 0){
            andarAtual--;
            System.out.printf("\nVocê está no andar %d.", andarAtual);
        } else {
            System.out.println("\nVocê já está no térreo.");
        }
    }
}
