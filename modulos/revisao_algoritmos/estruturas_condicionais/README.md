# Estruturas Condicionais
[<-- Voltar](../README.md)

Estruturas condicionais permitem controlar o fluxo do programa, selecionando quais blocos de código executar dependendo do resultado de uma operação lógica.

### 1. IF ([exemplo](./If.java)):

A estrutura condicional ```if``` controla a decisão sobre a execução ou não de um bloco de código de acordo com uma operação lógica. Caso a operação retorne ```true```, o bloco é executado, caso retorne ```false``` não ocorre a execução do bloco.

#### Sintaxe:

```if ( condição ) { código }```

### 2. ELSE IF ([exemplo](./If.java)):

Já o ```else if``` tem o seu funcionamento condicionado pelo ```if``` (ou ```else if```) imediatamente anterior. Caso a estrutura condicional que o precede tenha o valor de sua condição interna igual a ```false``` (e não tenha sido pulada, caso seja um outro ```else if```), o seu comportamente será similar ao de um ```if``` comum, caso contrário, o bloco será pulado.

#### Sintaxe:

<code>if ( condição 1 ) { código 1 }<br>
else if ( condição 2 ) { código 2 }<br>
...<br>
else if ( condição n ) { código n }
</code>

### 3. ELSE ([exemplo](./If.java)):

Assim como o ```else if```, a execução da estrutura ```else``` é condicionada pela estrutura condicional imediatamente anterior, porém não possui uma operação lógica interna e a mesma não pode preceder nenhuma outra estrutura condicional. O bloco de código associoado à estrutura ```else``` é executado caso a condição da estrutura que o precede seja igual a ```false``` e a mesma não tenha sido pulada.

#### Sintaxe:

<code>if ( condição 1 ) { código 1 }<br>
else if ( condição 2 ) { código 2 }<br>
...<br>
else if ( condição n-1 ) { código n-1 }<br>
else { código n }
</code>

### 4. SWITCH CASE ([exemplo](./Switch.java)):

A estrutura ```switch``` avalia a igualdade de uma expressão com uma série de possíveis valores, caso uma das igualdade seja satisfeita, o seu respectivo bloco de código será executado, caso nenhuma igualdade seja satisfeita, é possível definir um bloco a ser executado nessa ocasião.

#### Sintaxe:

<code>switch( expressão ) {<br>
&nbsp;case valor_1:<br>
&nbsp;&nbsp;{ código 1 }<br>
&nbsp;&nbsp;break;<br>
&nbsp;case valor_2:<br>
&nbsp;&nbsp;{ código 2 }<br>
&nbsp;&nbsp;break;<br>
&nbsp;default:<br>
&nbsp;&nbsp;{ código executado caso nenhuma igualdade seja satisfeita }<br>
}
</code>

Note que após cada bloco de código (exceto o último) há uma quebra de execução (```break;```), caso não seja feita essa quebra todos os blocos de código seguintes serão executados.

<br>

- [Exercícios](./exercicios.md)