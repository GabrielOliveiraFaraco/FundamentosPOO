import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero1 = sc.nextDouble();
        System.out.println("Digite outro número: ");
        double numero2 = sc.nextDouble();

        if (numero1 > 0 && numero2 > 0) {
            double resultado = numero1 / numero2;
            System.out.println("A divisão é: " + resultado);
        } else {
            System.out.println("A divisão não pode ser feita se um dos números for 0 ou menor.");
        }
    }
}