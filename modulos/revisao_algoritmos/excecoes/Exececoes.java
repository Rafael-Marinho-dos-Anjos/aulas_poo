package modulos.revisao_algoritmos.excecoes;

public class Exececoes {
    static int recursaoInfinita(){
        return recursaoInfinita();
    }
    public static void main(String[] args) {
        int [] arr = {1, 2, 3};

        // Tentando acessar um item em uma posição inexistente do array
        try {
            int quintoElemento = arr[4];

            System.out.println("Quinto elemento do array acessado com sucesso");
        }
        // O bloco catch é executado caso ocorra algum erro durante a execução
        // do bloco de código try
        catch (ArrayIndexOutOfBoundsException e) { // também poderia ser utilizado (Eception e)
            System.out.println("Erro ao acessar o quinto elemento do array");
        }
        // O bloco finally sempre é executado independente de ter acontecido um
        // erro na execução ou não
        finally {
            System.out.println("Esse código sempre é executado");
        }


        // Problemas mais sérios como alta profundidade na recursão são classificados
        // como Error e não como Exception
        try {
            recursaoInfinita();
        } catch (StackOverflowError e) { // também poderia ser utilizado (Error e)
            System.out.println("A execução da função recursiva foi interrompida");
        }
    }
}
