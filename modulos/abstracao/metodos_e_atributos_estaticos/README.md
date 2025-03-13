# Métodos e Atributos Estáticos
[<-- Voltar](../README.md)

### 1. Definição ([Exemplo](./Banco.java)):

São características ecomportamentos pertencentes à classe que independem dos objetos. A assinatura/definição dos métodos/atributos estáticos é precedida pela palavra-chave ```static```.

- **Sintaxe**:

```java
public class MinhaClasse {
    static int AtributoEstaticoInteiro;
    static String AtributoEstaticoTextual;

    static void metodoEstatico() {
        código
    }
}
```

### 2. Utilização ([Exemplo](./Static.java)):

A chamada a métodos estáticos deve ser feita diretamente através da própria classe e não através de uma instância.

- **Exemplo**:

```java
MinhaClasse.metodoEstatico();
```

Os atributos estáticos podem ser utilizados livremente nos métodos da classe (tanto normais como estáticos) desde que **não** sejam precedidos por ```this```.

- **Exemplo**:

```java
// Exemplo de classe que conta quantos objetos foram criados

public class MinhaClasse {
    static int contador = 0;

    public MinhaClasse() {
        contador++;
    }
}
```

Mesmo que atributos estáticos possam ser manipulados através de métodos normais, o seu valor é comum a todas as instâncias, ou seja, é uma informação compartilhada por todos os objetos.

<br>

- [Exercícios](./exercicios.md)