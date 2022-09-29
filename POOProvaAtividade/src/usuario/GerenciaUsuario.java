package usuario;

import java.util.ArrayList;

public class GerenciaUsuario {
    private ArrayList<Usuario> usuarios;

    public GerenciaUsuario() {
        this.usuarios = new ArrayList();
    }

    private boolean usuarioExiste(String cpf){
        if(getUsuario(cpf) == null){
            return false;
        }
        return true;
    }

    private Usuario getUsuario(String cpfDoUsuario) {
        for(Usuario usuario: usuarios){
            if(usuario.getCpf() == cpfDoUsuario){
                return usuario;
            }
        }
        return null;
    }

    public void adicionarUsuario(String cpfDoUsuario, String nomeDoUsuario){
        if (!usuarioExiste(cpfDoUsuario)){
            usuarios.add(new Usuario(cpfDoUsuario, nomeDoUsuario));
        }
    }

    public void removerUsuario(String cpfDoUsuario){
        Usuario usuario = getUsuario(cpfDoUsuario);
        if (usuarioExiste(cpfDoUsuario)) {
            usuarios.remove(usuario);
        }
    }
}
