package EstudoArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArraysListEstudo {

    List<Cliente> clientes = new ArrayList<>();

    public boolean adicionarCliente(Cliente cliente) {

        System.out.println("=== Adicionando Cliente ===");

        //adicionando cliente
        boolean adicionado = clientes.add(cliente);

        if (adicionado) {
            System.out.println("Cliente adicionado com sucesso!");
        }else {
            System.out.println("Não foi possivel realizar seu cadastro");
        }

        return adicionado;
    }

    public boolean removerElemento(Cliente cliente) {
        return clientes.remove(cliente);
    }

    public boolean listarClientes() {
        System.out.println("\n=== Listando Clientes ===" );
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
            return false; // Indica que a lista está vazia
        }

        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
        return true; // Indica que há clientes cadastrados
    }





}
