package oo.composicao;

public class CompraTeste {

    public static void main(String[] args) {

        //Está sendo adicionado ao ArrayList e sendo instanciado da classe item - new Item.
        Compra c1 = new Compra();
        c1.cliente = "João Pedro";
        c1.adicionarItem("Caneta", 2, 8.50); // Sem precisar instanciar
        c1.itens.add(new Item("Borracha", 1, 3.50));
        c1.itens.add(new Item("Caderno", 1, 60));

        System.out.println(c1.itens.size()); // Saber o tamanho do array.
        System.out.println(c1.getValorTotal());
        System.out.println(c1.itens);

        // Só pra mostrar a relação bidirecional!!!
        double total = c1.itens.get(0).compra.itens.get(1).compra.getValorTotal();
        System.out.println("O total é R$" + total);
    }
}
