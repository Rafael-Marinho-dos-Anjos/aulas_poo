package modulos.encapsulamento.get_set;

public class CLiente {
    private String nome;
    private String cpf;

    // Getters
    public String getNome() { return this.nome; }
    public String getCpf() { return cpf; }

    // Setters
    public void setNome(String nome) { this.nome = nome; }

    public void setCpf(String cpf) {
        // Verificando se o cpf digitado é formado apenas por números
        Long.valueOf(cpf);

        // Formatação do cpf a ser salvo
        if (cpf.length() == 11) {
            this.cpf = cpf.substring(0, 3) +
                    "." + cpf.substring(3, 6) +
                    "." + cpf.substring(6, 9) +
                    "-" + cpf.substring(9);
        }
    }
}
