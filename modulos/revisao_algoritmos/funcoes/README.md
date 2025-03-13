# Funções
[<-- Voltar](../README.md)

### 1. O que são funções ([Exemplo](./Funcoes.java)):

Funções são chamadas para a execução de um bloco de código que realiza uma tarefa específica. Elas promovem uma melhor organização do programa e evitam repetição desnecessária de diferentes linhas que executam a mesma tarefa, além de facilitar a manutenção futura do código escrito.

Cada função deve especificar qual o seu tipo de saída e de todo o conjunto dos seus parêmetro de entradas, essa especificação é chamada de assinatura da função:

#### Sintaxe:
```java
modificador_de_acesso static tipo_de_retorno nome_da_função (sequência_de_parâmetros) {
    código
    return valor_de_retorno;
}
```

- **Modificador de acesso**: Define quem pode acessar a função. Pode ser ```public```, ```private``` ou ```protected``` ([Módulo sobre encapsulamento](../../encapsulamento/README.md)).
- **Tipo de retorno**: Define qual o tipo de dado que a função deve retornar como resposta, caso a função não deva retornar nenhuma reposta, o seu valor deve ser ```void```.
- **Sequência de parâmetros**: A função pode receber diversos (ou nenhum) valor de entrada, essas entradas são chamadas de parâmetros e devem ser explicitadas quais entradas a função deve receber, cada uma com o seu respectivo alias (nome dado ao parâmetro dentro do bloco de código da função) precedido pelo seu tipo.

<br>

- [Exercícios](./exercicios.md)

<br>

- ### Extra 1. Expressões lambda ([Exemplo](./Lambda.java)):

São tipos especiais de funções que implementam funções com assinaturas já predefinidas por meio de interfaces ([aula sobre polimorfismo](../../polimorfismo/README.md)). As expressões lambda são úteis quando precisamos informar uma função como parâmetro ou até mesmo para encurtar o código.

Nativamente, o java oferece 3 interfaces padrão próprias para expressões lambda: ```Runnable```, ```Consumer``` e ```Supplier```.

- ```Runnable```: é uma interface que implementa a assinatura de um método que não recebe nenhuma entrada e nem retorna nenhum valor (expressões do tipo ```Runnable``` são amplamente utilizadas ao trabalhar com múltiplas threads);

**Sintaxe**:

```java
Runnable nome_da_expressao = () -> { código };
nome_da_expressao.run();
```

-  ```Consumer```: é uma interface que implementa a assinatura de um método que recebe uma entrada com tipo definido e não retorna nenhum valor;

**Sintaxe**:

```java
Consumer<tipo_de_entrada> nome_da_expressao = ( parametro_de_entrada ) -> { código };
nome_da_expressao.accept();
```

-  ```Supplier```: é uma interface que implementa a assinatura de um método que não recebe nenhuma entrada e retorna um valor com tipo definido.

**Sintaxe**:

```java
Supplier<tipo_de_saida> nome_da_expressao = () -> {
    código
    return valor_de_retorno;
};

nome_da_expressao.get();
```

- ### Extra 2. Expressões Lambda com assinatura customizada ([Exemplo](./LambdaCustomizado.java)):

Também é possível definir quais são os tipos de entrada e saída de uma expressão lambda, para isso, basta criar uma interface que defina a assinatura desejada para a expressão.

**Sintaxe**:

```java
interface nome_da_interface {
    tipo_de_retorno nome_do_metodo ( lista_de_parametros );
}
```