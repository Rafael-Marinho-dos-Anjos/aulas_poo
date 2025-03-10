package modulos.encapsulamento.visibilidade;

public class Acumulador {
    private int acc = 0;

    private void acumularInteiro(int num) {
        this.acc += num;
    }

    public void acumularTexto(String num) {
        switch (num) {
            case "um":
                acumularInteiro(1);
                break;

            case "dois":
                acumularInteiro(2);
                break;

            case "tres":
                acumularInteiro(3);
                break;

            case "quatro":
                acumularInteiro(4);
                break;

            case "cinco":
                acumularInteiro(5);
                break;

            case "seis":
                acumularInteiro(6);
                break;

            case "sete":
                acumularInteiro(7);
                break;

            case "oito":
                acumularInteiro(8);
                break;

            case "nove":
                acumularInteiro(9);
                break;
        
            default:
                break;
        }
    }

    public int getAcc() { return acc; }
}
