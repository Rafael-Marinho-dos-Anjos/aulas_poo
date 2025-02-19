package modulos.abstracao.metodos_e_atributos;

public class Exemplo {
    public static void main(String[] args) {
        // Instanciando um objeto de conta com acesso direto aos atributos
        Conta contaDireto = new Conta("000.000.000-00");
        // Printando atributos
        System.out.printf("Número da conta: %d%n", contaDireto.numConta);
        System.out.printf("CPF do titular: %s%n", contaDireto.cpfTitular);
        System.out.printf("Saldo da conta: %.2f%n", contaDireto.saldo);
        
        // Como o acesso é direto, é possível alterar o valor do saldo sem nenhum critério
        contaDireto.saldo = -200.00f;
        System.out.printf("Novo saldo da conta: %.2f%n", contaDireto.saldo);
        


        // Printando separador
        System.out.printf("%n%s%n%n", "-".repeat(50));


        
        // Instanciando um objeto de conta com acesso direto aos atributos
        ContaGetSet contaMetodo = new ContaGetSet("000.000.001-00");
        // Printando atributos
        System.out.printf("Número da conta: %d%n", contaMetodo.getNumConta());
        System.out.printf("CPF do titular: %s%n", contaMetodo.getCpfTitular());
        System.out.printf("Saldo da conta: %.2f%n", contaMetodo.getSaldo());

        // O método set permite adicionar verificações e processos para garantir a integridade
        // dos dados ao redefinir valores dos atributos
        try {
            // Redefinindo número de conta para valor permitido
            contaMetodo.setNumConta(10);
            System.out.println("Número de conta redefinido com sucesso!");
        } catch (Exception e) {
            System.out.printf("ERRO: %s", e.getMessage()); }

        try {
            // Redefinindo número de conta para valor não permitido
            contaMetodo.setNumConta(0);
            System.out.println("Número de conta redefinido com sucesso!");
        } catch (Exception e) {
            System.out.printf("ERRO: %s", e.getMessage()); }
    }
}
