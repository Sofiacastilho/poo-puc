package br.pucpr.registrovenda;
public class Venda {

    private Produto produto;
    private Vendedor vendedor;
    private float desconto; //em reais
    private int quantidadeItens;
    private float valorComissao;
    private float valorDesconto;
    private float valorFinalDesconto;


    //metodos

    public float calcularValor (){
        valorFinalDesconto = ( getProduto().getValorVenda()* getQuantidadeItens() ) - valorDesconto;
        return valorFinalDesconto;
    }


    public float calcularComissao(){

        valorComissao = getProduto().getValorVenda() * getVendedor().getComissao() /100;

        if (getProduto().isPromocao()){
            valorComissao = valorComissao/2;
            return  valorComissao;
        } else {
            return valorComissao;
        }
    }


    public float efetuarDesconto() {
        valorDesconto = ( (getProduto().getValorVenda() * getQuantidadeItens()) * getDesconto() ) / 100;
        valorFinalDesconto = ( getProduto().getValorVenda()* getQuantidadeItens() ) - valorDesconto;

        if (valorFinalDesconto < getProduto().getValorCusto()) {
            System.out.println("Desconto invalido.");
        } else {
            return valorFinalDesconto;
        }
        return valorDesconto;
    }


    public void imprimir(){
        System.out.println("Vendedor: " + getVendedor().getNome() + "  Código: " + getVendedor().getCodigoVendedor() + "  Comissão (por item): " + valorComissao);
        System.out.println("Quantidade de itens vendidos: " + quantidadeItens);
        System.out.println("Código do produto: " + getProduto().getCodigoProduto());
        System.out.println("Descrição do produto: "+ getProduto().getDescricao());
        System.out.println("Valor de venda: R$" + getProduto().getValorVenda());
        System.out.println("Promoção: " + getProduto().isPromocao());
        System.out.println("Valor do desconto: R$" + valorDesconto);
        System.out.println("Valor total da venda: R$" + valorFinalDesconto);
    }


    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}
