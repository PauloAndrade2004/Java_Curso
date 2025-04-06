public class Criando_Array {
    public static void main(String[] args) {

        System.out.println("==== Criando Arrays ====");

        System.out.println("\nPrimeira forma de criar um Array");
        String[] funcionarios = {"Paulo", "Gabrielle", "Arthur", "Diomeneis", "Claudia"};// Aqui criamos e declaramos nele mesmo os nossos elementos.

        System.out.println("\nSegunda maneira de criar um Array");

        double[] salario = new double[5];
        salario[0] = 500.0;
        salario[1] = 200.0;
        salario[2] = 300.0;
        salario[3] = 400.0;
        salario[4] = 1000.0;

        System.out.println("O funcionário " + funcionarios[0] + "recebe seu salário de: " + salario[0]);
        System.out.println("O funcionário " + funcionarios[1] + "recebe seu salário de: " + salario[1]);
        System.out.println("O funcionário " + funcionarios[2] + "recebe seu salário de: " + salario[2]);
        System.out.println("O funcionário " + funcionarios[3] + "recebe seu salário de: " + salario[3]);
        System.out.println("O funcionário " + funcionarios[4] + "recebe seu salário de: " + salario[4]);

        System.out.println("\n"); // Quebra de linha.

        //Estamos iterando sobre o nosso arrays.
        // Iterar sobre o array Podemos usar o (for)
        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("O funcionário " + funcionarios[i] + " ganha R$ " + salario[i]);
        }

        System.out.println("\n"); // Quebra de linha.

        for(Double salarios : salario) {
            System.out.println(salarios);
        }




    }
}
