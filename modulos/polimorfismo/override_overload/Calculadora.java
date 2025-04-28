package modulos.polimorfismo.override_overload;

public class Calculadora {
    // Soma
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static float somar(int a, float b) {
        return a + b;
    }

    public static float somar(float a, int b) {
        return a + b;
    }

    // Multiplicação
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static float multiplicar(float a, int b) {
        return a * b;
    }

    public static float multiplicar(int a, float b) {
        return a * b;
    }

    public static float multiplicar(float a, float b) {
        return a * b;
    }
}
