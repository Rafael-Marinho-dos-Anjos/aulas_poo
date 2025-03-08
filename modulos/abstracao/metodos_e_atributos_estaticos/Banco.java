package modulos.abstracao.metodos_e_atributos_estaticos;

import java.util.HashMap;

public class Banco {
    // Atributos estáticos
    private static HashMap<Integer, Banco> contas = new HashMap<>();
    private static int qtdContas = 0;

    // Atributos da instância
    private int numConta;
    private String cpfTitular;
    private String nomeTitular;
    private float saldo;

    public Banco(String cpf, String nomeTitular) throws Exception {
        // Verificando se o cpf é válido
        if (cpf.matches("(^[0-9]{3}[\\.]{1}[0-9]{3}[\\.]{1}[0-9]{3}[\\-]{1}[0-9]{2})$")) {
            this.cpfTitular = cpf;
        } else if (cpf.matches("(^[0-9]{11}$)")) {
            this.cpfTitular = cpf.substring(0, 3)
                            + "." + cpf.substring(3, 6)
                            + "." + cpf.substring(6, 9)
                            + "-" + cpf.substring(9, 11);
        } else {
            throw new Exception ("CPF inválido.");
        }

        this.numConta = ++qtdContas;
        this.nomeTitular = nomeTitular;
        this.saldo = 0.00f;

        // Inserindo a conta criada no mapa de contas
        contas.put(this.numConta, this);
    }

    // Métodos de instância
    private void creditar(float valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("O valor a ser creditado deve ser positivo");
        }

        this.saldo += valor;
    }

    private void debitar(float valor) throws Exception {
        if (valor <= 0) {
            throw new Exception("O valor a ser debitado deve ser positivo");
        } else if (valor > this.saldo) {
            throw new Exception("O valor a ser debitado não pode ser maior que o saldo disponível");
        }

        this.saldo -= valor;
    }

    // Métodos estáticos
    static void depositar(int numConta, float valor) {
        try {
            contas.get(numConta).creditar(valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void transferir(int contaOrigem, int contaDestino, float valor) {
        try {
            contas.get(contaOrigem).debitar(valor);
            contas.get(contaDestino).creditar(valor);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Getters
    public String getCpfTitular() {
        return cpfTitular;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public float getSaldo() {
        return saldo;
    }

    static public int getQtdContas() {
        return qtdContas;
    }

    static public Banco getConta(int numConta) {
        return contas.get(numConta);
    }
}
