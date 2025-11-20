package model;
public class ItemDocumento {
    private int codigo;
    private double valor;
    private int quantidade;
    private String unidade;
    private int documentoCodigo;
    private int produtoCodigo;

    public ItemDocumento() {}

    public ItemDocumento(int codigo, double valor, int quantidade, String unidade, int documentoCodigo, int produtoCodigo) {
        this.codigo = codigo; this.valor = valor; this.quantidade = quantidade; 
        this.unidade = unidade; this.documentoCodigo = documentoCodigo; 
        this.produtoCodigo = produtoCodigo;
    }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public String getUnidade() { return unidade; }
    public void setUnidade(String unidade) { this.unidade = unidade; }
    public int getDocumentoCodigo() { return documentoCodigo; }
    public void setDocumentoCodigo(int documentoCodigo) { this.documentoCodigo = documentoCodigo; }
    public int getProdutoCodigo() { return produtoCodigo; }
    public void setProdutoCodigo(int produtoCodigo) { this.produtoCodigo = produtoCodigo; }
}
