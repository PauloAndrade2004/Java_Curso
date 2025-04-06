# Arrays

Arrays são estruturas de dados que armazenam uma coleção de elementos do mesmo tipo, em uma sequência ordenada.

Útil para armazenar um número fixo de elementos.
O tamanho de um array é definido no momento da sua criação e não pode ser alterado.

Todos os elementos em um array devem ser do mesmo tipo.
Os elementos sempre começam no (0), então um array de 5 elementos eles vão de 0 a 4;

## Inicializando um Arrays

### Primeira forma:
```Java 
int[] numeros = {1, 2, 3, 4, 5};
String[] funcionarios = {"Paulo", "Gabrielle", "Arthur", "Diomeneis", "Claudia"};// Aqui criamos e declaramos nele mesmo os nossos elementos.
```
* Aqui nos criamos uma Array, e já atribuímos os elementos nesse array.

### Segunda forma:
```Java
double[] salario = new double[5];  
salario[0] = 500.0;  
salario[1] = 200.0;  
salario[2] = 300.0;  
salario[3] = 400.0;  
salario[4] = 1000.0;
```


## Iterando nosso #array

### Primeira forma : Usando **System.out.println();**
```Java 
System.out.println("O funcionário " + funcionarios[0] + "recebe seu salário de: " + salario[0]);  
System.out.println("O funcionário " + funcionarios[1] + "recebe seu salário de: " + salario[1]);  
System.out.println("O funcionário " + funcionarios[2] + "recebe seu salário de: " + salario[2]);  
System.out.println("O funcionário " + funcionarios[3] + "recebe seu salário de: " + salario[3]);  
System.out.println("O funcionário " + funcionarios[4] + "recebe seu salário de: " + salario[4]);
```

* Estamos utilizando o System.out.println();
* Forma não é muito utilizada pois temos que ficar repetindo varias vezes essa função.

### Segunda forma: Utilizando o #for

```Java

for (int posicao = 0; posicao < funcionarios.length; posicao++) {
System.out.println("Funcionario" + funcionarios[posicao] + "ganha" + salario[i]);
}
```

* Utilizamos o laço de repetição #for .
* E exibindo também tanto a posição do funcionário,  junto com seu salário.
### Terceira forma: Usando o #for-each

```Java 
for (String funcionario : funcionarios) { 
System.outprintln();
}
```

* Atenção: Em um array ele armazena elementos do mesmo tipo, com quando utilizarmos
  o #for-each não podemos atribuir o nome da nosso array.

  Devemos adicionar sempre o **tipo** e depois criamos uma variável e depois o nome que demos a nossa lista.