package com.meuprojeto.dao;

import com.meuprojeto.model.Usuario;

public interface UsuarioDAO {
    Usuario findByLogin(String login) throws Exception;
    Usuario findById(int id) throws Exception;
    void create(Usuario u) throws Exception;
}
