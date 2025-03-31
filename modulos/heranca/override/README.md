# Sobreposição de métodos
[<-- Voltar](../README.md)

Quando herdamos os métodos e atributos de uma superclasse, muitas vezes os comportamentos apresentados pela subclasse não são idênticos ao que se herdou, sendo assim, é possível sobrescrever os métodos que desejamos modificar.

### 1. Override ([]()):

O processo de sobrescrita de um método é chamado de ```override```, ele consiste em reescrever o método dentro da subclasse utilizando a mesma assinatura (mesmos tipos de parâmetros e retorno) que foi definida na superclasse.

É importante que a assinatura do método sobrescrito seja idêntica à assinatura informada na superclasse, caso seja diferente, não será realizado o *override* do método, mas sim um *overload* (mas isso é assunto para o [módulo de polimorfismo](../../polimorfismo/README.md)).

Uma boa prática ao fazer um *override* é marcar o método na subclasse com a anotação ```@Override```, isso melhora a legibilidade e permite que outras pessoas que irão ler o código consigam entender de forma mais rápida.

- **Sintaxe:**

Arquivo ```Superclasse.java```

```java
public class Superclasse {
    public void metodoASobrescrever(int a, int b) {
        // Código original
    }
}
```

Arquivo ```Subclasse.java```

```java
public class Subclasse extends Superclasse {
    @Override
    public void metodoASobrescrever(int a, int b) {
        // Código novo
    }
}
```

Ao utilizar o decorador ```@Override```, o Java obriga que a assinatura do método esteja correta, assim garantindo que seja feita a sobrescrita corretamente.

**OBS.:** Para a assinatura do método ser considerada idêntica, é necessário apenas que o nome do método, o tipo de retorno e os tipos dos parâmetros estejam iguais e na mesma ordem, os nomes dos parâmetros podem ser alterados livremente.

<br>

- [Exercícios](./exercicios.md)