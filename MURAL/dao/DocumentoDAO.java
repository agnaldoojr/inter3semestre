package com.meuprojeto.dao;

import com.meuprojeto.model.Documento;
import java.util.List;

public interface DocumentoDAO {
    Documento findById(int id) throws Exception;
    List<Documento> findAll() throws Exception;
    void create(Documento d) throws Exception;
}
