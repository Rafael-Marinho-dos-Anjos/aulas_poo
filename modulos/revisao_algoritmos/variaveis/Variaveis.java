package modulos.revisao_algoritmos.variaveis;


public class Variaveis {
    public static void main(String[] args) {
        // Declaração de uma variável
        int inteiro;
        // Inicialização de uma variável (atribuindo um primeiro valor)
        // Variável inteira
        inteiro = 0;
        System.out.println("Inteiro: " + inteiro);

        // Declarando e inicializando simultaneamente
        // Variável double (64 bits)
        double decimal = 2.1;
        System.out.println("Double: " + decimal);

        // Variável float (32 bits)
        float pontoFlutuante = 2.1f;
        System.out.println("Float: " + pontoFlutuante);

        // Variável booleana
        boolean booleano = false;
        System.out.println("Booleano: " + booleano);

        // Ao tentar atribuir o valor de um tipo para uma variável de outro tipo, devemos fazer o cast
        // Ao tentar atribuir o valor de um tipo maior para um tipo menor, o cast irá arredondar se necessário
        inteiro = (int) decimal;
        System.out.println("Inteiro convertido: " + inteiro);

        // Para atribuir de um tipo menor para um maior não o cast não modifica o valor
        decimal = (double) inteiro;
        System.out.println("Double convertido: " + decimal);
    }
}