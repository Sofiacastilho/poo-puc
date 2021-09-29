package br.pucpr.registrovenda;

public class Produto {

    private int codigoProduto;
    private String descricao;
    private float valorVenda;
    private float valorCusto;
    private boolean promocao;


    public Produto(int codigoProduto, float valorVenda, float valorCusto, boolean promocao, String descricao) { //construtor
        this.codigoProduto = codigoProduto;
        this.descricao = descricao;
        this.valorVenda = valorVenda;
        this.valorCusto = valorCusto;
        this.promocao = promocao;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }
    public void setCodigoProduto(int codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public float getValorCusto() {
        return valorCusto;
    }
    public void setValorCusto(float valorCusto) {
        this.valorCusto = valorCusto;
    }

    public boolean isPromocao() {
        return promocao;
    }
    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }
}
