# Funções Recursivas
[<-- Voltar](../README.md)

### 1. O que são funções recursivas? ([exemplo](./Recursao.java))

São funções que internamente fazem chamada a si mesmas. Geralmente são utilizadas quando se quer implementar um procedimento onde o resultado da função para uma determinada entrada depende do resultado obtido para uma entrada diferente.

É preciso tomar cuidado ao implementar esse tipo de função, pois uma recursão mal implementada pode não convergir, assim causando um erro chamado ```StackOverflowError```.

### 2. Funcionamento ([exemplo](./Recursao.java))

Para valores de entrada que dependam do resultado com valores diferentes, a função interrompe a sua rotina e executa uma chamada a si mesma com esse outro valor, isso se repete até que uma situação de resposta padrão seja alcançada. Daí em diante, cada execução que havia sido interrompida é resumida e cada chamada da função retorna o seu respectivo valor para a anterior.

Esse processo acontece de uma forma que a última chamada feita à função será a primeira a ser finalizada, em outras palavras, uma função recursiva é uma pilha.

Como cada chamada precisa inicializar o seu próprio conjunto de variáveis internas, caso o número de chamadas feitas à função cresça indefinidamente, a memória do computador será totalmente alocada, impossibilitando a execução do cálculo até o fim. Por conta disso, o Java delimita um número limite de recursões, caso a função o exceda, o erro ```StackOverflowError``` será apresentado, assim encerrando a execução do programa.

### 3. Como realizar a implementação de uma função recursiva ([exemplo](./Recursao.java))

- **Defina uma (ou mais) situações de retorno padrão**: A recursão sempre deverá ter um escape para encerrar a execução das chamadas recursivas, geralmente se atribui um valor de resposta padrão à uma entrada específica;

- **Defina uma lógica para a chamada recursiva**: Caso a entrada não caia na situação do item anterior, defina o seu próprio retorno em função do resultado com um valor de entrada atualizado, esse novo valor deve ser obtido através do valor de entrada atual;

- **Garanta que a função sempre acabe alcançando alguma situação de retorno padrão**: Cada atualização do valor de entrada para uma nova recursão deve ser feita de forma que esse valor de entrada se aproxime cada vez mais de um que dispare um retorno padrão.

<br>

- [Exercícios](./exercicios.md)
