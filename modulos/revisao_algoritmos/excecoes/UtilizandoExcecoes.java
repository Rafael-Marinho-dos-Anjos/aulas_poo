package modulos.revisao_algoritmos.excecoes;

import java.util.Scanner;

// Classes de exceção customizadas
class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException (String msg) { super(msg); }
}

class ContaInexistenteException extends Exception {
    public ContaInexistenteException (String msg) { super(msg); }
}

class ValorInvalidoException extends Exception {
    public ValorInvalidoException (String msg) { super(msg); }
}


public class UtilizandoExcecoes {
    // Iniciando duas contas bancárias, uma com saldo 100 e outra com saldo 0
    static double conta1Saldo = 100.0;
    static double conta2Saldo = 0.0;

    static void debitar(int conta, double valor) throws ContaInexistenteException, SaldoInsuficienteException {
        double saldoConta;

        // Identificando a conta de débito
        switch (conta) {
            case 1:
                saldoConta = conta1Saldo;
                break;
            
            case 2:
                saldoConta = conta2Saldo;
                break;
                
            default:
                throw new ContaInexistenteException("Conta de origem não existente");
        }
        
        // Verificando se há saldo suficiente
        if (saldoConta < valor) {
            throw new SaldoInsuficienteException("A conta não possui saldo necessário para a operação");
        }

        // Realizando o débito do valor
        switch (conta) {
            case 1:
                conta1Saldo = conta1Saldo - valor;
                break;
            
            case 2:
                conta2Saldo = conta2Saldo - valor;
                break;
        }
    }

    static void creditar(int conta, double valor) throws ContaInexistenteException {
        // Verificando se a conta existe
        switch (conta) {
            case 1:
                conta1Saldo = conta1Saldo + valor;
                break;
            
            case 2:
                conta2Saldo = conta2Saldo + valor;
                break;
                
            default:
                throw new ContaInexistenteException("Conta de destino inexistente");
        }
    }

    static void transferir(int contaOrigem, int contaDestino, double valor) throws ContaInexistenteException, SaldoInsuficienteException, ValorInvalidoException {
        // Verificando se o valor é positivo
        if (valor <= 0) {
            throw new ValorInvalidoException("O valor a ser transferido deve ser positivo");
        }
        
        // Realizando a chamada do processo de transferência
        debitar(contaOrigem, valor);
        creditar(contaDestino, valor);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o número da conta de origem: ");
        int contaOrigem = in.nextInt();

        System.out.print("Digite o número da conta de destino: ");
        int contaDestino = in.nextInt();

        System.out.print("Digite o valor a ser transferido: ");
        double valor = in.nextDouble();

        // Executando a transferência num try para capturar possível erro
        try {
            transferir(contaOrigem, contaDestino, valor);
            System.out.println("Transferência realizada com sucesso!");
        }
        // Se algum número de conta informado não for válido
        catch (ContaInexistenteException e) {
            System.out.printf("Conta não encontrada: %s%n", e.getMessage());
        }
        // Se o valor transferido for superior ao saldo da conta de origem
        catch (SaldoInsuficienteException e) {
            System.out.printf("Saldo insuficiente: %s%n", e.getMessage());
        }
        // Se o valor transferido não for positivo
        catch (ValorInvalidoException e) {
            System.out.printf("Valor inválido: %s%n", e.getMessage());
        }
        finally {
            System.out.println("Fim da operação");
        }

        in.close();
    }
}
