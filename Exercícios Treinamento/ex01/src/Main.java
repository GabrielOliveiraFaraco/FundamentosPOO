class Nome{
    public String nome;

    public void print(){
        System.out.println("Seu nome é: " + nome);
    }
}

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
    }
}
