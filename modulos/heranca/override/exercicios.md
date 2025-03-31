# Exercícios - Sobrescrita de métodos
[<-- Voltar](./README.md)

### 1. Placar

Escreva uma classe destinada a marcar o placar de um jogo. Essa classe deve possuir apenas 2 métodos: ```pontoTimeA``` e ```pontoTimeB```.

Os atributos da classe são apenas 2 do tipo inteiro: ```placarTimeA``` e ```placarTimeB```.

Sempre que algum método de ponto for invocado, o placar do respectivo time é incrementado e a pontuação atual é exibida:

- Exemplo:

```java
Placar placar = new Placar();
placar.pontoTimeA();
```

- Saída:

```bash
Placar:   Time A: 1 | Time B: 0
```

Em seguida, implemente duas outras classes que irão herdar de ```Placar```: ```PlacarBasquete``` e ```PlacarVolei```.

Na classe ```PlacarBasquete```, a pontuação será incrementada em 2 sempre que formarcado ponto.

Na classe ```PlacarVolei```, a pontuação será incrementada em 1 sempre que formarcado ponto e em seguida é verificado se o time com maior pontuação ultrapassou os 25 pontos e está com uma vantagem de pelo menos 2 pontos em relação ao adversário, se sim, é exibida uma mensagem de fim de set.

- Exemplo:

```java
Placar placar = new PlacarVolei();

for (int i = 0; i < 25; i++) {
    placar.pontoTimeA();
}
```

- Saída:

```bash
Placar:   Time A: 1 | Time B: 0
Placar:   Time A: 2 | Time B: 0
...
Placar:   Time A: 24 | Time B: 0
Placar:   Time A: 25 | Time B: 0
Fim de set, vitória do Time A
```
