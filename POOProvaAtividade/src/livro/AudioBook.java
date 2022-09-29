package livro;

public class AudioBook extends Digital{
    private int tempoDeDuração;

    public AudioBook(String titulo, String autor, int ano, String codigo, TipoDeLivro tipoDeLivro, String linkDownload, int tempoDeDuração) {
        super(titulo, autor, ano, codigo, tipoDeLivro, linkDownload);
        this.tempoDeDuração = tempoDeDuração;
    }

    public int getTempoDeDuração() {
        return tempoDeDuração;
    }

    public void setTempoDeDuração(int tempoDeDuração) {
        this.tempoDeDuração = tempoDeDuração;
    }
}
