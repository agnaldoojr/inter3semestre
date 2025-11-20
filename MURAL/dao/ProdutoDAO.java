package com.meuprojeto.dao;

import com.meuprojeto.model.Produto;
import java.util.List;

public interface ProdutoDAO {
    Produto findById(int id) throws Exception;
    List<Produto> findAll() throws Exception;
    void create(Produto p) throws Exception;
    void update(Produto p) throws Exception;
    void delete(int id) throws Exception;
}
