import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro newLivro = new Livro();

        newLivro.titulo = "THE WAY OF THE SUPERIOR MAN";
        newLivro.autor = "DAVID DEIDA";
        newLivro.disponivel = true;

        while(true){
            try{
                Scanner input = new Scanner(System.in);

                System.out.printf("\nLivro disponível: %s\n\nVocê deseja emprestar(1), devolter(2) ou sair(3): ", newLivro.titulo);
                int opcao = input.nextInt();

                switch (opcao){
                    case 1:
                        newLivro.emprestar();
                        break;

                    case 2:
                        newLivro.devolver();
                        break;

                    case 3:
                        System.out.println("Saindo...");
                        input.close();
                        return;

                    default:
                        System.out.println("Entrada inválida.");
                }
            } catch (InputMismatchException e){
                System.out.println("Entrada inválida.");
            }
        }
    }
}