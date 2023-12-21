package Collections;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Set;



public class ConjuntoComportado {

    public static void main(String[]args) {

       // Set<String> listaAprovados = new HashSet<>();
        SortedSet<String> listaAprovados = new TreeSet<>(); // Ordenação baseada na ordem de inserção e está setado para receber apenas String. É um generico e expecifico.
        listaAprovados.add("Rodolfo");

        for(String candidato: listaAprovados) {
            System.out.println(candidato);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(1);
        nums.add(2);
        nums.add(120);

        for(int n: nums) {
            System.out.println(n);
        }
    }
}
