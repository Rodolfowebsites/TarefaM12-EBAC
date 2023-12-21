package oo.composicao.desafio;

public class Sistema {

    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Notebook", 2000, 1);


        Cliente cliente = new Cliente("Rogéria Maria Célia do Vale");
        cliente.compras.add(compra1);
        System.out.println(cliente.obterValorTotal());

    }
}
