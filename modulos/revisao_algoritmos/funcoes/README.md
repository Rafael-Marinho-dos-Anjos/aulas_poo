# Funções
[<-- Voltar](../README.md)

### 1. O que são funções ([Exemplo](./Funcoes.java)):

Funções são chamadas para a execução de um bloco de código que realiza uma tarefa específica. Elas promovem uma melhor organização do código e evitam repetição desnecessária de diferentes linhas do código que executam a mesma tarefa, além de facilitar a manutenção futura do código escrito.

#### Sintaxe:
<code>
modificador_de_acesso tipo_de_retorno nome_da_função (sequência_de_parâmetros) {<br>
&nbsp;código<br>
&nbsp;return valor_de_retorno;<br>
}
</code>

- **Modificador de acesso**: Define quem pode acessar a função. Pode ser ```public```, ```private``` ou ```protected``` ([Módulo sobre encapsulamento](../../encapsulamento/README.md)).
- **Tipo de retorno**: Define qual o tipo de dado que a função deve retornar como resposta, caso a função não deva retornar nenhuma reposta, o seu valor deve ser ```void```.
- **Sequência de parâmetros**: A função pode receber diversos (ou nenhum) valor de entrada, essas entradas são chamadas de parâmetros e devem ser explicitadas quais entradas a função deve receber, cada uma com o seu respectivo alias (nome dado ao parâmetro dentro do bloco de código da função) precedido pelo seu tipo.

<br>

- [Exercícios](./exercicios.md)