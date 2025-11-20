package com.meuprojeto.model;

public class Usuario {
    private Integer usuCodigo;
    private String usuLogin;
    private String usuSenhaHash;
    private String usuNome;

    public Integer getUsuCodigo() { return usuCodigo; }
    public void setUsuCodigo(Integer usuCodigo) { this.usuCodigo = usuCodigo; }
    public String getUsuLogin() { return usuLogin; }
    public void setUsuLogin(String usuLogin) { this.usuLogin = usuLogin; }
    public String getUsuSenhaHash() { return usuSenhaHash; }
    public void setUsuSenhaHash(String usuSenhaHash) { this.usuSenhaHash = usuSenhaHash; }
    public String getUsuNome() { return usuNome; }
    public void setUsuNome(String usuNome) { this.usuNome = usuNome; }
}
