package model;
public class Pessoa {
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private boolean cliente;
    private boolean fornecedor;

    public Pessoa() {}

    public Pessoa(int codigo, String nome, String cpf, String telefone, boolean cliente, boolean fornecedor) {
        this.codigo = codigo; this.nome = nome; this.cpf = cpf; this.telefone = telefone;
        this.cliente = cliente; this.fornecedor = fornecedor;
    }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public boolean isCliente() { return cliente; }
    public void setCliente(boolean cliente) { this.cliente = cliente; }
    public boolean isFornecedor() { return fornecedor; }
    public void setFornecedor(boolean fornecedor) { this.fornecedor = fornecedor; }
}
