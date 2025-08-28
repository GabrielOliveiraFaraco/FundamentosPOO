import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        BigDecimal numero1 = sc.nextBigDecimal();
        System.out.println("Digite outro número: ");
        BigDecimal numero2 = sc.nextBigDecimal();

        BigDecimal resultado = numero1.add(numero2);

        System.out.println("A soma dos números é: " + resultado);
    }
}