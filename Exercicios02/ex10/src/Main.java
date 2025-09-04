import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Contato contato = new Contato();
        Agenda agenda = new Agenda();

        while(true){
            try{

                Scanner input = new Scanner(System.in);

                System.out.println("\nO que gostaria de fazer?\n\n1 - Adicionar um contato\n2 - Remover um contato\n3 - Listar contatos\n4 - Sair\n\n---");
                int opcao = input.nextInt();
                input.nextLine();

                switch (opcao){
                    case 1:
                        Contato newContato = new Contato();

                        System.out.println("\nDigite o nome que gostaria de adicionar: ");
                        newContato.nome = input.nextLine();

                        System.out.println("\nDigite o telefone do contato: ");
                        newContato.telefone = input.nextLine();

                        agenda.adicionarContato(newContato);
                        System.out.println("\nContato adicionado com sucesso!");
                        break;

                    case 2:
                        System.out.println("\nDigite o nome do contato que deseja remover: ");
                        String nomeRemover = input.nextLine();

                        for (Contato c : agenda.lista){
                            if (c.nome.equals(nomeRemover)){
                                agenda.removerContato(c);
                                System.out.println("\nContato removido com sucesso!");
                                break;
                            } else {
                                System.out.println("\nContato não encontrado.");
                            }
                        }
                        break;

                    case 3:
                        agenda.listarContato();
                        break;

                    case 4:
                        System.out.println("\nSaindo...");
                        return;

                    default:
                        System.out.println("\nEntrada inválida.");
                }

            } catch (InputMismatchException e){
                System.out.println("\nEntrada inválida.");
            }
        }
    }
}