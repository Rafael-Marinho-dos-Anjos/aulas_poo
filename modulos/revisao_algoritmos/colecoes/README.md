# Vetores, Matrizes, Listas e Hashmaps
[<-- Voltar](../README.md)

### 1. Estruturas de dados simples ([Exemplo](./EstruturasSimples.java)):

São estruturas que armazenam uma sequência de valores de um mesmo tipo em um espaço de memória contínuo, dessa forma, como cada dado possui um tamanho fixo, a posição ocupada por cada elemento na memória é fixa e pode ser facilmente acessada através da posição do elemento dentro da estrutura. Esse tipo de estrutura não pode ter o seu tamanho alterado depois de criado.

No Java, temos dois tipos de estruturas de dados simples: vetor e matriz:

- Vetor: chamado de ```array```, possui indexação simples (a posição do elemento é indicada por um único número inteiro);

```java
// Criando um vetor vazio
tipo_de_dado[] nome_do_vetor = new tipo_de_dado[tamanho_do_vetor];

// Criando um vetor já preenchido
tipo_de_dado[] nome_do_vetor = {elemento_1, elemento_2, ... , elemento_n};
```

- Matriz: é um vetor de duas dimensões, possui dupla indexação (a posição do elemento é indicada por dois números inteiros). Outra forma de interpretar uma matriz é como um vetor onde cada um dos seus elementos internos é outro vetor.

```java
// Criando uma matriz vazia
tipo_de_dado[][] nome_da_matriz = new tipo_de_dado[tamanho_dim_1][tamanho_dim_2];

// Criando uma matriz já preenchida
tipo_de_dado[][] nome_da_matriz = {
    {elemento_1_1, elemento_1_2, ... , elemento_1_n},
    {elemento_2_1, elemento_2_2, ... , elemento_2_n},
    ...
    {elemento_m_1, elemento_m_2, ... , elemento_m_n}
};
```

Para acessar um elemento dentro de um vetor ou matriz, basta informar a posição (index) desse elemento entre colchetes:

```java
// Alterando o valor do elemento
vetor[n] = 10;
matriz[m][n] = 10;

// Recuperando o valor armazenado
System.out.println(vetor[n]);
System.out.println(matriz[m][n]);
```

Para saber o tamanho (número de elementos) de um vetor, basta acessar o parâmetro ```lenght```:

```java
int tamanhoDoVetor = vetor.length;
int tamanhoDaPrimeiraDimensaoDaMatriz = matriz.lenght;
int tamanhoDaSegundaDimensaoDaMatriz = matriz[0].lenght;
```

### 2. Coleções ([Exemplo](./Colecoes.java)):

Em Java, uma coleção é uma estrutura de dados que permite armazenar e manipular grupos de variáveis ou objetos em sequência.

O Java nativamente oferece uma série de interfaces para coleções através da biblioteca ```Java Collections Framework```. Veremos algumas a seguir:

- ```ArrayList```: Uma lista dinâmica (não possui tamanho fixo) que possui a sua implementação baseada em array. O seu acesso por meio de índices é eficiente, mas é mais lenta para modificar a sua estrutura (adicionar ou remover elementos, assim alterando o tamanho da lista);

```java
import java.util.ArrayList;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args){
        List<tipo_de_dado> lista = new ArrayList<>();

        lista.add(elemento_1);
        lista.add(elemento_2);
        ...
        lista.add(elemento_n);
    }
}
```

- ```LinkedList```: Uma lista onde cada elemento é um objeto que aponta para o próximo e para o anterior na sequência. É eficiente para adicionar ou remover elementos, mas o seu acesso por índice é lento, pois ela deve navegar do início (ou fim) da lista até alcançar o índice correspondente em vez de acessar a memória diretamente;

```java
import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args){
        LinkedList<tipo_de_dado> lista = new LinkedList<>();

        lista.add(elemento_1);
        lista.add(elemento_2);
        ...
        lista.add(elemento_n);
    }
}
```

- ```HashMap```: É uma coleção que combina uma chave a um objeto, de forma que o acesso aos elementos do ```HashMap``` não é feito através de índices, mas sim pelos valores das chaves.

```java
import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args){
        HasMap<tipo_de_dado_chave, tipo_de_dado_valor> mapa = new HashMap<>();

        mapa.put(chave_1, elemento_1);
        mapa.put(chave_2, elemento_2);
        ...
        mapa.put(chave_n, elemento_n);
    }
}
```

O método ```add``` do ```ArrayList``` e do ```LinkedList``` também pode ser utilizado para adicionar elementos em uma posição específica da lista. Caso se queira inserir no início, também pode se usar o método ```addFirst```, caso queira inserir no final, pode ser usado ```addLast```:

```java
// Adicionando elementos na n-ézima posição da lista
lista.add(n, elemento);
listaEncadeada.add(n, elemento);

// Adicionando elementos no início da lista
lista.addFirst(elemento);
listaEncadeada.addFirst(elemento);

// Adicionando elementos no fim da lista
lista.addLast(elemento);
listaEncadeada.addLast(elemento);
```

Para remover um elemento de uma coleção, basta utilizar o método ```remove``` seguido do index ou chave:

```java
// Removendo elemento localizado na n-ézima posição
lista.remove(n);
listaEncadeada.remove(n);

// Removendo elemento de um HashMap
mapa.remove(chave);
```

O acesso aos elementos de coleções é feito através de métodos ```get``` e ```set``` (```put``` no caso de ```HashMap```):

```java
// Acessando os valores das coleções
elementoLista = arraylist.get(index);
elementoListaEncadeada = linkedlist.get(index);
elementoMapa = hashmap.get(chave);

// Alterando os valores das coleções
arraylist.set(index, novoValor);
linkedlist.set(index, novoValor);
hashmap.put(chave, novoValor);
// ou
hashmap.replace(chave, novoValor);
```

O tamanho das coleções é obtido através do método ```size```:

```java
int tamanhoDoArrayList = lista.size();
int tamanhoDoLinkedList = listaEncadeada.size();
int tamanhoDoHashMap = mapa.size(); // Quantidade de conjuntos chave-valor
```

As chaves contidas no ```HashMap``` podem ser obitidas através do método ```keySet```:

```java
Set<tipo_da_chave> chaves = mapa.keySet();
```



<br>

- [Exercícios](./exercicios.md)