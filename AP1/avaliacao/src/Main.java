public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jorge", 1987, new Endereco("Rua São Nascimento", 577, "Vila São João", 95560000, new Municipio("Torres", new Estado("Rio Grande do Sul"))));

        System.out.println(cliente.clienteEndereco());

    }
}