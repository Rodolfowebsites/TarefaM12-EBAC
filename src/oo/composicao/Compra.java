package oo.composicao;

import java.util.ArrayList;

public class Compra {
    // Esse é um exemplo de composição de 1 para muitos ou seja um objeto pode ser usado para várias classes
    // Nesse exemplo tempos o item que pode ser comprado várias vezes e em quantidades diferentes e por pessoas diferentes.

    String cliente;

    //Arraylist da classe Item sendo instanciada
    ArrayList<Item> itens = new ArrayList<>();


    // Um metodo para já ficar instanciado e facilitar quando for adicionar novos itens na classe CompraTeste.
    // Esse metodo já instância um item e já adiciona dentro da lista dos itens e também pega a compra e seta para
    // A relação bidirecional de forma correta.
    void adicionarItem(String nome, int quantidade, double preco) {
        this.adicionarItem(new Item(nome, quantidade, preco));
    }

    //Um metodo para facilitar quando for adicionar novos itens ao arraylist na classe compraTeste, no lugar de itens.add.
    void adicionarItem(Item item) {
        this.itens.add(item);
        item.compra = this;
    }


    //Metodo para fazer um calculo
    double getValorTotal() {
        double total = 0;
        for(Item item: itens) { // Item da classe - item é o nome do for - itens é o arraylist que será percorrido.
            total += item.quantidade * item.preco; // calculo para pegar o valor da quantidade vezes o preço.
        }                                           // Será declarado em outra classe chamada CompraTeste.
        return total;
    }

}
