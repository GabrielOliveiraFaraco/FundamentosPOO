import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        if (idade >= 18) {
            boolean maiorDeIdade = true;
            System.out.println("Você é maior de idade!");
        } else {
            boolean maiorDeIdade = false;
            System.out.println("Você é menor de idade!");
        }

        sc.close();
    }
}