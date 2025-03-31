package modulos.heranca.superclasse_e_subclasse;

public class Carro extends Veiculo {
    private int numPneus;

    public Carro(String fabricante, String cor, float velMaxima) {
        super(fabricante, cor, 5, velMaxima);
        this.numPneus = 4;
    }

    public int getNumPneus() {
        return numPneus;
    }
}
