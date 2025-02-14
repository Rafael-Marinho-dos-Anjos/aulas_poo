package modulos.revisao_algoritmos.funcoes;

import java.util.function.Consumer;
import java.util.function.Supplier;


public class Lambda {
    public static void main(String[] args) {
        // Runnable não recebe parâmetros nem possui valor de retorno
        Runnable olaMundo = () -> { System.out.println("Olá mundo"); };

        olaMundo.run();


        // Consumer recebe um parâmetro de entrada mas não possui valor de retorno
        Consumer<Integer> print = (x) -> { System.out.printf("x é igual a %d%n", x); };
        
        print.accept(1);
        print.accept(2);
        print.accept(3);


        // Supplier não recebe parâmetros e retorna um valor
        Supplier<Double> pi = () -> { return 3.1415926; };

        System.out.println(pi.get());
    }
}
