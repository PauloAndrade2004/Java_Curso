## **Métodos da Interface `Collection<E>`**

A interface `Collection` é a base para `List`, `Set` e `Queue`, então esses métodos funcionam em todas elas.

### **Adição e Remoção**

- `boolean add(E e)`: Adiciona um elemento à coleção. ( Retorna: *True* ou *False* )

- `boolean remove(Object o)`: Remove um elemento específico da coleção.

- `boolean addAll(Collection<? extends E> c)`: Adiciona todos os elementos de outra coleção.

- `boolean removeAll(Collection<?> c)`: Remove todos os elementos de outra coleção.

- `boolean retainAll(Collection<?> c)`: Mantém apenas os elementos que também estão na outra coleção.

- `void clear()`: Remove todos os elementos.


### **Consulta**

- `boolean contains(Object o)`: Verifica se a coleção contém um elemento.

- `boolean containsAll(Collection<?> c)`: Verifica se a coleção contém todos os elementos de outra coleção.

- `boolean isEmpty()`: Verifica se a coleção está vazia.

- `int size()`: Retorna o número de elementos na coleção.


### **Iteração**

- `Iterator<E> iterator()`: Retorna um iterador para percorrer os elementos.

- `Object[] toArray()`: Retorna um array com os elementos.

- `<T> T[] toArray(T[] a)`: Retorna um array do tipo específico informado.


---

## **Métodos da Interface `List<E>`**

A interface `List` estende `Collection` e adiciona métodos específicos para manipular listas ordenadas.

### **Acesso por Índice**

- `E get(int index)`: Obtém o elemento em uma posição específica.

- `E set(int index, E element)`: Substitui um elemento em uma posição específica.

- `void add(int index, E element)`: Adiciona um elemento em uma posição específica.

- `E remove(int index)`: Remove um elemento na posição específica.

- `int indexOf(Object o)`: Retorna o índice da primeira ocorrência do elemento.

- `int lastIndexOf(Object o)`: Retorna o índice da última ocorrência do elemento.
    