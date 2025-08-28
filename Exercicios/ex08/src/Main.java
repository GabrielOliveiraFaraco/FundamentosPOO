import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = sc.nextInt();
        System.out.println("Digite o último número: ");
        int numero3 = sc.nextInt();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média desses 3 números é: " + media);
    }
}