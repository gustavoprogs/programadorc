package br.com.programadorc.services;

import br.com.programadorc.dao.UsuarioDao;
import br.com.programadorc.domain.Usuario;
import java.util.List;

public class UsuarioService {

    private final UsuarioDao usuarioDao = new UsuarioDao();

    public void inicializarHibernate() {
        usuarioDao.inicializarHibernate();
    }

    public List<Usuario> listar() {
        return usuarioDao.listar();
    }

    public Usuario consultar(Integer id) {
        return usuarioDao.consultar(id);
    }

    public boolean inserir(Usuario usuario) {
        usuario.setSenha(usuario.getSenha());
        return usuarioDao.inserir(usuario);
    }

    public Boolean alterar(Usuario usuario) {
        return usuarioDao.alterar(usuario);
    }

    public boolean excluir(Usuario usuario) {
        return usuarioDao.excluir(usuario);
    }

    public Boolean autenticar(Usuario usuario) {
        Usuario usuarioBanco = usuarioDao.consultarPorEmail(usuario.getEmail());

        if (usuarioBanco == null) {
            return false;
        } else {
            if (!usuario.getSenha().equals(usuarioBanco.getSenha())) {
                return false;
            } else {
                return true;
            }
        }
    }
}
