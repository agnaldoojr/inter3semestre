package com.meuprojeto.model;

public class Pessoa {
    private Integer upsCodigo;
    private String upsNome;
    private String upsCpf;
    private String upsTelefone;
    private boolean upsCliente;
    private boolean upsFornecedor;

    public Integer getUpsCodigo() { return upsCodigo; }
    public void setUpsCodigo(Integer upsCodigo) { this.upsCodigo = upsCodigo; }
    public String getUpsNome() { return upsNome; }
    public void setUpsNome(String upsNome) { this.upsNome = upsNome; }
    public String getUpsCpf() { return upsCpf; }
    public void setUpsCpf(String upsCpf) { this.upsCpf = upsCpf; }
    public String getUpsTelefone() { return upsTelefone; }
    public void setUpsTelefone(String upsTelefone) { this.upsTelefone = upsTelefone; }
    public boolean isUpsCliente() { return upsCliente; }
    public void setUpsCliente(boolean upsCliente) { this.upsCliente = upsCliente; }
    public boolean isUpsFornecedor() { return upsFornecedor; }
    public void setUpsFornecedor(boolean upsFornecedor) { this.upsFornecedor = upsFornecedor; }
}
