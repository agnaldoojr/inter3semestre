package model;
public class Estoque {
    private int produtoCodigo;
    private int quantidade;
    private double valor;

    public Estoque() {}

    public Estoque(int produtoCodigo, int quantidade, double valor) {
        this.produtoCodigo = produtoCodigo; this.quantidade = quantidade; this.valor = valor;
    }
    public int getProdutoCodigo() { return produtoCodigo; }
    public void setProdutoCodigo(int produtoCodigo) { this.produtoCodigo = produtoCodigo; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}
