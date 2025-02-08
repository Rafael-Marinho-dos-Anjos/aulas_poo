# Variáveis e tipos de dados
[<-- Voltar](../README.md)

### 1. Variáveis ([exemplo](./Variaveis.java)):

São recursos utilizados para armazenar valores, podem ter os seus valores internos modificados a vontade quando necessário e permitem ser utilizados em operações que irão dar suporte à toda lógica do algoritmo.

As variáveis devem ser declaradas antes de serem utilizadas, ou seja, deve ser informado o tipo de dado que deverá ser armazenado e como que será referenciada no código. No processo de declaração é rezervado o espaço de memória necessário para armazenar o valor a depender do tipo e o seu endereço é atribuído à variável.

O processo de atribuição do primeiro valor à variável é chamado de inicialização e pode ser feito simultâneamente à declaração.

### 2. Tipos de dados ([exemplo](./Variaveis.java)):

Os tipos de dados podem ser divididos em duas categorias: os tipos primitivos e os tipos de referência.

- Tipos primitivos são aqueles que são armazenados diretamente na memória. Tem tamanho fixo e não são objetos.

| Tipo | Tamanho (bits) | Descrição | Exemplo |
|------|----------------|-----------|---------|
| byte | 8 | Inteiro pequeno (de -128 a 127) | ```byte b = 100;``` |
| short | 16 | Inteiro curto (de -32,768 a 32,767) | ```short s = 1000;``` |
| int | 32 | Inteiro padrão (de -2<sup>31</sup> a 2<sup>31</sup>-1) | ```int i = 100000;``` |
| long | 64 | Inteiro longo (de -2<sup>63</sup> a 2<sup>63</sup>-1) | ```long l = 100000L;``` |
| float | 32 | Ponto flutuante de precisão simples | ```float f = 3.14f;``` |
| double | 64 | Ponto flutuante de dupla precisão | ```double d = 3.1416;``` |
| char | 16 | Caractere unicode | ```char c = 'A';``` |
| boolean | 1 | Verdadeiro ou falso | ```boolean b = true;``` |

- Tipos de referência são aqueles que podem carregar internamente um número indefinido de variáveis.

| Tipo de Referência | Descrição | Exemplo |
|--------------------|-----------|---------|
| *Classes*        | Representam objetos definidos pelo usuário.    | ```String s = "Olá";```                |
| *Interfaces*     | Definem contratos que classes podem implementar| ```List<String> lista = new ArrayList<>();``` |
| *Arrays*         | Coleções de elementos do mesmo tipo.           | ```int[] numeros = {1, 2, 3};```       |