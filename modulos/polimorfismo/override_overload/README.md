# Sobreposição e Sobrecarga de métodos
[<-- Voltar](../README.md)

Como já foi abordado no [módulo anterior](../../heranca/README.md), é possível fazer com que os métodos herdados de uma superclasse apresentem um comportamento diferente na subclasse através da sobreposição do métodos, ou ```override```.

Para isso, devemos refazer a implementação do método dentro da subclasse utilizando uma assinatura exatamente igual à que foi definida na superclasse.

Caso a assinatura seja alterada, o processo que está sendo feito é a sobrecarga do método, ou ```overload```.

### 1. Overload([Exemplo](./Calculadora.java)):

O processo de sobrecarga de um método permite que sejam preparados diversos comportamentos para um mesmo método, a depender do tipo de assinatura solicitada.

Imagine um sistema que armazene o número do CPF de diversos usuários. Seria interessante que esse sistema pudesse receber o valor do CPF tanto no formato de ```String``` (com pontos e traços) como no formato de número inteiro (sem pontos e traços). Sem utilizar a sobrecarga de método, precisaríamos definir dois métodos diferentes para receber diferentes tipos de entrada.

- Exemplo sem overload:

```java
// implementação da classe sem Overload
public class GuardaCPF {
    ...

    public static void guardarCPFInt(int cpf) {
        // código
    }

    public static void guardarCPFString(String cpf) {
        // código
    }
}
```

```java
// main
GuardaCPF.guardarCPFInt(00011122233);
GuardaCPF.guardarCPFString("000.111.222-33");
```

Utilizando a sobrecarga de método podemos aproveitar o mesmo nome para os dois métodos, assim não precisando criar diversos nomes diferentes para códigos que fazem as mesmas tarefas:

- Exemplo com overload:

```java
// implementação da classe com Overload
public class GuardaCPFOverload {
    ...

    public static void guardarCPF(int cpf) {
        // código
    }

    public static void guardarCPF(String cpf) {
        // código
    }
}
```

```java
// main
GuardaCPFOverload.guardarCPF(00011122233);
GuardaCPFOverload.guardarCPF("000.111.222-33");
```

Isso promove uma maior simplicidade para o código, permitindo utilizar nomenclaturas mais simples para os métodos e atribuindo ao próprio Java decidir automaticamente qual das diferentes implementações executar dependendo do tipo de entrada informada.

Não há um limite para o número de assinaturas diferentes que podem ser utilizadas para fazer a sobrecarga de um método, ou seja, é possível fazer com quantas assinaturas for necessário.

- **Sintaxe**:

```java
public class MinhaClasse {
    public tipo_de_retorno_1 meuMetodo(assinatura_1) {
        // código 1
    }

    public tipo_de_retorno_2 meuMetodo(assinatura_2) {
        // código 2
    }

    ...

    public tipo_de_retorno_n meuMetodo(assinatura_n) {
        // código n
    }
}
```

- OBS.: A sobrecarga de método permite definir diferentes tipos de retorno desde que os parâmetros de entrada sejam diferentes, ou seja, não é permitido fazer duas assinaturas com diferentes tipos de retorno que tenham os mesmos tipos de parâmetros de entrada.

<br>

- [Exercícios](./exercicios.md)