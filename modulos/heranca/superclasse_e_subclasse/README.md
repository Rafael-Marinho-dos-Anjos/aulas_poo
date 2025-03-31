# Superclasse e subclasse
[<-- Voltar](../README.md)

Na programação orientada a objetos é possível reaproveitar a implementação de uma classe inteira em outra que seja uma extensão dos seus conceitos.

À classe original que possui toda a sua implementação de forma explícita é dado o nome de *superclasse*, à classe que irá aproveitar (herdar) a implementação já feita na superclasse é dado o nome de *subclasse*.

### 1. Superclasse ([Exemplo](./Veiculo.java)):

Todas as classes que vimos até agora na disciplina são superclasses em potencial, basta que outra classe herde a implementação que foi feita.

A implementação de uma superclasse não difere em nada do que já vimos até agora.

- **Sintaxe:**

```java
public class Superclasse {
    // Métodos e atributos
}
```

### 2. Subclasse ([Exemplo 1](./Carro.java), [Exemplo 2](./Moto.java)):

Uma subclasse é uma classe que herda os métodos e atributos de outra, ou seja, tudo o que foi implementado na superclasse, a subclasse também irá conter.

Desde que não sejam modificados, todos os métodos e atributos herdados irão ter o mesmo comportamento que foi definido pela superclasse.

A implementação da subclasse é similar à da superclasse, exceto pelo fato de que a mesma deve indicar de qual superclasse está herdando através da palavra-chave ```extends```.

- **Sintaxe:**

```java
public class Subclasse extends Superclasse {
    // Métodos e atributos
}
```

Quando é necessário invocar algum método ou acessar algum atributo da superclasse, é possível fazê-lo através da palavra-chave ```super```.

```java
public class Subclasse extends Superclasse {
    public void metodo2() {
        // Método da subclasse que utiliza outro método da superclasse internamente
        super.metodo1();
    }
}
```

### 3. Exemplo:

Considere uma classe que implementa o comportamento e as características de uma ave genérica.

```java
public class Ave {
    private String corPenas;
    private float envergadura;

    public Ave(String cor, float tamanho) {
        this.corPenas = cor;
        this.envergadura = tamanho;
    }

    public void voar() {
        System.out.println("O pássaro está voando");
    }
}
```

Agora imagine um papagaio, ele consegue fazer tudo o que uma ave pode fazer, mas também pode aprender palavras e falar.

```java
import java.util.LinkedList;

public class Papagaio extends Ave {
    private LinkedList<String> repertorio;

    public Papagaio(float envergadura) {
        // Como papagaios são verdes, só precisamos saber do tamanho para instanciá-los
        // Reutilizamos o método construtor da superclasse
        super("Verde", envergadura);

        this.repertorio = new LinkedList<>();
    }

    public void aprenderPalavra(String palavra) {
        this.repertorio.add(palavra);
    }

    public void falar() {
        for (String palavra: this.repertorio){
            System.out.println(palavra);
        }
    }
}
```

Ao utilizar a classe ```Papagaio``` todos os métodos e atributos que foram implementados na classe ```Ave``` também estarão disponíveis:

```java
public static void main(String[] args) {
    Papagaio papagaio = new Papagaio(0.2f);
    papagaio.aprenderPalavra("Lôro!");
    papagaio.voar();
    papagaio.falar();
}
```

Saída:

```bash
O pássaro está voando
Lôro!
```

<br>

- [Exercícios](./exercicios.md)