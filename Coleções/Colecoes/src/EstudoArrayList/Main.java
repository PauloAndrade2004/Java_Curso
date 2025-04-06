package EstudoArrayList;

public class Main {
    public static void main(String[] args) {
        //Criando o objeto Cliente.
        Cliente cliente1 = new Cliente("Paulo", 20);
        Cliente cliente2 = new Cliente("Gabrielle", 24);

        ArraysListEstudo adicionar =  new ArraysListEstudo();
        adicionar.adicionarCliente(cliente1);
        adicionar.adicionarCliente(cliente2);

        adicionar.listarClientes();
    }
}
