**Coleções** são estruturas de dados que permitem armazenar, mais de um elemento buscar e manipular grupos de **Objetos** de forma mais **flexível** do que arrays.

Neste caso existem alguns tipos de #coleções, iremos abordar Listas, HashMap, Treeset

## Listas

Uma lista em Java é uma coleção ordenada que permite elementos duplicados.

A interface Lista estende a interface #Collection e fornece métodos adicionais para *inserir*, *acessar*, *remover* e *iterar*.

```Java 
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
}
```

Classe **ArraysListEstudo** :
```Java 
public class ArraysListEstudo {  
  
    List<Cliente> clientes = new ArrayList<>();  
  
    public void adiconarCliente(Cliente cliente) {  
  
        System.out.println("=== Adicionando Cliente ===");  
         
        //adicionando cliente  
        clientes.add(cliente);  
	    System.out.println("Adicionado com sucesso!"); 
    }  
}
```

* Neste exemplo criei uma classe Cliente, que tem seus atributos e modificadores de acesso.
* Após isso criei a classe aonde iremos utilizar o ArrayList (List) , foi criado a Lista , passamos como parâmetro o Objeto < Cliente > ( *clientes* = estamos criando o nome da variável)
* Criamos um método chamado *adicioanarCliente*(*Cliente clientes*) passamos como parâmetro o *nome do nosso Objeto e o nome da variável desse Objeto*.
* Usamos ```clientes.add(cliente);``` ele acessa a nossa Lista, adiciona dentro dela, o que foi adicionado dentro do nosso método *adicionarCliente* que no caso fica armazenado na variável *cliente* que passamos como parâmetro.


