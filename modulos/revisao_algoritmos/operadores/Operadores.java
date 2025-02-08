package modulos.revisao_algoritmos.operadores;


public class Operadores {
    public static void main(String[] args) {
        // Operadores Aritmeticos
        int a = 4;
        int b = 3;

        // Soma
        int soma = a + b;
        System.out.printf("%d + %d = %d%n", a, b, soma);
        
        // Subtração
        int sub = a - b;
        System.out.printf("%d - %d = %d%n", a, b, sub);
        
        // Multiplicação
        int mul = a * b;
        System.out.printf("%d * %d = %d%n", a, b, mul);
        
        // Divisão
        double div = (double) a / b;
        System.out.printf("%d / %d = %.2f%n", a, b, div);
        
        // Módulo
        int mod = a % b;
        System.out.printf("%d %s %d = %d%n", a, '%', b, mod);
        
        // Pós-incremento
        int posInc = 4;
        System.out.printf("%d++ = %d --> %d%n", posInc, posInc++, posInc);
        
        // Pré-incremento
        int preInc = 4;
        System.out.printf("++%d = %d --> %d%n", preInc, ++preInc, preInc);
        
        // Pós-decremento
        int posDec = 4;
        System.out.printf("%d-- = %d --> %d%n", posDec, posDec--, posDec);
        
        // Pré-decremento
        int preDec = 4;
        System.out.printf("--%d = %d --> %d%n", preDec, --preDec, preDec);


        // Operadores Relacionais

        // Igual a
        boolean igual = a == b;
        System.out.printf("%d == %d = %b%n", a, b, igual);

        // Diferente de
        boolean diferente = a != b;
        System.out.printf("%d != %d = %b%n", a, b, diferente);

        // Maior que
        boolean maior = a > b;
        System.out.printf("%d > %d = %b%n", a, b, maior);

        // Maior ou igual a
        boolean maiorIgual = a >= b;
        System.out.printf("%d >= %d = %b%n", a, b, maiorIgual);

        // Menor que
        boolean menor = a < b;
        System.out.printf("%d < %d = %b%n", a, b, menor);

        // Menor ou igual a
        boolean menorIgual = a <= b;
        System.out.printf("%d <= %d = %b%n", a, b, menorIgual);


        // Operadores lógicos
        boolean c = true;
        boolean d = false;

        // and
        boolean and = c && d;
        System.out.printf("%b && %b = %b%n", c, d, and);

        // or
        boolean or = c || d;
        System.out.printf("%b || %b = %b%n", c, d, or);

        // not
        boolean not = !c;
        System.out.printf("!%b = %b%n", c, not);
    }
}
