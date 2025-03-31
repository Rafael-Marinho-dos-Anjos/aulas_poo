package modulos.heranca.superclasse_e_subclasse;

public class Veiculo {
    private int numPassageiros;
    private String fabricante;
    private String cor;
    private float velMaxima;

    public Veiculo(String fabricante, String cor, int numPassageiros, float velMaxima) {
        this.fabricante = fabricante;
        this.cor = cor;
        this.numPassageiros = numPassageiros;
        this.velMaxima = velMaxima;
    }

    private String calcularTempo(float dist) {
        // dist = distância em km
        float tempo = dist / this.velMaxima;
        int horas = (int) tempo;
        int min = (int) ((tempo % 1) * 60);
        int seg = (int) (((tempo * 60) % 1) * 60);
        
        return String.valueOf(horas) + ":" + String.valueOf(min) + ":" + String.valueOf(seg);
    }

    public void viajar(float dist) {
        String tempo = calcularTempo(dist);
        System.out.printf("Viagem iniciada com distância de %.2f km. Tempo mínimo: %S%n", dist, tempo);
    }

    public void buzinar() {
        System.out.println("Biiii! Biiii!");
    }

    // Getters e Setters
    public String getFabricante() {
        return fabricante;
    }
    public int getNumPassageiros() {
        return numPassageiros;
    }
    public float getVelMaxima() {
        return velMaxima;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
}
