package com.meuprojeto.dao.impl;

import com.meuprojeto.dao.ProdutoDAO;
import com.meuprojeto.model.Produto;
import com.meuprojeto.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOImpl implements ProdutoDAO {
    @Override
    public Produto findById(int id) throws Exception {
        String sql = "SELECT upr_codigo, upr_nome, upr_complemento, upr_und, upr_preco FROM Produto WHERE upr_codigo = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Produto p = new Produto();
                    p.setUprCodigo(rs.getInt("upr_codigo"));
                    p.setUprNome(rs.getString("upr_nome"));
                    p.setUprComplemento(rs.getString("upr_complemento"));
                    p.setUprUnd(rs.getString("upr_und"));
                    p.setUprPreco(rs.getBigDecimal("upr_preco"));
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public List<Produto> findAll() throws Exception {
        String sql = "SELECT upr_codigo, upr_nome, upr_complemento, upr_und, upr_preco FROM Produto";
        List<Produto> lista = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Produto p = new Produto();
                p.setUprCodigo(rs.getInt("upr_codigo"));
                p.setUprNome(rs.getString("upr_nome"));
                p.setUprComplemento(rs.getString("upr_complemento"));
                p.setUprUnd(rs.getString("upr_und"));
                p.setUprPreco(rs.getBigDecimal("upr_preco"));
                lista.add(p);
            }
        }
        return lista;
    }

    @Override
    public void create(Produto p) throws Exception {
        String sql = "INSERT INTO Produto (upr_nome, upr_complemento, upr_und, upr_preco) VALUES (?,?,?,?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getUprNome());
            ps.setString(2, p.getUprComplemento());
            ps.setString(3, p.getUprUnd());
            ps.setBigDecimal(4, p.getUprPreco());
            ps.executeUpdate();
        }
    }

    @Override
    public void update(Produto p) throws Exception {
        String sql = "UPDATE Produto SET upr_nome=?, upr_complemento=?, upr_und=?, upr_preco=? WHERE upr_codigo=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, p.getUprNome());
            ps.setString(2, p.getUprComplemento());
            ps.setString(3, p.getUprUnd());
            ps.setBigDecimal(4, p.getUprPreco());
            ps.setInt(5, p.getUprCodigo());
            ps.executeUpdate();
        }
    }

    @Override
    public void delete(int id) throws Exception {
        String sql = "DELETE FROM Produto WHERE upr_codigo = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
