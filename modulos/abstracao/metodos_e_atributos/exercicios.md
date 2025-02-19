# Exercícios - Métodos e Atributos
[<-- Voltar](./README.md)

### 1. Carro

A sua equipe está elaborando um simulador de corrida e você ficou responsável por implementar a classe de carros. Nas tabelas a seguir são exibidos todos os atributos e métodos que um carro deve conter no simulador:

- **Atributos**:

| Atributo | Tipo | Limites | Descrição |
|----------|------|---------|-----------|
| Massa | ```double``` | 1000.0 a 50,000.0 | Massa total do veículo sem passageiros em kg |
| Potência | ```double``` | 10.0 a 500.0 | Potência do motor em CV |
| Velocidade | ```double``` | -50.0 a 200.0 | Velocidade do veículo em km/h |
| Ângulo | ```int``` | -45 a 45 | Ângulo dos pneus dianteiros em graus |
| Marcha Ré | ```boolean``` | ```true``` ou ```false``` | Flag indicando se o carro está em marcha ré |

- **Métodos**:

| Método | Parâmetros | Retorno | Descrição |
|--------|------------|---------|-----------|
| Acelerar | Nenhum | Nenhum | Altera a velocidade de acordo com o coeficiente de aceleração, se o parâmetro de marcha ré for verdadeiro a aceleração é subtraída da velocidade atual, se for falso, é adicionada |
| Frear | Nenhum | Nenhum | Altera a velocidade de acordo com o coeficiente de frenagem, se a velocidade for negativa, a frenagem é adicionada ao valor, caso seja positiva, a frenagem é subtraída. Caso ao fim do processo o sinal da velocidade for invertido, a mesma tem o seu valor zerado |
| Girar volante | ```int``` giroVolante | Nenhum | Um quarto do valor de giro do volante é adicionado ao ângulo dos pneus |
| Mudar marcha | Nenhum | Nenhum | Altera o valor da flag de marcha ré se e somente se a velocidade atual do carro for igual a zero |

- **Coeficiente de aceleração**: Define o passo de aceleração do carro em função da massa e da potência.

$$Acc_{coef} = \frac{1}{3,6}\cdot\sqrt{2\cdot\frac{735.5 \cdot potência}{massa}}$$

- **Coeficiente de frenagem**: Define o passo de desaceleração do carro em função da massa.

$$Fren_{coef} = 0.002 \cdot massa$$

Cada atributo deve ser privado e os métodos devem ser públicos, os métodos getters também devem ser implementados, mas os setters não.

Lembre-se de respeitar os limites dos valores de cada atributo quando implementar cada método.

Não se preocupe em implementar o método construtor agora, faremos isso no exercício do conteúdo a seguir.