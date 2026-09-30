package br.com.estudo;

import java.util.Scanner;

public class Terminal {
    private final Scanner scanner = new Scanner(System.in);
    private final GerenciadorContato gerenciador = new GerenciadorContato();

    public void iniciar() {


        boolean n = true;
        while (n) {
            System.out.println("------Agenda de Contatos-------");
            System.out.println("Escolha uma opcao abaixo");
            System.out.println("""
                    1 - Listar todos os contatos
                    2 - Adicionar contato
                    3 - Buscar contato
                    4 - Remover contato
                    0 - Sair
                    """);
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Todos os contatos!");
                for (Contato contato : gerenciador.listarContatos()) {
                    System.out.println(contato.toString());

                }
            }

            if (opcao == 2) {
                Contato contato = cadastrarContato();
                gerenciador.adcionarContato(contato);
            }

            if (opcao == 3) {
                System.out.println("Digite o nome:");
                String _nome = scanner.next();
                System.out.println(gerenciador.buscarContato(_nome).toString());
            }
            if (opcao == 4) {
                System.out.println("Digite o nome:");
                String _nome = scanner.next();
                System.out.println(gerenciador.removerContato(_nome));
                System.out.println("Contato Removido");
            }

            if (opcao == 0) {
                System.out.println("Saindo...");
                n = false;
            }

        }
    }

    public Contato cadastrarContato() {
        
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();
        return new Contato(nome, email, telefone);

    }
}
