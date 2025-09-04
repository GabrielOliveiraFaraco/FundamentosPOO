import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Elevador elevador = new Elevador();

        elevador.andarAtual = 0;
        elevador.pessoas = 0;
        elevador.capacidade = 8;
        elevador.totalAndares = 10;


        while(true){
            try{
                Scanner input = new Scanner(System.in);

                System.out.println("\n\nO que você gostaria de fazer:\n\n1 - Entrar no elevador\n2 - Sair do elevador\n3 - Subir um andar\n4 - Descer um andar\n5 - Sair\n\n--- ");
                int opcao = input.nextInt();

                switch (opcao){
                    case 1:
                        elevador.entrar();
                        break;

                    case 2:
                        elevador.sair();
                        break;

                    case 3:
                        elevador.subir();
                        break;

                    case 4:
                        elevador.descer();
                        break;

                    case 5:
                        System.out.println("\nSaindo...");
                        return;

                    default:
                        System.out.println("\nA entrada é inválida.");
                }

            } catch (InputMismatchException e){
                System.out.println("\nA entrada é inválida.");
            }
        }
    }
}