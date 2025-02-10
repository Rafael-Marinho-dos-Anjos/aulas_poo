package modulos.revisao_algoritmos.lacos;

public class While {
    static int a = 0;
    public static void main(String[] args) {
        // Executando a mesma porção de código até que o valor ultrapasse 10
        while (a <= 10) {
            a += 3;
        }

        System.out.println(a);
    }
}
