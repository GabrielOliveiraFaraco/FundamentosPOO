import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        double numero1 = sc.nextDouble();
        System.out.println("Digite outro Número: ");
        double numero2 = sc.nextDouble();

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação é: " + resultado);
    }
}