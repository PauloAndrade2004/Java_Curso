package EstudoArrayList;

import java.util.Scanner;

public class Menu {

    public void Menu() {
        System.out.println("=== Menu ===");

        Scanner entrada = new Scanner(System.in);
        ArraysListEstudo arrayListEstudo = new ArraysListEstudo(); // ✅ instância única

        while (true) {
            System.out.println("\n1 - Adicionar cliente");
            System.out.println("2 - Listar cliente");
            System.out.println("3 - Remover cliente");
            System.out.println("4 - Remover cliente pelo índice");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            int escolher = entrada.nextInt();
            entrada.nextLine(); // limpa buffer

            switch (escolher) {
                case 1:
                    arrayListEstudo.adicionarCliente();
                    break;
                case 2:
                    arrayListEstudo.listarClientes();
                    break;
                case 3:
                    arrayListEstudo.removerElemento();
                    break;
                case 4:
                    arrayListEstudo.removerClienteIndex();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
