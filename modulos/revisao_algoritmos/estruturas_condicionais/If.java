package modulos.revisao_algoritmos.estruturas_condicionais;

import java.util.Scanner;


public class If {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // Lendo um número inteiro
        System.out.print("Informe um número inteiro: ");
        int n = in.nextInt();

        // Verificando se o número é par
        if (n % 2 == 0) {
            System.out.println("O número é par");
        }
        // Caso não seja par, verifica se é múltiplo de 3
        else if ( n % 3 == 0 ) {
            System.out.println("O número é múltiplo de 3 e não é par");
        }
        // Caso não seja nem par e nem múltiplo de 3, verifica se é maior que 10
        else if ( n > 10 ) {
            System.out.println("O número é maior que 10, mas não é par nem múltiplo de 3");
        }
        // Caso nenhuma das condições seja satisfeita
        else {
            System.out.println("O número não é maior que 10, nem par, nem múltiplo de 3");
        }
    }
}
