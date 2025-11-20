package com.meuprojeto.model;

import java.math.BigDecimal;

public class Produto {
    private Integer uprCodigo;
    private String uprNome;
    private String uprComplemento;
    private String uprUnd;
    private BigDecimal uprPreco;

    public Integer getUprCodigo() { return uprCodigo; }
    public void setUprCodigo(Integer uprCodigo) { this.uprCodigo = uprCodigo; }
    public String getUprNome() { return uprNome; }
    public void setUprNome(String uprNome) { this.uprNome = uprNome; }
    public String getUprComplemento() { return uprComplemento; }
    public void setUprComplemento(String uprComplemento) { this.uprComplemento = uprComplemento; }
    public String getUprUnd() { return uprUnd; }
    public void setUprUnd(String uprUnd) { this.uprUnd = uprUnd; }
    public BigDecimal getUprPreco() { return uprPreco; }
    public void setUprPreco(BigDecimal uprPreco) { this.uprPreco = uprPreco; }
}
