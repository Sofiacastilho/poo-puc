package br.pucpr.registrovenda;
/*O método main deve:
– Setar o produto e o vendedor na venda
– Imprimir a venda
– Criar um produto que está em promoção, com valor
de custo = 80 e valor de venda = 100
– Criar outro vendedor
– Criar outra venda
– Setar o produto e o vendedor na venda
– Informar que a venda é referente a três itens
– Efetuar um desconto de 10%
– Calcular o valor da venda
– Imprimir o valor da comissão do vendedor
– Imprimir a venda
– Criar outra venda
– Setar o produto e o vendedor do slide anterior na
nova venda
– Informar que a venda é referente a dois itens
– Efetuar um desconto de 30% (perceba que esse
desconto vai fazer com que o produto seja vendido
abaixo do preço de custo!!!!!)
– Calcular o valor da venda
– Imprimir o valor da comissão do vendedor
– Imprimir a venda*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Criando novo produto no sistema..");
        Produto p1 = new Produto(9999, 3000,
                2000, false, "PlayStation 4 preto, 256gb, slim, 1 jogo incluso");



        System.out.println("--------------------------------");



        System.out.println("Criando novo vendedor no sistema..");
        Vendedor vendedor1 = new Vendedor("Sofia", 123,
                "Shopping Centro");



        System.out.println("--------------------------------");



        System.out.println("Criando nova venda no sistema..");
        Venda venda1 = new Venda();

        venda1.setVendedor("Sofia");
        venda1.setQuantidadeItens(2);


        venda1.calcularValor();
        venda1.calcularComissao();
        venda1.imprimir(vendedor1.getNome("Sofia"),p1.getDescricao(),
        p1.getValorVenda(), vendedor1.getCodigoVendedor(), p1.getCodigoProduto(),
                p1.isPromocao()/*, venda1.valorDesconto, float descontoFinal, float valorComissao*/);



    }

}
