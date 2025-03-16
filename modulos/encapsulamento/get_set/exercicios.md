# Exercícios - Getters e Setters
[<-- Voltar](./README.md)

### 1. Pedidos

Faça uma classe ```Pedido``` e uma classe ```Item``` para um aplicativo de entrega de lanches.

A classe ```Item``` deve conter um atributo ```nome``` do tipo ```String```,  um atributo ```descrição``` do tipo ```String``` e um atributo ```valor``` do tipo ```Double```. Cada um dos atributos deve ser privado e possuir um método getter e um método setter.

A classe ```Pedido``` deve possuir um atributo ```nomeCliente``` do tipo ```String```, um atributo ```contato``` do tipo ```String``` e um atributo ```endereco``` do tipo ```String```, todos privados com getter e setter.

A classe ```Pedido``` deve conter também um outro atributo privado ```itens``` do tipo ```LinkedList``` para armazenar objetos da classe ```Item```. A manipulação desse atributo é feita por intermédio de 3 métodos:

- ```adicionarItem```: Recebe um objeto da classe ```Item``` e o adiciona à lista encadeada ```itens```;
- ```limparItens```: Retira todos os objetos armazenados na lista encadeada ```itens```;
- ```getItens```: método getter.

<br>

- **OBS**.: Fazendo uma pequena alteração no método ```adicionarItem``` é possível resolver essa questão transformando a classe ```Item``` numa classe privada.
