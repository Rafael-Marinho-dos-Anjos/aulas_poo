# Classes e Objetos
[<-- Voltar](../README.md)

A programação orientada a objetos se propõe a modelar entidades do mundo real de forma simplificada, destacando as características essenciais de cada indivíduo que tenham importância para o contexto da aplicação, ignorando detalhes irrelevantes ou secundários.

### 1. Classe ([Exemplo](./Gato.java)):

Classe é um modelo que define as propriedades (atributos) e comportamentos (métodos) que os indivíduos (objetos) dessa classe terão.

- **Sintaxe**:

A definição de uma classe é feita com a palavra-chave ```class``` seguindo o padrão abaixo:

```bash
modificador_de_acesso class nome_da_classe {
    atributos_e_métodos
}
```

### 2. Objeto ([Exemplo](./ClassesEObjetos.java)):

É cada indivíduo que pertence a uma classe, cada uma das suas características e comportamentos é definida pelas regras da classe, mas de forma a permitir que cada indivíduo possa ter um conjunto de características únicas.

- **Sintaxe**:

A criação de um objeto de uma classe específica é chamada de instanciação e é feita utilizando a palavra-chave ```new``` da seguinte maneira:

```bash
nome_da_classe nome_do_objeto = new nome_da_classe( parâmetros );
```

Note que podemos informar alguns parâmetros durante a criação do objeto, isso permite que façamos uma configuração inicial dos atributos, mas falaremos sobre isso melhor futuramente durante a [aula sobre métodos construtores](../construtores/README.md).

<br>

- ### **Exemplo**:

Um gato é um ser que apresenta as seguintes características:

| Característica | Descrição |
|----------------|-----------|
| Nome | Alguns gatos possuem nome dado pelo tutor |
| Quatro patas | Membros usados para andar e realizar atividades atléticas |
| Pelagem curta | Pêlos que cobrem todo o corpo e podem ser de cores diversas |
| Cauda alongada | A espinha dorsal dos gatos possui um comprimento maior que o seu dorso e gera uma protuberância chamada de cauda ou rabo que os ajuda a manter o equilíbrio |
| Tubo digestivo completo | O sistema digestivo do gato permite que ele ingira alimentos e depois os eleimine na forma de fezes |

Gatos também podem apresentar os seguintes comportamentos:

| Comportamento | Descrição |
|---------------|-----------|
| Saltar | Utilização das patas para impulsionar o corpo em uma direção específica |
| Andar ou correr | Utilização das patas em sequência para fazer com que o corpo se locomova sobre uma superfície |
| Miar | Emitir um som característico dos gatos |
| Comer | Processo de ingestão de alimentos |
| Usar a caixa de areia | Processo onde o gato se dirige à caixa de areia para se aliviar e depois usa suas patas para enterrar as fezes depositadas |
| Ronronar | Quando estão felizes, os gatos emitem um som parecido com um ronco de motor |