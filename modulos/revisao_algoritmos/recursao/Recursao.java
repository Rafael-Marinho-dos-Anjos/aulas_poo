import java.util.Scanner;

public class Recursao {
    static int fatorial(int n) {
        // Situação de retorno padrão 1
        if (n < 0) {
            return 0;
        }
        // Situação de retorno padrão 2
        else if (n == 0) {
            return 1;
        }
        // Lógica: O fatorial de um número é dado pelo produto de todos
        // os inteiros positivos menores ou iguais a ele, portanto, é
        // possível calcular o fatorial de um número apenas multiplicando
        // ele mesmo pelo fatorial do seu antecessor.
        else {
            return n * fatorial(n - 1);
        }
    }

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Digite um número inteiro: ");
        int n = in.nextInt();

        System.out.print("O seu fatorial é igual a ");
        System.out.println(fatorial(n));
    }
}
