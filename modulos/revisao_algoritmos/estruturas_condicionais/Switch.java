package modulos.revisao_algoritmos.estruturas_condicionais;

import java.util.Scanner;


public class Switch {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        // Lendo a entrada do usuário
        System.out.print("Informe um algarismo: ");
        int n = in.nextInt();
        
        switch (n) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
                break;
            case 8:
                System.out.println("Oito");
                break;
            case 9:
                System.out.println("Nove");
                break;
            default:
                System.out.println("A entrada informada não é um algarismo único.");
                break;
        }

        in.close();
    }
}
