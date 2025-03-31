package modulos.heranca.superclasse_e_subclasse;

public class Moto extends Veiculo {
    private int numPneus;

    public Moto(String fabricante, String cor, float velMaxima) {
        super(fabricante, cor, 2, velMaxima);
        this.numPneus = 2;
    }

    public int getNumPneus() {
        return numPneus;
    }
}
