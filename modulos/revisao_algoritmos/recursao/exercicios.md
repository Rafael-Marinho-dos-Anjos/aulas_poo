# Exercícios - Operadores
[<-- Voltar](./README.md)

### 1. Sequência de Fibonacci

A sequência de Fibonacci consiste em uma sequência numérica onde cada um dos seus termos são obtidos pela soma dos dois anteriores, a excessão são os termos de posição 0 e 1. O termo 0 da sequiência é o próprio 0 e o termo 1 é o próprio 1.

A seguir é mostrada a expressão matemática da sequência de Fibonacci.

$$Fib(n)=\left\lbrace \begin{array}{lc}
    0 \text{ se } n=0, \\
    1 \text{ se } n=1, \\
    Fib(n-1) + Fib(n-2) \text{ se } n>1
    \end{array}\right.
$$

Escreva um programa que, usando recursão, leia um número inteiro ```n``` como entrada e printe no console o termo ```n``` da seguência de Fibonacci.
