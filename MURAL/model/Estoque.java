package com.meuprojeto.model;

import java.math.BigDecimal;

public class Estoque {
    private Integer estUprCodigo;
    private BigDecimal estQtd;
    private BigDecimal estValor;

    public Integer getEstUprCodigo() { return estUprCodigo; }
    public void setEstUprCodigo(Integer estUprCodigo) { this.estUprCodigo = estUprCodigo; }
    public BigDecimal getEstQtd() { return estQtd; }
    public void setEstQtd(BigDecimal estQtd) { this.estQtd = estQtd; }
    public BigDecimal getEstValor() { return estValor; }
    public void setEstValor(BigDecimal estValor) { this.estValor = estValor; }
}
