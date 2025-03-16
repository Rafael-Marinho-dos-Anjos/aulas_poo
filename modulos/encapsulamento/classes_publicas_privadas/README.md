# Classes públicas e privadas
[<-- Voltar](../README.md)

Em Java é possível criar algumas classes auxiliares que servem para uso interno de outras classes mais complexas, chamamos essas classes auxiliares de classes privadas, mas antes de entendê-las melhor, precisamos saber o que é uma classe pública.

## 1. Classes públicas ([Exemplo](./Livro.java)):

Uma classe pública é toda classe que pode ser acessada de qualquer lugar do código (visibilidade global), basta importá-la. Seu nome deve ser exatamente igual ao nome do arquivo onde há a sua implementação seguido da extensão ```.java```.

- Exemplo:

```java
// Arquivo MinhaClasse.java
public class MinhaClasse {
    // Atributos e métodos
}
```

Todas as classes que vimos até agora no curso são públicas.

## 2. Classes Privadas ([Exemplo](./Livro.java)):

São classes criadas com o único propósito de serem utilizadas dentro do escopo de uma classe pública específica, não podem ser declaradas fora de uma outra classe.

Não possuem visibilidade global, ou seja, só podem ser utilizadas dentro dos métodos da classe que a contém, por isso são comumente utilizadas para implementar detalhes internos de uma classe que não devem ser expostos.

- Exemplo:

```java
public class ClasseExterna {
    private class ClassePrivada {
        // Métodos e atributos da classe privada
    }

    // Métodos e atributos da classe externa
}
```

- **OBS**: Uma classe também pode ser implementada internamenta a outra de forma pública ou protegida, basta alterar o seu modificador de acesso para ```public``` ou ```proteceted```.
