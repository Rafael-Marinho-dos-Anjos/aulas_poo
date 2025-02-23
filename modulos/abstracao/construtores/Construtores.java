
public class Construtores {
    // Atributos
    private int atributo1;
    private int atributo2;
    private int atributo3;

    // Construtor
    public Construtores(int att1, int att2, int att3) {
        // Atribuindo os valores dos parâmetros aos atributos
        this.atributo1 = att1;
        this.atributo2 = att2;
        this.atributo3 = att3;
    }

    // Método para mostrar os valores dos atributos
    public String str() {
        String repr = "Atributo 1: " + this.atributo1 + "    ";
        repr = repr + "Atributo 2: " + this.atributo2 + "    ";
        repr = repr + "Atributo 3: " + this.atributo3;

        return repr;
    }

    // main
    public static void main(String[] args) {
        // Instanciando objetos utilizando o método construtor
        Construtores obj1 = new Construtores(1, 2, 3);
        Construtores obj2 = new Construtores(4, 5, 6);

        // Mostrando os valores dos seus atributos
        System.out.println(obj1.str());
        System.out.println(obj2.str());
    }
}
