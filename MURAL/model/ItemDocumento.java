package com.meuprojeto.model;

import java.math.BigDecimal;

public class ItemDocumento {
    private Integer itemdoctoCodigo;
    private Integer itemdoctoDoctoCodigo;
    private Integer itemdoctoUprCodigo;
    private BigDecimal itemdoctoQtd;
    private BigDecimal itemdoctoValor;

    public Integer getItemdoctoCodigo() { return itemdoctoCodigo; }
    public void setItemdoctoCodigo(Integer itemdoctoCodigo) { this.itemdoctoCodigo = itemdoctoCodigo; }
    public Integer getItemdoctoDoctoCodigo() { return itemdoctoDoctoCodigo; }
    public void setItemdoctoDoctoCodigo(Integer itemdoctoDoctoCodigo) { this.itemdoctoDoctoCodigo = itemdoctoDoctoCodigo; }
    public Integer getItemdoctoUprCodigo() { return itemdoctoUprCodigo; }
    public void setItemdoctoUprCodigo(Integer itemdoctoUprCodigo) { this.itemdoctoUprCodigo = itemdoctoUprCodigo; }
    public BigDecimal getItemdoctoQtd() { return itemdoctoQtd; }
    public void setItemdoctoQtd(BigDecimal itemdoctoQtd) { this.itemdoctoQtd = itemdoctoQtd; }
    public BigDecimal getItemdoctoValor() { return itemdoctoValor; }
    public void setItemdoctoValor(BigDecimal itemdoctoValor) { this.itemdoctoValor = itemdoctoValor; }
}
