package livro;

public class EBook extends Digital{
    private int numeroDePaginas;

    public EBook(String titulo, String autor, int ano, String codigo, TipoDeLivro tipoDeLivro, String linkDownload, int numeroDePaginas) {
        super(titulo, autor, ano, codigo, tipoDeLivro, linkDownload);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}
