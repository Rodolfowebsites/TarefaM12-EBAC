package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

    @SuppressWarnings({"rawtypes", "unchecked", "SpellCheckingInspection"})
    public static void main (String args[]) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true); // boolean -> Boolean
        conjunto.add("Teste"); // String
        conjunto.add(1); //int -> Integer
        conjunto.add('x'); // char -> Character

        System.out.println("Tamanho do conjunto é: " + conjunto.size());

        conjunto.add("teste");
        System.out.println("Tamanho é: " + conjunto.size()); // Não pode ter nenhum dado repetido, nesse caso o teste é diferente de Teste

        System.out.println(conjunto.remove("teste"));
        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains('x'));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums); // União entre dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);


    }
}
