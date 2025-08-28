import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        float numero1 = input.nextFloat();

        System.out.println("Digite outro número: ");
        float numero2 = input.nextFloat();

        // verificar o menor número e verificar se o número é igual

        if (numero1 == numero2){
            System.out.println("Os números são iguais!");
        } else if (numero1 > numero2){
            System.out.println("O primeiro número: " + numero1 + " é maior que o segundo número: " + numero2 + ".");
        } else {
            System.out.println("O segundo número: " + numero2 + " é maior que o primeiro número: " + numero1 + ".");
        }
    }
}