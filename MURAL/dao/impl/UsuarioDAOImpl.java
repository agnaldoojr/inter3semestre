package com.meuprojeto.dao.impl;

import com.meuprojeto.dao.UsuarioDAO;
import com.meuprojeto.model.Usuario;
import com.meuprojeto.util.DBConnection;
import org.mindrot.jbcrypt.BCrypt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAOImpl implements UsuarioDAO {
    @Override
    public Usuario findByLogin(String login) throws Exception {
        String sql = "SELECT usu_codigo, usu_login, usu_senha, usu_nome FROM Usuarios WHERE usu_login = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, login);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Usuario u = new Usuario();
                    u.setUsuCodigo(rs.getInt("usu_codigo"));
                    u.setUsuLogin(rs.getString("usu_login"));
                    u.setUsuSenhaHash(rs.getString("usu_senha"));
                    u.setUsuNome(rs.getString("usu_nome"));
                    return u;
                }
            }
        }
        return null;
    }

    @Override
    public Usuario findById(int id) throws Exception {
        String sql = "SELECT usu_codigo, usu_login, usu_senha, usu_nome FROM Usuarios WHERE usu_codigo = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Usuario u = new Usuario();
                    u.setUsuCodigo(rs.getInt("usu_codigo"));
                    u.setUsuLogin(rs.getString("usu_login"));
                    u.setUsuSenhaHash(rs.getString("usu_senha"));
                    u.setUsuNome(rs.getString("usu_nome"));
                    return u;
                }
            }
        }
        return null;
    }

    @Override
    public void create(Usuario u) throws Exception {
        String sql = "INSERT INTO Usuarios (usu_login, usu_senha, usu_nome) VALUES (?,?,?)";
        String hash = BCrypt.hashpw(u.getUsuSenhaHash(), BCrypt.gensalt());
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, u.getUsuLogin());
            ps.setString(2, hash);
            ps.setString(3, u.getUsuNome());
            ps.executeUpdate();
        }
    }
}
