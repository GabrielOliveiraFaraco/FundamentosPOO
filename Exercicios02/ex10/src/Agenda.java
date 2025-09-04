import java.util.ArrayList;

public class Agenda {
    public ArrayList<Contato> lista;

    public Agenda(){
        lista = new ArrayList<>();
    }

    public void adicionarContato(Contato contato){
        lista.add(contato);
    }

    public void removerContato(Contato contato){
        lista.remove(contato);
    }

    public void listarContato(){
        for (Contato contato : lista) {

            System.out.println("\nContato:\n");
            System.out.println("Nome: " + contato.nome);
            System.out.println("Telefone: " + contato.telefone);
            System.out.println("----------");
        }
    }
}
