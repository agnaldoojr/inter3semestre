package model;
public class Produto {
    private int codigo;
    private String nome;
    private String complemento;
    private String unidade;
    private double preco;

    public Produto() {}

    public Produto(int codigo, String nome, String complemento, String unidade, double preco) {
        this.codigo = codigo; this.nome = nome; this.complemento = complemento;
        this.unidade = unidade; this.preco = preco;
    }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getComplemento() { return complemento; }
    public void setComplemento(String complemento) { this.complemento = complemento; }
    public String getUnidade() { return unidade; }
    public void setUnidade(String unidade) { this.unidade = unidade; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}
