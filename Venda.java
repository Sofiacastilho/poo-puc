package br.pucpr.registrovenda;

import java.util.Scanner;

import static br.pucpr.registrovenda.Vendedor.comissao;

public class Venda {


    private int produto;
    private String vendedor;
    private float desconto = 00f; //em reais
    private int quantidadeItens;
    float getValorVenda;
    boolean isPromocao;


    //metodos

    public void calcularValor (){

        float valorFinal = (getValorVenda * quantidadeItens) - desconto;

        System.out.println("Valor final da venda: R$" + valorFinal);

    }

    public void calcularComissao(){
        float valorComissao = getValorVenda * comissao /100;

        if (this.isPromocao == true){
            valorComissao = valorComissao/2;
            System.out.println("Produto em promoção, a comissão fica: R$" + valorComissao);
        }
        else {
            System.out.println("Comissão calculada: R$" + valorComissao);
        }

    }

    public void efetuarDesconto (float getDesconto, float getValorVenda, float valorCusto){
        float valorDesconto = getValorVenda * getDesconto / 100;
        System.out.println("Valor do desconto: R$" + valorDesconto);

        float descontoFinal = getValorVenda - valorDesconto;

        if (descontoFinal < valorDesconto) {
            System.out.println("Desconto invalido.");
        }
        else {
            System.out.println("Valor final (com desconto): R$" + descontoFinal);
        }
    }

    public void imprimir(String getNome, String getDescricao, float getValorVenda, int getCodigoVendedor,
                         int getCodigoProduto, boolean isPromocao/*, float valorDesconto,
                         float descontoFinal, float valorComissao*/){
        System.out.println("Vendedor: " + getNome + "  Código: " + getCodigoVendedor + "  Comissão: " /*+ valorComissao*/);
        System.out.println("Quantidade de itens vendidos: " + quantidadeItens);
        System.out.println("Código do produto: " + getCodigoProduto);
        System.out.println("Descrição do produto: "+ getDescricao);
        System.out.println("Valor de venda: R$" + getValorVenda);
        System.out.println("Promoção: " + isPromocao);
        //System.out.println("Valor do desconto: R$" + valorDesconto);
        //System.out.println("Valor total da venda: R$" + descontoFinal);
    }


    public int getProduto() {
        return produto;
    }
    public void setProduto(int produto) {
        this.produto = produto;
    }

    public String getVendedor() {
        return vendedor;
    }
    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }



}
