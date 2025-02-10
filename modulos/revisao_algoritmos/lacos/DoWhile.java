package modulos.revisao_algoritmos.lacos;

public class DoWhile {
    static int a = 0;
    static int b = 20;
    public static void main(String[] args) {
        // Executando a mesma porção de código até que o valor ultrapasse 10
        do {
            a += 3;
        } while (a <= 10);

        System.out.println(a);

        // Mesmo loop, agora com uma variável com valor inicial que não satisfaz a condição
        do {
            b += 3;
        } while (b <= 10);

        System.out.println(b);
    }
}
