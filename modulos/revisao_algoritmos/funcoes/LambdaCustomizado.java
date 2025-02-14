package modulos.revisao_algoritmos.funcoes;


// Definindo uma interface que implementa uma expressão que recebe
// dois números inteiros como entrada e retorna outro inteiro
interface InterfaceLambda {
    int executar(int a, int b);
}


public class LambdaCustomizado {
    public static void main(String[] args) {
        // Implementando uma expressão lambda com a interface criada
        InterfaceLambda potencia = (a, b) -> {
            int res = 1;
    
            for (int i = 0; i < b; i++) {
                res = res * a;
            }
    
            return res;
        };

        System.out.println(potencia.executar(3, 2));
        System.out.println(potencia.executar(2, 5));
        System.out.println(potencia.executar(5, 3));
    }    
}
