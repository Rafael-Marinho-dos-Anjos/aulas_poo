package modulos.encapsulamento.classes_publicas_privadas;

import java.util.LinkedList;

public class Livro {
    private class Pagina {
        private int numLetras;
        private String texto;

        public Pagina(int tamanhoPagina) {
            this.numLetras = tamanhoPagina;
            this.texto = "";
        }

        public String escrever(String novoTexto) {
            int letrasRestantes = this.numLetras - this.texto.length();

            if (novoTexto.length() <= letrasRestantes) {
                this.texto += novoTexto;
                return "";
            } else {
                this.texto += novoTexto.substring(0, letrasRestantes);
                return novoTexto.substring(letrasRestantes);
            }
        }

        public String ler() {
            return this.texto;
        }
    }

    private LinkedList<Pagina> paginas = new LinkedList<>();
    private int tamanhoPaginas;

    public Livro (int tamanhoPaginas) { this.tamanhoPaginas = tamanhoPaginas; }

    public void escrever(String texto) {
        if (this.paginas.size() == 0) {
            this.paginas.add(new Pagina(this.tamanhoPaginas));
        }

        while (texto.length() > 0) {
            texto = this.paginas.getLast().escrever(texto);

            if (texto.length() > 0) {
                this.paginas.addLast(new Pagina(this.tamanhoPaginas));
            }
        }
    }

    public void ler() {
        int numPag = 0;

        for (Pagina pag: this.paginas) {
            System.out.println("Página " + ++numPag);
            System.out.println(pag.ler());
        }
    }
}
