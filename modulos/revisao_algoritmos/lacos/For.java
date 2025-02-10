package modulos.revisao_algoritmos.lacos;

public class For {
    static int contador = 0;
    public static void main(String[] args) {
        // Executando 10 vezes um mesmo código
        for (int i = 0; i < 10; i++) {
            System.out.printf("Iteração: %d    Valor da variável de controle: %d%n", ++contador, i);
        }
    }
}
