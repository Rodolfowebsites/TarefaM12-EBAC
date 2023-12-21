package Collections;

import java.util.ArrayList;

/**
 * List
 * Pode ser Heterogêneo :(
 * Pode ser homogêneo :)
 * Aceita OBJ. Duplicados
 * É ordenado
 * É indexado
 */

public class Lista {

    public static void main(String[]args) {
        ArrayList<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);
        lista.add(new Usuario("Carlos")); // Pode ser adicionado direto por esse metodo.
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Lucas"));
        lista.add(new Usuario("Rodolfo"));

        System.out.println(lista.get(3)); // .nome para ser o nome se não será a descrição do usuário.
// consegue acessar pelo indice.

        lista.remove(1);
        lista.remove(new Usuario("Bia"));

        for(Usuario u: lista){
            System.out.println(u);
        }
    }
}
// Foi impresso na ordem em que colocamos