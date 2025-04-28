# Exercícios - Sobrecarga de métodos
[<-- Voltar](./README.md)

### 1. Conversor de ângulo

Escreva uma classe que realize a conversão de ângulo entre radianos e graus ou vice-versa.

Para melhor comodidade, considere sempre tipo inteiro como grau e float como radiano.

Você deve criar uma classe ```conversor``` com apenas um método estático ```converterAngulo```.

<br>

- Assinaturas do método:

| Entrada | Saída | Descrição |
|---------|-------|-----------|
| ```int``` ang | ```float``` angConvertido | Realiza a conversão de graus para radianos. |
| ```float``` ang | ```int``` angConvertido | Realiza a conversão de radianos para graus. |

<br>

- Conversão dos ângulos:

$$ ang_{rad} = ang_{grau} \cdot \frac{\pi}{180} $$
$$ ang_{grau} = ang_{rad} \cdot \frac{180}{\pi} $$

Onde:

$ \pi = 3.14 $ ou utilizar a constante ```Math.pi```