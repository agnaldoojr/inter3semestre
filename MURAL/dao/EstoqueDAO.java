package com.meuprojeto.dao;

import com.meuprojeto.model.Estoque;
import java.util.List;

public interface EstoqueDAO {
    Estoque findByProduto(int uprCodigo) throws Exception;
    void upsert(Estoque e) throws Exception;
    List<Estoque> findAll() throws Exception;
}
