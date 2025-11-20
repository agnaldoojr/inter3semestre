package com.meuprojeto.service;

import com.meuprojeto.dao.UsuarioDAO;
import com.meuprojeto.dao.impl.UsuarioDAOImpl;
import com.meuprojeto.model.Usuario;
import org.mindrot.jbcrypt.BCrypt;

public class AuthService {
    private UsuarioDAO usuarioDAO = new UsuarioDAOImpl();

    public Usuario authenticate(String login, String senha) throws Exception {
        Usuario u = usuarioDAO.findByLogin(login);
        if (u == null) return null;
        if (BCrypt.checkpw(senha, u.getUsuSenhaHash())) {
            return u;
        }
        return null;
    }
}
