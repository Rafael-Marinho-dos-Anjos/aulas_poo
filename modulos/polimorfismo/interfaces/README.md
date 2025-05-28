# Interfaces
[<-- Voltar](../README.md)

### 1. Interfaces ([Exemplo](./InterfaceVeiculo.java)):

Uma interface é um contrato que define o que uma classe deve fazer, mas sem dizer explicitamente como deve ser feito.

Na interface são definidas apenas as assinaturas dos métodos com nome, parâmetros de entrada e tipo de retorno.

As classes que a implementarem tem como obrigação escrever o código para cada uma das assinaturas definidas na interface.

- Vantagens de se utilizar interfaces:

1. Organização: A interface separa "o que fazer" de "como fazer";
2. Manutenção: Podemos alterar livremente a implementação das classes sem impactar em quem as usa;
3. Padrozinação: Garantimos que diferentes classes implementem o mesmo conjunto de métodos;
4. Polimorfismo: Permitimos o tratamento de diferentes tipos de objetos de forma genérica.

- Exemplo:

Imagine um controle remoto qualquer, pode ser um controle de uma televisão, de um aparelho de som ou de um DVD player. Independente de que tipo de controle remoto seja, há um conjunto de funções que ele irá possuir:

| Função | Descrição |
|--------|-----------|
| Ligar | Liga o aparelho |
| Desligar | Desliga o aparelho |
| Aumentar o volume | Aumenta o volume do áudio |
| Diminuir o volume | Diminuir o volume do áudio |
| Avançar | Troca o canal da TV, passa a música no aparelho de som ou avança o vídeo no DVD player |
| Retroceder | Troca o canal da TV, volta a música no aparelho de som ou volta o vídeo no DVD player |

Criando uma interface para controle remoto, é possível definir que toda classe para ser considerada um controle remoto deverá possuir esse conjunto de métodos:

```java
public interface InterfaceControleRemoto {
    public void ligar();
    public void desligar();
    public void aumentar();
    public void diminuir();
    public void avançar();
    public void retroceder();
}
```

Ao criar uma classe de controle remoto, devemos criar todos os métodos definidos pela classe que ela implementa:

```java
public class ControleTV implements InterfaceControleRemoto {
    public void ligar() {
        // código
    }

    public void desligar() {
        // código
    }

    public void aumentar() {
        // código
    }

    public void diminuir() {
        // código
    }

    public void avançar() {
        // código
    }

    public void retroceder() {
        // código
    }
}
```

### 2. Polimorfismo com interfaces([Exemplo](./Condutor.java)):

#### 2.1. Versatilidade de parâmetros:

Como a interface garante que toda classe que a implemente possua obrigatoriamente um conjunto conhecido de métodos, é possível criar métodos que utilizem objetos de qualquer classe que implemente uma interface conhecida.

- Exemplo:

Considere que as classes ```ControleTV```, ```ControleSom``` e ```ControleDVD``` implementam a interface ```InterfaceControleRemoto```.

Como sabemos que existem métodos que todas obrigatoriamente vão possuir, podemos criar assinaturas para métodos utilizando a interface, dessa forma, podemos passar objetos de qualquer uma das 3 classes desde que internamente ao método seja utilizado apenas o que foi definido pela interface:

```java
// Método que liga o aparelho e aumenta o volume 10 vezes
public void ligarVolumeDez(InterfaceControleRemoto controle) {
    controle.ligar();

    for (int i = 0; i < 10; i++) {
        controle.aumentar();
    }
}
```

```java
// main
ControleTV controle_1 = new ControleTV();
ControleSom controle_2 = new ControleSom();
ControleDVD controle_3 = new ControleDVD();

// Qualquer um dos controles é aceito pelo método
ligarVolumeDez(controle_1);
ligarVolumeDez(controle_2);
ligarVolumeDez(controle_3);
```

#### 2.2. Criação de instâncias:

A instanciação dos objetos no exemplo anterior também poderia ter sido feita da seguinte forma:

```java
InterfaceControleRemoto controle_1 = new ControleTV();
InterfaceControleRemoto controle_2 = new ControleSom();
InterfaceControleRemoto controle_3 = new ControleDVD();
```

Isso pois o Java entende que se uma classe herda de uma superclasse ou implementa uma interface, podemos considerar que ela é do tipo da superclasse ou do tipo da interface, por exemplo:

```bash
Podemos afirmar que labrador, pitbull, pinscher ou pastor alemão são cachorros.
```

Mas é importante lembrar que o inverso não é necessariamente verdade:

```bash
Nem todo cachorro é um labrador;
Nem todo cachorro é um pitbull;
Nem todo cachorro é um pinscher;
Nem todo cachorro é um pastor alemão.
```

Ou seja, não é possível criar instâncias da seguinte forma:

```java
// ISSO NÃO FUNCIONA
ControleTV controle_1 = new InterfaceControleRemoto();
```

OBS.: Isso é válido tanto para interfaces como para superclasses.

<br>

- [Exercícios](./exercicios.md)
