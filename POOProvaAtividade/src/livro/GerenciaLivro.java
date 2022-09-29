package livro;

import java.util.ArrayList;

public class GerenciaLivro {
    private ArrayList<Livro> livros;

    public GerenciaLivro() {
        this.livros = new ArrayList();
    }

    private boolean livroExiste(String codigo){
        if(getLivro(codigo) == null){
            return false;
        }
        return true;
    }

    private Livro getLivro(String codigoDoLivro) {
        for(Livro livro: livros){
            if(livro.getCodigo() == codigoDoLivro){
                return livro;
            }
        }
        return null;
    }

    public void adicionarLivro(String titulo, String autor, int ano, String codigo, TipoDeLivro tipoDeLivro){
        if (!livroExiste(codigo)){
            livros.add(new Livro(titulo, autor, ano, codigo, tipoDeLivro));
        }
    }

    public void removerLivro(String codigoDoLivro){
        Livro livro = getLivro(codigoDoLivro);
        if (livroExiste(codigoDoLivro)) {
            livros.remove(livro);
        }
    }
}

