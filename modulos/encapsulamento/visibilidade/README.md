# Atributos e Métodos Públicos, Protegidos e Privados
[<-- Voltar](../README.md)

Ao implementar uma classe podemos definir quais atributos e métodos podem ser acessados livremente (públicos) e quais devem ser utilizados apenas pela própria classe de forma interna (privados). Isso garante que toda interação com processos ou informações que exijam cuidado seja feita obedecendo as regras impostas pela própria classe, assim evitando possíveis inconsistências.

### 1. Métodos e atributos públicos (Exemplo [implementação](./Acumulador.java), [uso](./exemplo.java)):

Podem ser acessados livremente através do próprio objeto da classe, para acessar basta utilizar o objeto seguido de ponto e o nome do método ou atributo público:

```java
MinhaClasse meuObjeto = new MinhaClasse();

meuObjeto.atributoPublico = novoValor;
meuObjeto.metodoPublico();
```

A declaração de métodos e atributos públicos deve ser precedida pela palavra-chave ```public```:

```java
class MinhaClasse {
    // Atributo público do tipo inteiro
    public int atributoPublico;

    // Método público sem retorno
    public void metodoPublico() {
        código
    }
}
```

### 2. Métodos e atributos privados (Exemplo [implementação](./Acumulador.java), [uso](./exemplo.java)):

Não podem ser acessados de nenhuma outra forma senão pelos métodos da própria classe. A sua declaração deve ser precedida pela palavra-chave ```private```:

```java
class MinhaClasse {
    // Atributo privado do tipo inteiro
    private int atributoPrivado = 0;

    // Método público para incrementar valor do atributo privado
    public void incrementarAtributo() {
        atributoPrivado++;
    }
}
```

Geralmente privamos métodos e atributos que não devem ser utilizados livremente pois seu uso indevido pode gerar algum tipo de inconsistência. Por exemplo, o saldo de uma conta bancária para ser alterado deve passar por uma série de verificações de segurança, portanto deve ser privado e não público.

### 3. Métodos e atributos protegidos:

Métodos e atributos protegidos são similares a métodos privados com a diferença que podem ser acessados por subclasses que herdem da classe que os implementa ([Módulo sobre herança](../../heranca/README.md)). A sua declaração deve ser precedida pela palavra-chave ```protected```:

```java
class MinhaSuperclasse {
    protected int atributoProtegido = 0;
}

class MinhaSubclasse extends MinhaSuperclasse {
    public void incrementarAtributo() {
        atributoProtegido++;
    }
}
```

<br>

- [Exercícios](./exercicios.md)