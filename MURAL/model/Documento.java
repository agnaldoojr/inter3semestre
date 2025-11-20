package com.meuprojeto.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class Documento {
    private Integer doctoCodigo;
    private String doctoTipo;
    private LocalDateTime doctoData;
    private BigDecimal doctoValor;
    private Integer doctoUpsCodigo;
    private Integer doctoUsuCodigo;
    private List<ItemDocumento> itens;

    public Integer getDoctoCodigo() { return doctoCodigo; }
    public void setDoctoCodigo(Integer doctoCodigo) { this.doctoCodigo = doctoCodigo; }
    public String getDoctoTipo() { return doctoTipo; }
    public void setDoctoTipo(String doctoTipo) { this.doctoTipo = doctoTipo; }
    public LocalDateTime getDoctoData() { return doctoData; }
    public void setDoctoData(LocalDateTime doctoData) { this.doctoData = doctoData; }
    public BigDecimal getDoctoValor() { return doctoValor; }
    public void setDoctoValor(BigDecimal doctoValor) { this.doctoValor = doctoValor; }
    public Integer getDoctoUpsCodigo() { return doctoUpsCodigo; }
    public void setDoctoUpsCodigo(Integer doctoUpsCodigo) { this.doctoUpsCodigo = doctoUpsCodigo; }
    public Integer getDoctoUsuCodigo() { return doctoUsuCodigo; }
    public void setDoctoUsuCodigo(Integer doctoUsuCodigo) { this.doctoUsuCodigo = doctoUsuCodigo; }
    public List<ItemDocumento> getItens() { return itens; }
    public void setItens(List<ItemDocumento> itens) { this.itens = itens; }
}
