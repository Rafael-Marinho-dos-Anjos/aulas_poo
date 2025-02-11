# Exercícios - Funções
[<-- Voltar](./README.md)

### 1. Fatorial

O fatorial de um número é dado pela multiplicação dele mesmo e todos os números inteiros maiores que 1 e o próprio número. Caso o número seja 0, o seu fatorial é igual a 1, caso seja negativo, o seu fatorial é 0.

A expressão matemática da função fatorial é mostrada a seguir:

$$n!=\left\lbrace \begin{array}{lc}
    0 \text{ se } n<0, \\
    1 \text{ se } n=0, \\
    \prod_{i=1}^{n} \text{ se } n>0
    \end{array}\right.
$$

Escreva um programa que receba três números inteiros como entrada e, para cada uma das entradas, printe o seu fatorial no console. Faça o código com o mínimo de linhas possível.

### 2. Somatório

A função de somatório é dada pela soma de todos os números inteiros compreendido entre um valor inicial e um final (inclusive) aplicadas em uma expressão interna.

A expressão matemática de um somatório é mostrada a seguir:

$$somatorio(a, b) = \sum_{n=a}^{b}func(n)$$

Escreva um programa que receba dois números inteiros ```a``` e ```b``` como entrada e printe no console o resultado do somatório abaixo:

$$somatorio(a, b) = \sum_{n=a}^{b}\frac{1}{2^n}$$