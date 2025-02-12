# Operadores
[<-- Voltar](../README.md)

Os operadores são símbolos especiais que são utilizados para realizar operações específicas envolvendo variáveis, podem ser divididos em três tipos:

### 1. Operadores Aritméticos ([exemplo](./Operadores.java))
Realizam cálculos matemáticos básicos.

| Operador | Descrição | Exemplo |
|----------|-----------|---------|
| ```+``` | Soma | ```int soma = 1 + 1;``` |
| ```-``` | Subtração | ```int diferenca = 2 - 1;``` |
| ```*``` | Multiplicação | ```int produto = 3 * 2;``` |
| ```/``` | Divisão | ```double razao = 10.0 / 2;``` |
| ```%``` | Módulo | ```int resto = 10 % 3;``` |
| ```++``` | Incremento | ```x++;``` (pós-incremento)<br>```++x;``` (pré-incremento) |
| ```--``` | Decremento | ```x--;``` (pós-decremento)<br>```--x;``` (pré-decremento) |

### 2. Operadores Relacionais ([exemplo](./Operadores.java))
Comparam dois valores e retornam um booleano.

| Operador | Descrição | Exemplo |
|----------|-----------|---------|
| ```==``` | Igual a | ```5 == 5``` &rarr; true |
| ```!=``` | Diferente de | ```5 != 3``` &rarr; true |
| ```>``` | Maior que | ```5 > 3``` &rarr; true |
| ```<``` | Menor que | ```5 < 3``` &rarr; false |
| ```>=``` | Maior ou igual a | ```5 >= 5``` &rarr; true |
| ```<=``` | Menor ou igual a | ```5 <= 3``` &rarr; false |

### 3. Operadores Lógicos ([exemplo](./Operadores.java))
Combinam expressões ou valores booleanos e retornam um booleano.

| Operador | Descrição | Exemplo |
|----------|-----------|---------|
| ```&&``` | E lógico (and) | ```true && false``` &rarr; false |
| ```\|\|``` | OU lógico (or) | ```true \|\| false``` &rarr; true |
| ```!``` | NÃO lógico (not) | ```!true``` &rarr; false |

- #### Tabela verdade AND

| A | B | Saída |
|---|---|-------|
| ```true``` | ```true``` | ```true``` |
| ```true``` | ```false``` | ```false``` |
| ```false``` | ```true``` | ```false``` |
| ```false``` | ```false``` | ```false``` |

- #### Tabela verdade OR

| A | B | Saída |
|---|---|-------|
| ```true``` | ```true``` | ```true``` |
| ```true``` | ```false``` | ```true``` |
| ```false``` | ```true``` | ```true``` |
| ```false``` | ```false``` | ```false``` |

- #### Tabela verdade NOT

| A | Saída |
|---|-------|
|```true``` | ```false``` |
|```false``` | ```true``` |

<br>

- [Exercícios](./exercicios.md)
