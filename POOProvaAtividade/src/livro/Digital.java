package livro;

public class Digital extends Livro {
    private String linkDownload;

    public Digital(String titulo, String autor, int ano, String codigo, TipoDeLivro tipoDeLivro, String linkDownload) {
        super(titulo, autor, ano, codigo, tipoDeLivro);
        this.linkDownload = linkDownload;
    }

    public String getLinkDownload() {
        return linkDownload;
    }

    public void setLinkDownload(String linkDownload) {
        this.linkDownload = linkDownload;
    }
}
