package modulos.polimorfismo.interfaces;

public interface InterfaceVeiculo {
    public void acelerar();
    public void frear();
    public void passarMarcha();
    public void diminuirMarcha();
    public void virarDireita();
    public void virarEsquerda();

    public int getMarcha();
    public float getVelocidade();
}
