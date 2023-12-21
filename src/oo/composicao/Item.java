package oo.composicao;

public class Item {

    //Atributos
    String nome;
    int quantidade;
    double preco;
    Compra compra;

    //Construtor
    Item(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
}
