# Laços de Repetição
[<-- Voltar](../README.md)

Laços de repetição são estruturas que permitem a execução de uma porção de código várias vezes. O número de vezes que o bloco de código será executado irá depender de uma condição.

Existem diferentes tipos de estruturas de repetição, aseguir veremos cada uma delas.

### 1. For ([Exemplo](./For.java)):

É a estrutura de repetição mais utilizada, ela se baseia na manipulação do valor de uma variável (na maioria dos casos inteira) e executa o código até que uma condição seja satisfeita. Geralmente é utilizado quando se sabe exatamente quantas vezes queremos executar o código.

#### Sintaxe:

```for (inicialização; condição; incremento) { código }```

- Inicialização: 
Passo onde se inicializa a variável de controle do loop. Geralmente é uma variável inteira que atua como contador.

- Condição:
É uma expressão lógica que é verificada antes de cada iteração (nome dado a cada uma das execuções do laço), caso seu retorno seja ```true```, o bloco de código é executado, caso seja ```false``` o laço é interrompido.

- Incremento:
É onde ocorre a atualização do valor da variável de controle, a manipulação do valor da variável de controle pode ser feita dentro do bloco de código, mas essa não é uma prática comum.

### 2. While ([Exemplo](./While.java)):

A estrutura ```while``` é utilizada quando o bloco de código deve ser executado repetidamente enquanto uma expressão lógica seja verdadeira.

O seu uso deve ser feito com cuidado, pois facilmente pode ser gerado um loop infinito, ou seja, um laço de repetição que é executado indefinidamente.

Para se certificar de que não ocorrerá um loop infinito, deve ser utilizada uma condição simples em função de uma variável (ou variáveis) de controle que tenha o seu valor atualizado internamente ao bloco de código executado.

#### Sintaxe:

```while (condição) { código }```

### 3. Do-while ([Exemplo](./DoWhile.java)):

É semelhante ao ```while```, a diferença é que a sua verificação ocorre após a execução do loop, sendo assim, o bloco é executado ao menos uma vez.

#### Sintaxe:

```do { código } while (condição);```

### 4. ForEach ([Exemplo](./ForEach.java)):

Essa estrutura de repetição executa a sua iteração sobre os elementos de um ```array``` ([Aula sobre coleções de dados](../colecoes/README.md)). No ```foreach``` não há uma condição de parada, o bloco de código é executado uma vez para cada valor existente no array.

#### Sintaxe:
```for (tipo variável : array) { código }```

<br>

- [Exercícios](./exercicios.md)