package livro;

public class Fisico extends Livro{
    private String isbn;
    private int edicao;

    public Fisico(String titulo, String autor, int ano, String codigo, TipoDeLivro tipoDeLivro, String isbn) {
        super(titulo, autor, ano, codigo, tipoDeLivro);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}
