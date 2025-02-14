package modulos.revisao_algoritmos.colecoes;

import java.util.function.Consumer;

public class EstruturasSimples {
    // Criando uma expressão lambda para printar o conteúdo de vetores
    static Consumer<int[]> printArray = (arr) -> {
        System.out.print("[ ");
        for (int i: arr) {
            System.out.printf("%d ", i);
        }
        System.out.println("]");
    };

    // Criando uma expressão lambda para printar o conteúdo de vetores
    static Consumer<int[][]> printMatrix = (mat) -> {
        System.out.println("[");
        for (int[] arr: mat) {
            System.out.print("    ");
            printArray.accept(arr);
        }
        System.out.println("]");
    };

    public static void main(String[] args) {
        int[] vetorVazio = new int[3];
        printArray.accept(vetorVazio);

        int[] vetorPreenchido = {10, 11, 12};
        printArray.accept(vetorPreenchido);

        // Navegando sobre os vetores
        for (int i = 0; i < vetorPreenchido.length; i++) {
            // Atribuindo os valores do vetor preenchido para o vetor vazio
            vetorVazio[i] = vetorPreenchido[i];
        }

        printArray.accept(vetorVazio);


        // Criando uma matriz vazia
        int[][] matrizVazia = new int[3][3];
        printMatrix.accept(matrizVazia);

        // Criando uma matriz preenchida
        int[][] matrizPreenchida = {
            {1, 2, 3},
            {2, 3, 4},
            {3, 4, 5}
        };
        printMatrix.accept(matrizPreenchida);

        // Navegando pelos elementos da matriz
        for (int i = 0; i < matrizPreenchida.length; i++) {
            for (int j = 0; j < matrizPreenchida[i].length; j++) {
                matrizVazia[i][j] = matrizPreenchida[i][j];
            }
        }
        printMatrix.accept(matrizVazia);
    }
}
