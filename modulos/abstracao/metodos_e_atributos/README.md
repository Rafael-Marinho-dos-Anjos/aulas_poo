# Métodos e Atributos
[<-- Voltar](../README.md)

### 1. Atributos ([Exemplo](./Conta.java)):

Atributos são características apresentadas pelas classes ou objetos, são variáveis internas que podem ser acessadas (diretamente caso sejam públicas ou através de métodos específicos caso sejam privadas) quando necessário.

Cada objeto instanciado vai possuir o seu próprio conjunto de atributos independente, ou seja, mesmo que sejam instanciados e/ou manipulados outros objetos da mesma classe, suas variáveis internas não serão afetadas.

- **Sintaxe**:

```bash
modificador_de_acesso class nome_da_classe {
    // Atributo
    modificador_de_acesso tipo_da_variável nome_da_variável;
}
```

### 2. Métodos ([Exemplo](./Conta.java)):

São funções internas da classe ou objeto. Métodos de instância (objeto) podem interagir diretamente tanto com os atributos do objeto como com os atributos da classe enquanto métodos de classe podem interagir somente com os atributos da classe.

Os métodos implementam os comportamentos que as instâncias devem apresentar, ou seja, a abstração converte toda ação que uma entidade pode fazer em um método.

- **Sintaxe**:

```bash
modificador_de_acesso class nome_da_classe {
    // Método
    modificador_de_acesso tipo_de_retorno nome_do_método ( parâmetros ) {
        código
        return variável_de_retorno
    }
}
```

A forma de acesso aos atributos das instâncias dentro de um método é feito através da palavra-chave ```this``` seguido de ponto e o nome do atributo, feito isso, a interação acontece como uma variável comum:

```bash
// Acessando um atributo e atribuindo um novo valor
this.nome_do_atributo = novo_valor;
```

### 3. Getters e Setters ([Exemplo](./ContaGetSet.java)):

Na linguagem Java é comum que os atributos das instâncias sejam acessados fora do escopo da classe de forma indireta com a utilização de métodos.

Essa prática permite incluir restrições que vão garantir a integridade dos dados ao acessar os atributos de um objeto.

- [**Exemplo**](./Exemplo.java):

```bash
// Acessando valor de um atributo de forma direta
valor = objeto.atributo;
// Acessando valor de um atributo através de um método
valor = objeto.getAtributo();

// Definindo valor de atributo de forma direta
objeto.atributo = valor;
// Definindo valor de atributo através de um método
objeto.setAtributo(valor);
```

- **Getters**:

Métodos getters retornam o valor de um atributo, normalmente seu nome é iniciado por "get" seguido do nome do atributo a ter seu valor retornado iniciado com letra maiúscula e não recebem nenhum parâmetro de entrada:

```bash
public class MinhaClasse {
    // Definindo um atributo de instância 'contador' do tipo inteiro
    private int contador;

    // Método getter do contador
    public int getContador () {
        return this.contador;
    }
}
```

- **Setters**:

Métodos setters atribuem um novo valor a um atributo, normalmente seu nome é iniciado por "set" seguido do nome do atributo a ter seu valor retornado iniciado com letra maiúscula e recebem um parâmetro de entrada do mesmo tipo que o atributo setado:

```bash
public class MinhaClasse {
    // Definindo um atributo de instância 'contador' do tipo inteiro
    private int contador;

    // Método setter do contador
    public void setContador (int novoValor) {
        this.contador = novoValor;
    }
}
```

<br>

- [Exercícios](./exercicios.md)