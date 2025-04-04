Ótimo! Vamos abordar **pacotes (MSVM)** em Java e **modificadores de acesso**, explicando tudo de forma clara.

---

# 📦 **Pacotes (MSVM) em Java**

### ✅ **O que são pacotes?**
Pacotes são uma forma de **organizar** as classes em um projeto Java. Eles ajudam a **evitar conflitos de nomes** e a **separar responsabilidades** dentro do código.

💡 **MSVM** significa:
- **M**odels → Representam os **dados** do sistema.
- **S**ervices → Contêm a **lógica de negócio**.
- **V**iews → Lidam com a **interface do usuário**.
- **M**ain → Contém a **classe principal** que inicia o programa.

---

## 📂 **Estrutura de Pacotes no Java (MSVM)**

Um projeto organizado pode ter essa estrutura:

```
Livraria
│── src
│   ├── models      # Dados e entidades
│   │   ├── Cliente.java
│   │   ├── Endereco.java
│   ├── services    # Regras de negócio
│   │   ├── Cadastro.java
│   ├── views       # Interface do usuário
│   │   ├── MenuInicial.java
│   ├── main        # Ponto de entrada do programa
│   │   ├── Principal.java
```

### 📌 **Criando pacotes no IntelliJ**
1. Clique com o botão direito em `src` → `New` → `Package`.
2. Nomeie os pacotes (`models`, `services`, `views`, `main`).
3. Arraste cada classe para seu pacote correspondente.
4. No topo de cada arquivo `.java`, adicione o **package** correto:
   ```java
   package models;
   ```
5. **Se precisar usar classes de outro pacote, importe-as:**
   ```java
   import models.Cliente;
   ```

---

# 🔐 **Modificadores de Acesso em Java**
Os **modificadores de acesso** controlam **quem pode acessar** classes, atributos e métodos dentro e fora dos pacotes.

| Modificador   | Mesma Classe | Mesmo Pacote | Subclasse (herança) | Fora do Pacote |
|--------------|-------------|-------------|---------------------|---------------|
| `public`     | ✅ Sim      | ✅ Sim      | ✅ Sim              | ✅ Sim       |
| **`protected`** | ✅ Sim  | ✅ Sim      | ✅ Sim              | ❌ Não       |
| **(default)** _(sem modificador)_ | ✅ Sim | ✅ Sim | ❌ Não | ❌ Não |
| **`private`**  | ✅ Sim  | ❌ Não      | ❌ Não              | ❌ Não       |

---

## 📌 **Exemplos na prática**

### 🔹 **`public` (Acesso Livre)**
Uma classe `Cliente` pública pode ser acessada de qualquer lugar:
```java
package models;

public class Cliente {
    public String nome;
}
```
Agora, podemos usar essa classe **de qualquer pacote**:
```java
import models.Cliente;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nome = "João"; // ✅ Acesso permitido
    }
}
```

---

### 🔹 **`private` (Apenas dentro da mesma classe)**
```java
package models;

public class Cliente {
    private String senha; // Só pode ser acessada dentro da classe Cliente

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
```
❌ Se tentarmos acessar de fora:
```java
Cliente cliente = new Cliente();
cliente.senha = "1234"; // ❌ ERRO! senha é private.
```

---

### 🔹 **`protected` (Acesso no mesmo pacote + subclasses)**
Se `Cadastro` está em outro pacote, só quem **herda** pode acessar `protected`:
```java
package models;

public class Cliente {
    protected String email;
}
```
```java
package services;
import models.Cliente;

public class Cadastro extends Cliente {
    public void cadastrar() {
        email = "teste@email.com"; // ✅ Pode acessar porque herda Cliente
    }
}
```
```java
package views;

import models.Cliente;

public class Menu {
    public void exibir() {
        Cliente c = new Cliente();
        c.email = "teste@email.com"; // ❌ ERRO! Está em outro pacote e não herda.
    }
}
```

---

### 🔹 **Sem Modificador (Default - Pacote Padrão)**
Se não colocamos `public`, `private` ou `protected`, **só pode ser acessado dentro do mesmo pacote**:
```java
package models;

class Endereco { // Não tem "public", então é "default"
    String rua;
}
```
Fora do `models`, dá erro:
```java
package services;
import models.Endereco;

public class Teste {
    Endereco e = new Endereco(); // ❌ ERRO! Endereco tem acesso "default".
}
```

---

# 🎯 **Resumo**
- **Pacotes organizam o código em `models`, `services`, `views` e `main`.**
- **Os modificadores de acesso controlam quem pode acessar atributos e métodos:**
    - `public` → Acessível de qualquer lugar.
    - `private` → Apenas dentro da mesma classe.
    - `protected` → Mesmo pacote + subclasses.
    - **Sem modificador** → Apenas dentro do mesmo pacote.

Agora seu código estará mais **organizado, seguro e fácil de entender**! 🚀

Se tiver dúvidas, só perguntar! 😃
