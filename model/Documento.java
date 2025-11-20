package model;
import java.util.Date;
public class Documento {
    private int codigo;
    private String tipo;
    private Date data;
    private double valor;
    private int pessoaCodigo;
    private int usuarioCodigo;

    public Documento() {}

    public Documento(int codigo, String tipo, Date data, double valor, int pessoaCodigo, int usuarioCodigo) {
        this.codigo = codigo; this.tipo = tipo; this.data = data;
        this.valor = valor; this.pessoaCodigo = pessoaCodigo; this.usuarioCodigo = usuarioCodigo;
    }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }
    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
    public int getPessoaCodigo() { return pessoaCodigo; }
    public void setPessoaCodigo(int pessoaCodigo) { this.pessoaCodigo = pessoaCodigo; }
    public int getUsuarioCodigo() { return usuarioCodigo; }
    public void setUsuarioCodigo(int usuarioCodigo) { this.usuarioCodigo = usuarioCodigo; }
}
