# Métodos Construtores
[<-- Voltar](../README.md)

### 1. Definição ([Exemplo](./Construtores.java)):

Métodos construtores implementam a forma de inicialização de um objeto. Neles definimos quais são os parâmetros necessários para criar um novo objeto e como que será feita a configuração inicial dos seus atributos.

O método construtor deve ser público, possuir o mesmo nome que a classe que o implementa e não ter nenhum retorno.

- **Sintaxe**:

```java
public class MinhaClasse {
    // Método construtor
    public MinhaClasse ( parâmetros ) {
        código
    }
}
```

A utilização do método construtor se dá somente quando queremos criar um novo objeto da classe, para isso, a sua chamada deve ser feita precedida pela palavra-chave ```new```, indicando que o retorno desse método é um novo objeto.

```java
MinhaClasse meuObjeto = new MinhaClasse( parâmetros );
```

<br>

- [Exercícios](./exercicios.md)