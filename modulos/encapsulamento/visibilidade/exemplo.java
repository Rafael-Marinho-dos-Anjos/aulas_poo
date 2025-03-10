package modulos.encapsulamento.visibilidade;

public class exemplo {
    public static void main(String[] args) {
        Acumulador acumulador = new Acumulador();

        acumulador.acumularTexto("um");
        System.out.println(acumulador.getAcc());

        acumulador.acumularTexto("sete");
        System.out.println(acumulador.getAcc());

        acumulador.acumularTexto("cinco");
        System.out.println(acumulador.getAcc());

        acumulador.acumularTexto("tres");
        System.out.println(acumulador.getAcc());
    }
}
