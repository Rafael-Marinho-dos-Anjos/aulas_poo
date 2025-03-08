# Exercícios - Métodos e Atributos estáticos
[<-- Voltar](./README.md)

### 1. Calculadora trigonométrica

Implemente uma calculadora que realiza apenas cálculos de funções trigonométricas (seno, cosseno, tangente, cotangente, secante e cossecante).

A calculadora deve possuir um atributo estático de configuração booleano ```modoGraus```, que quando for verdadeiro deverá converter o ângulo de entrada de graus para radianos de acordo com a equação abaixo no início de cada cálculo:

$$ang_{rad} = \frac{pi \cdot ang_{graus}}{180}$$

Utilize o valor de pi encontrado na constante ```Math.PI```.

Todos os métodos da classe ```CalculadoraTrigonometrica```, sem excessão, devem ser estáticos.

- Métodos:

| Nome | Parâmetro de Entrada | Tipo de retorno | Como calcular |
|------|----------------------|-----------------|---------------|
| Seno | ângulo, tipo: ```double``` | ```double``` | Utilizar ```Math.sin``` |
| Cosseno | ângulo, tipo: ```double``` | ```double``` | Utilizar ```Math.cos``` |
| Tangente | ângulo, tipo: ```double``` | ```double``` | Utilizar ```Math.tan``` |
| Cotangente | ângulo, tipo: ```double``` | ```double``` | $$cotg(\theta) = \frac{1}{tan(\theta)}$$ |
| Secante | ângulo, tipo: ```double``` | ```double``` | $$sec(\theta) = \frac{1}{cos(\theta)}$$ |
| Cossecante | ângulo, tipo: ```double``` | ```double``` | $$cosec(\theta) = \frac{1}{sin(\theta)}$$ |
| AlterarModo | ativarGraus, tipo: ```boolean``` | Nenhum | Atribuir o valor do parâmetro ```AtivarGraus``` para o atributo estático ```modoGraus``` |