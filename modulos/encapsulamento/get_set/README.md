# Getters e Setters
[<-- Voltar](../README.md)

Uma prática comum na linguagem Java é definir **todos** os atributos de uma classe como privados. Dessa forma, todo o acesso a atributos é feito por intermédio de métodos, possibilitando que toda espécie de alteração de valores seja feita de forma segura com a adição de regras e verificações.

## 1. Getters ([Exemplo](./CLiente.java)):

Métodos getters retornam o valor salvo em um atributo, sua assinatura é pública, seu tipo de retorno deve ser o mesmo tipo da variável retornada e não possui parâmetros de entrada. Por padrão, o nome de um método getter é iniciado por ```get``` seguido do nome da variável retornada no padrão ```camelCase```.

- Exemplo:

```java
public class MinhaClasse {
    int variavelInteira;

    public int getVariavelInteira() {
        return this.variavelInteira;
    }
}
```

## 2. Setters ([Exemplo](./CLiente.java)):

Métodos set ters modificam o valor salvo em um atributo, sua assinatura é pública e seu tipo de retorno é ```void``` e, na maioria das vezes, recebe um parâmetro do mesmo tipo da variável modificada. Por padrão, o nome de um método setter é iniciado por ```set``` seguido do nome da variável modificada no padrão ```camelCase```.

```java
public class MinhaClasse {
    int variavelInteira;

    public void setVariavelInteira( int novoValor ) {
        this.variavelInteira = novoValor;
    }
}
```

<br>

- [Exercícios](./exercicios.md)