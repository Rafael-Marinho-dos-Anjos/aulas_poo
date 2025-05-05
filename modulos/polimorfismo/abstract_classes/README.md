# Classes Abstratas
[<-- Voltar](../README.md)

Classe abstrata é um tipo especial de classe que atua de forma similar a uma interface. Elas possuem a principal tarefa de promover uma padronização das classes que herdem delas, porém já podem trazer consigo atributos e métodos já escritos.

Classes abstratas não podem criar objetos, apenas as suas subclasses.

### 1. Métodos e atributos ([Exemplo]()):

É possível definir métodos e atributos normalmente numa classe abstrata e herdá-los para outras subclasses da mesma forma que foi visto no módulo de [herança](../../heranca/README.md).

- **Exemplo**:

```java
// Arquivo ClasseAbstrata.java
public abstract class ClasseAbstrata {
    public int atributoInteiro;

    public void metodo() {}
}
```

```java
// Arquivo Subclasse.java
public class Subclasse extends ClasseAbstrata {
    public void metodoQueUtilizaHeranca() {
        this.atributoInteiro = 10;
        this.metodo();
    }
}
```

### 2. Métodos Abstratos ([Exemplo]()):

Nas classes abstratas também é possível definir contratos de métodos que devem ser implementados somente na subclasse, fazemos isso por meio dos métodos abstratos.

Esses métodos obrigatoriamente devem ser sobrescritos na subclasse assim como seria feito com interface e devem ser precedidos pela palavra-chave ```abstract```.

- **Exemplo**:

```java
// Arquivo Animal.java
public abstract class Animal {
    public String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom(); // método obrigatório nas subclasses
}
```

```java
// Arquivo Cachorro.java
public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au! Au!");
    }
}
```

```java
// Arquivo Gato.java
public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau!");
    }
}
```

```java
// Arquivo Main.java
public class Main {
    public void static main(String[] args) {
        Animal animal_1 = new Cachorro("Totó");
        Animal animal_2 = new Gato("Fulano Felino");

        animal_1.emitirSom();
        animal_2.emitirSom();
    }
}
```

Saída:

```bash
Au! Au!
Miau!
```
