import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        char caractere = nome.charAt(0);

        System.out.println("A primeira letra do seu nome é " + caractere);
    }
}