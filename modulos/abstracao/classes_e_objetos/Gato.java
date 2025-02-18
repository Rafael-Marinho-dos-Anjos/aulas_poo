package modulos.abstracao.classes_e_objetos;

public class Gato {
    // Atributos - Características
    String nome;
    String pelagem;
    int numPatas = 4;

    // Método construtor da classe
    public Gato (String nome, String pelagem) {
        this.nome = nome;
        this.pelagem = pelagem;
    }

    // Métodos - Comportamentos
    public void miar () {
        System.out.printf("%s diz: Miau!%n", this.nome);
    }
    
    public void comer () {
        System.out.printf("%s está se alimentando%n", this.nome);
    }
    
    public void saltar () {
        System.out.printf("%s saltou e aterrissou em seguida%n", this.nome);
    }
    
    public void andar (int velocidade) {
        if (velocidade <= 10) {
            System.out.printf("%s está se movendo%n", this.nome);
        } else {
            System.out.printf("%s está correndo%n", this.nome);
        }
    }

    public void informacoes () {
        System.out.printf("Gato -> Nome: %s   Cor: %s%n", this.nome, this.pelagem);
    }
}
