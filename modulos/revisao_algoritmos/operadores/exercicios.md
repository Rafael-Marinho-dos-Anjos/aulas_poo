# Exercícios - Operadores
[<-- Voltar](./README.md)

### 1. Resistências em paralelo

Em circuitos eletrônicos podemos associar o valor de duas resistências em paralelo (quando os dois condutores de ambos os resistores estão conectados).

![Resistências em paralelo](./imagens/resistencias.png)

Podemos calcular o valor da resistência equivalente à associação em paralelo de dois resistores Ra e Rb pela equação:

$$R_{eq} = \left( \frac{1}{R_a} + \frac{1}{R_b} \right)^{-1}$$

Também podemos resumir o cálculo a:

$$R_{eq} = \frac{R_a \cdot R_b}{R_a + R_b}$$

Escreva um programa que, armazene o valor das resistências em duas variáveis do tipo double ```a``` e ```b```, sem seguida, calcule o valor da resistência em paralelo, armazene em uma terceira variável (também do tipo double) ```req``` e printe o resultado no console.

### 2. IMC

Escreva um programa que, armazene os valores de altura e massa em duas variáveis do tipo double ```alt``` e ```mas``` respectivamente, calcule e armazene o valor do IMC na variável ```imc``` (também do tipo double) utilizando a equação:

$$IMC = \frac{massa(kg)}{altura(m)^2}$$

Em seguida, verifique a qual classificação pertence o valor de acordo com a tabela abaixo e printe o resultado no console.

| IMC | Classificação |
|-----|---------------|
| Menor que 18,5	| Magreza   |
| Entre 18,5 e 24,9	| Normal    |
| Entre 25,0 e 29,9	| Sobrepeso |
| Entre 30,0 e 39,9	| Obesidade |
| Maior que 40,0	| Obesidade Grave   |