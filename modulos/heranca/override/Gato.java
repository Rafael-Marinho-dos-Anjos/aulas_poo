package modulos.heranca.override;

public class Gato extends Animal {
    @Override
    public void correr(float velocidade) {
        // Alterando a palavra "animal" para "gato" no texto
        System.out.printf("O gato está correndo a %.2f km/h%n", velocidade);
    }
}
