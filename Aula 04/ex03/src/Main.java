import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.println("Digite seu peso: ");
        float peso = input.nextFloat();
        input.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = input.nextLine();
        input.nextLine();

        System.out.println("Olá " + nome + " " + sobrenome + ", você tem " + idade + " anos e " + peso + "Kg.");

    }
}