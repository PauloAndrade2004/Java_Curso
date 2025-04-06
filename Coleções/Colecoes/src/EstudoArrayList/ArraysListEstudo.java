package EstudoArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ArraysListEstudo {

     List<Cliente> clientes = new ArrayList<>();


    public boolean adicionarCliente() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Adicionando Cliente ===");

        System.out.print("Digite o nome do cliente: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a idade do cliente: ");
        int idade = entrada.nextInt();

        // Criando o objeto Cliente com os dados inseridos
        Cliente novoCliente = new Cliente(nome, idade);

        // Adicionando à lista
        boolean adicionado = clientes.add(novoCliente);

        if (adicionado) {
            System.out.println("Cliente adicionado com sucesso!");
        } else {
            System.out.println("Não foi possível realizar seu cadastro");
        }

        return adicionado;
    }


    public boolean removerElemento() {
        return clientes.remove(clientes);
    }

    public boolean listarClientes() {
        System.out.println("\n=== Listando Clientes ===");
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
            return false; // Indica que a lista está vazia
        }
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        return true; // Indica que há clientes cadastrados
    }

    public void removerClienteIndex() {
        Scanner entrada = new Scanner(System.in);

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
            return;
        }

        // Mostra a lista de clientes com índices
        System.out.println("Lista de clientes:");
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(i + " - " + clientes.get(i).getNome());
        }

        System.out.print("Digite o número do cliente que deseja remover: ");

        try {
            int index; //Aqui dentro que eu adiciono o Scanner, que criei la em cima.
            index = entrada.nextInt();

            if (index < 0 || index >= clientes.size()) {
                System.out.println("Índice inválido! Nenhum cliente removido.");
            } else {
                clientes.remove(index);
                System.out.println("Cliente removido com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida! Digite um número inteiro.");
        }

        // entrada.close();
    }




}




