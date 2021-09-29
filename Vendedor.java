package br.pucpr.registrovenda;

public class Vendedor {

    private String nome;
    private int codigoVendedor;
    public static float comissao = 15.0f; //variavel constante visivel pra tudo
    private String endereco;

    public Vendedor(String nome, int codigoVendedor, String endereco) { //construtor
        this.nome = nome;
        this.codigoVendedor = codigoVendedor;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public void setCodigoVendedor(int codigoVendedor) {
        this.codigoVendedor = codigoVendedor;
    }

    public static float getComissao() {
        return comissao;
    }

    public static void setComissao(float comissao) {
        Vendedor.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
