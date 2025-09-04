import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Carro newCarro = new Carro();

        newCarro.modelo = "Fusca";
        newCarro.ano = 1973;
        newCarro.velocidade = 0;

        while (true){
            try{
                Scanner input = new Scanner(System.in);

                System.out.printf("\nVelocidade %dkm/h\n\nVocê quer acelerar(1), freiar(2) ou sair(3): ", newCarro.velocidade);
                int opcao = input.nextInt();

                switch (opcao){
                    case 1:
                        newCarro.acelerar();
                        break;

                    case 2:
                        newCarro.frear();
                        break;

                    case 3:
                        System.out.println("\nSaindo...");
                        input.close();
                        return;

                    default:
                        System.out.println("\nDigite um valor válido!");
                }
            } catch (InputMismatchException e){
                System.out.println("\nDigite um valor válido.");
            }
        }
    }
}