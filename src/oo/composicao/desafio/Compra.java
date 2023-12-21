package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {

    final List<Item>itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade) {
        this.itens.add(new Item(p, quantidade));
    }

    // Metodo para adicionar o item

    void adicionarItem(String nome, double preco, int qtde) {
        var produto = new Produto( nome, preco);
        this.itens.add(new Item(produto, qtde));
    }

    double obterValorTotal(){
        double total = 0;
        for(Item item: itens){
            total += item.qtde * item.produto.preco;
        }
        return total;
    }
}
