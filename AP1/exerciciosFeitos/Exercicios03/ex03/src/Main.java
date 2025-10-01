public class Main {
    public static void main(String[] args) {
        Escola escola = new Escola("Marechal Deodoro","Rua ale ale ale", new Diretor("Luis", "123.456.789-12"));

        System.out.println(escola.apresentarEscola());
    }
}