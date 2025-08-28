import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu peso (em Kg): ");
        float peso = input.nextFloat();

        System.out.println("Digite sua altura (em Metros): ");
        float altura = input.nextFloat();

        float imc = peso / (altura * altura);

        System.out.println("Seu IMC é " + imc + ".");
    }
}