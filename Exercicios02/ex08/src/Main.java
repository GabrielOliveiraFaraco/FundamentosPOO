import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Calculadora calcularora = new Calculadora();

        while (true){
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("\nQual operação você deseja realizar?\n\n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair\n\n--- ");

                int opcao = input.nextInt();
                double numero1;
                double numero2;

                switch (opcao){
                    case 1:
                        System.out.println("Digite o primeiro número: ");
                        numero1 = input.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        numero2 = input.nextDouble();

                        System.out.printf("A resposta da soma é %.2f.", calcularora.somar(numero1, numero2));
                        break;

                    case 2:
                        System.out.println("Digite o primeiro número: ");
                        numero1 = input.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        numero2 = input.nextDouble();

                        System.out.printf("A respostada subtração é %.2f.", calcularora.subtrair(numero1, numero2));
                        break;

                    case 3:
                        System.out.println("Digite o primeiro número: ");
                        numero1 = input.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        numero2 = input.nextDouble();

                        System.out.printf("A resposta da multiplicação é %.2f.", calcularora.multiplicar(numero1, numero2));
                        break;

                    case 4:
                        System.out.println("Digite o primeiro número: ");
                        numero1 = input.nextDouble();
                        System.out.println("Digite o segundo número: ");
                        numero2 = input.nextDouble();

                        if(calcularora.dividir(numero1, numero2) == 0){
                            System.out.println("Não é possível realizar uma divisão por 0.");
                        } else {
                            System.out.printf("A resposta da divisão é %.2f.", calcularora.dividir(numero1, numero2));
                        }
                        break;

                    case 5:
                        System.out.println("Saindo...");
                        return;

                    default:
                        System.out.println("Entrada inválida.");
                }

                input.close();

            } catch (InputMismatchException e){
                System.out.println("Entrada inválida.");
            }
        }
    }
}