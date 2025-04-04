package java03_concatenacao_string;

// Vantagem : Mais eficiente que (+) quando há muitas concatenações.
// Evita múltiplos Objetos (String)

public class Usando_StringBuilder {
    public static void main(String[] args) {
        //Usando StringBuilder

        StringBuilder teste = new StringBuilder();
        teste.append("Eu amo ");
        teste.append("Java");
        teste.append("!");

        System.out.println(teste);
    }
}
