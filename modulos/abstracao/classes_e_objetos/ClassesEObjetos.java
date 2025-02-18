package modulos.abstracao.classes_e_objetos;

public class ClassesEObjetos {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Gato
        Gato pretuda = new Gato("Pretuda", "Preta");

        // Utilizando métodos
        pretuda.comer();
        pretuda.andar(5);
        pretuda.andar(15);
        pretuda.saltar();
        pretuda.miar();
        pretuda.informacoes();

        // Printzinho pra fazer um separador
        System.out.printf("%n%n%s%n%n%n", "-".repeat(50));

        // As características de um objeto não afetam as características de outro
        Gato bolota = new Gato("Bolota", "Branca");
        Gato galego = new Gato("Galego", "Laranja");

        pretuda.informacoes();
        bolota.informacoes();
        galego.informacoes();
    }
}
