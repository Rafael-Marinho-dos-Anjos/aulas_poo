package modulos.polimorfismo.interfaces;

public class Condutor {
    public void parar(InterfaceVeiculo veiculo) {
        while (veiculo.getVelocidade() != 0) {
            veiculo.frear();
        }
    }

    public void neutro(InterfaceVeiculo veiculo) {
        while (veiculo.getMarcha() > 0) {
            veiculo.diminuirMarcha();
        }
        if (veiculo.getMarcha() < 0) {
            veiculo.passarMarcha();
        }
    }

    public void pararSinal(InterfaceVeiculo veiculo) {
        this.parar(veiculo);
        this.neutro(veiculo);
    }

    // Dentre outros mais métodos que podem ser criados
}
