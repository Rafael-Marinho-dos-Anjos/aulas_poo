package modulos.abstracao.metodos_e_atributos;


class TransacaoInvalidaException extends Exception {
    public TransacaoInvalidaException (String msg) { super(msg); }
}

public class Conta {
    // Atributo de classe que conta o número de contas criadas
    private static int contagem = 0;

    // Atributos de instância
    int numConta;
    String cpfTitular;
    float saldo;

    public Conta(String cpfTitular) {
        this.cpfTitular = cpfTitular;
        this.saldo = 0;
        this.numConta = ++contagem;
    }

    public void creditar(float valor) throws TransacaoInvalidaException {
        if (valor <= 0) {
            throw new TransacaoInvalidaException("O valor creditado deve ser positivo");
        }
        this.saldo = this.saldo + valor;
    }

    public void debitar(float valor) throws TransacaoInvalidaException {
        if (valor <= 0) {
            throw new TransacaoInvalidaException("O valor debitado deve ser positivo");
        }
        if (valor > this.saldo) {
            throw new TransacaoInvalidaException("O valor debitado não pode ser superior ao saldo");
        }
        this.saldo = this.saldo - valor;
    }
}
