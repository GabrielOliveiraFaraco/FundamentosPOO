import java.util.Scanner;

class Soma
{
    public int numero1;
    public int numero2;
    public int resultado;

    public void print(){
        this.resultado = this.numero1 + this.numero2;
        System.out.println("A soma dos números é " + resultado);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero1 = sc.nextInt();
        System.out.println("Digite outro Número: ");
        int numero2 = sc.nextInt();



        Soma soma = new Soma();
        soma.numero1 = numero1;
        soma.numero2 = numero2;

        soma.print();

        sc.close();
    }
}