package br.com.fiap;

public class Kindle {
    public String livro;
    public int pagina;
    public void mudarLivro(String trocaLivro) {
        livro = trocaLivro;
    }
    public void voltarPag() {
        pagina --;
    }
    public void avancarPag() {
        pagina++;
    }
// Mock Test
    public static void main(String[] args) {
        Kindle kindle1 = new Kindle();
        kindle1.livro = "1984";
        kindle1.pagina = 171;
        kindle1.avancarPag();
        kindle1.avancarPag();
        kindle1.mudarLivro("Formalist Manifesto");
        System.out.println("Livro atual:\t"+ kindle1.livro + "\nPágina atual:\t" + kindle1.pagina);
    }
}
