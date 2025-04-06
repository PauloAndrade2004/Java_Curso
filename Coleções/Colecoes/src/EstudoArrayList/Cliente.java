package EstudoArrayList;

import java.util.List;

public class Cliente {

    private String nome;
    private int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    //criando o metodo toString
    public String toString() {
        return "Nome: " + nome + "\nIdade: " + idade + "\n";
    }
}
