package livro;

public class Livro {
    protected String titulo;
    protected String autor;
    protected int ano;
    protected String codigo;
    protected TipoDeLivro tipoDeLivro;

    public Livro(String titulo, String autor, int ano, String codigo, TipoDeLivro tipoDeLivro) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.codigo = codigo;
        this.tipoDeLivro = tipoDeLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoDeLivro getTipoDeLivro() {
        return tipoDeLivro;
    }

    public void setTipoDeLivro(TipoDeLivro tipoDeLivro) {
        this.tipoDeLivro = tipoDeLivro;
    }
}
