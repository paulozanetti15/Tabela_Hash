import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TabelaHash tabela = new TabelaHash(10);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nCLUBE DE REGATAS DO FLAMENGO");
            System.out.println("\nOlá Adenor, escolha uma ação para o seu gerenciamento de elenco:");
            System.out.println("1. Inserir jogador");
            System.out.println("2. Buscar jogador");
            System.out.println("3. Remover jogador");
            System.out.println("4. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Número da camisa: ");
                int numero = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nome do jogador: ");
                String nome = scanner.nextLine();

                Dado jogador = new Dado(numero, nome);
                tabela.inserir(jogador);
            } else if (opcao == 2) {
                System.out.print("Número da camisa a ser buscado: ");
                int numero = scanner.nextInt();

                ArrayList<Dado> resultados = tabela.buscar(numero);
                if (resultados != null && !resultados.isEmpty()) {
                    for (Dado resultado : resultados) {
                        System.out.println("Jogador encontrado: " + resultado.getNome());
                    }
                } else {
                    System.out.println("Jogador não encontrado.");
                }
            } else if (opcao == 3) {
                System.out.print("Número da camisa a ser removido: ");
                int numero = scanner.nextInt();

                Dado resultado = tabela.remover(numero);
                if (resultado != null) {
                    System.out.println("Jogador removido: " + resultado.getNome());
                } else {
                    System.out.println("Jogador não encontrado.");
                }
            } else if (opcao == 4) {
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
