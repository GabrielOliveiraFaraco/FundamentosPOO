import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContaBancaria newContaBancaria = new ContaBancaria();

        newContaBancaria.numero = 123456789;
        newContaBancaria.titular = "Clóvis";
        newContaBancaria.saldo = 1000;

        while(true){
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("\nDigite o que você gostaria de fazer:\n\n1 - Verificar saldo.\n2 - Depositar.\n3 - Sacar\n4 - Sair.\n");
                int menu = input.nextInt();

                double valor;

                switch (menu) {
                    case 1:
                        newContaBancaria.exibirSaldo();
                        break;

                    case 2:
                        System.out.println("Digite o falor que deseja depositar:");
                        valor = input.nextDouble();
                        newContaBancaria.depositar(valor);
                        break;

                    case 3:
                        System.out.println("Digite o valor que deseja sacar:");
                        valor = input.nextDouble();
                        newContaBancaria.sacar(valor);
                        break;

                    case 4:
                        System.out.println("Saindo...");
                        input.close();
                        return;

                    default:
                        System.out.println("Digite um valor válido!");
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("\nDigite apenas números inteiros de 1 a 4!");
            }
        }
    }
}