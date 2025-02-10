package modulos.revisao_algoritmos.funcoes;

import java.util.Scanner;

public class Funcoes {
    public static double teoremaDePitagoras(double cateto1, double cateto2) {
        // Esta função recebe os valores de dois catetos e calcula o valor da hipotenusa utilizando o teorema de pitágoras
        cateto1 = Math.pow(cateto1, 2);
        cateto2 = Math.pow(cateto2, 2);

        double hipotenusa = cateto1 + cateto2;
        hipotenusa = Math.sqrt(hipotenusa);

        return hipotenusa;
    }
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite o valor do primeiro cateto: ");
        double cateto1 = in.nextDouble();

        System.out.print("Digite o valor do segundo cateto: ");
        double cateto2 = in.nextDouble();

        double hipotenusa = teoremaDePitagoras(cateto1, cateto2);

        System.out.printf("A hipotenusa mede %f", hipotenusa);
    }
}
