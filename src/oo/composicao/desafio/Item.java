package oo.composicao.desafio;

public class Item {
    final Produto produto;
    final int qtde;
    Item(Produto produto, int qtde) {
        this.qtde = qtde;
        this.produto = produto;
    }
}
