package modulos.abstracao.metodos_e_atributos_estaticos;

public class Static {
    public static void main(String[] args) {
        try {
            // Não é necessário criar um objeto pois tudo é salvo no mapa da classe
            new Banco("123.456.789-01", "Rafael");
            new Banco("123.456.789-02", "Pedro");
            
            Banco.depositar(1, 100.00f);
            listarContas();

            Banco.transferir(1, 2, 200.00f);
            listarContas();

            Banco.transferir(1, 2, 25.00f);
            listarContas();
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    static public void listarContas() {
        System.out.println("Contas:");

        for (int i = 1; i <= Banco.getQtdContas(); i++) {
            Banco conta = Banco.getConta(i);

            System.out.printf("Num conta: %d, Saldo: R$ %.2f, Titular: %s%n",
                            i, conta.getSaldo(), conta.getNomeTitular());
        }
    }
}
