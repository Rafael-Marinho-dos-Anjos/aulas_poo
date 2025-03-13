# Tratamento de Exceções
[<-- Voltar](../README.md)

### 1. Excessões ([Exemplo](./Exececoes.java)):

Quando ocorre algum erro durante a execução de um programa que possa interromper o funcionamento, o Java captura todas as informações sobre esse problema e as disponibiliza em um objeto que representa a situação.

Esse objeto (chamado de exceção ou erro) pode ser capturado durante a execução do programa para que não force a sua parada e, ao fazer isso, é possível disponibilizar um código alternativo para ser executado e contornar a situação de erro.

### 2. Tratando excessões ([Exemplo](./Exececoes.java)):

Para que seja possível capturar uma exceção durante a execução do programa, a porção de código que pode lançar o erro deve estar contida dentro de um bloco ```try```, seguido de um bloco de código alternativo ```catch```. Após o bloco ```catch``` pode ser adicionado um terceiro bloco ```finally``` que irá ser executado independente de haver exceção ou não.

Podem ser adicionados múltiplos blocos ```catch```, cada um para um tipo específico de exceção.

- ```try```: bloco que contém o código que poderá disparar erro durante a execução;
- ```catch```: bloco que contém o código que será executado caso ocorra algum erro no bloco ```try```;
- ```finally```: bloco que será executado independente dos anteriores, seu uso é dispensável.

**Sintaxe**:

```java
try { código_que_pode_lançar_exceção }
catch ( tipo_de_exceção nome_do_objeto_de_exceção ) { código_alternativo }
finally { código_que_sempre_será_executado } // dispensável
```

### 3. Lançando Exceções ([Exemplo](./UtilizandoExcecoes.java)):

Exceções também podem ser lançadas manualmente, para isso, é utilizada a palavra-chave ```throw```.

**Sintaxe**:

```java
throw new tipo_de_exceção( mensagem_de_erro );
```

Caso haja um ```throw``` fora de um bloco ```try```, o método que contém a linha deve indicar na sua declaração inserindo ```throws``` seguido do tipo de exceção lançada após os seus parâmetros.

Esse recurso é muito útil para interromper prematuramente rotinas que não cumprem com os pre-requisitos de funcionamento (por exemplo, quando se tenta fazer uma transferência bancária sem saldo disponível).

### 4. Utilizando Exceções lançadas manualmente para diminuir a complexidade do código ([Exemplo](./UtilizandoExcecoes.java)):

Como foi visto anteriormente, exceções podem ser lançadas de forma manual para interromper rotinas. Isso permite que as mesmas sejam capturadas em camadas externas do código utilizando o próprio objeto de excessão para retornar informações, dessa forma evitamos ter que escrever estruturas condicionais (```if``` e ```else```) mais complexas para verificar todas as condições possíveis, que fariam uma execução segura do método até o fim, e simplificamos pulando tudo isso para retornar a exceção diretamente para a camada mais externa do programa onde se encontra o ```try```.

<br>

- [Exercícios](./exercicios.md)