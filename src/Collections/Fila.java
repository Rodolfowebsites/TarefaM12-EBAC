package Collections;
import java.util.LinkedList;
import java.util.Queue;
public class Fila {
    public static void main(String args[]) {

        Queue<String> fila = new LinkedList<>();


        // Offer e add -> adicionam elementos na fila
        // Diferença é o comprtamente quando a fila está cheia!
        // .add retorna um problema, uma exceção.
        // .offer retorna um valor falso
        fila.add("Ana"); // retorna false
        fila.offer("Bia"); // Lança uma exceção
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafael");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        // Diferença é do comportamento ocorre
        // quabndo a fila está vazia!
        System.out.println(fila.peek()); // retorna Null
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção
        System.out.println(fila.element());

       // fila.isEmpty();
       // fila.size();
       // fila.clear();


        // Poll e remove -> obter o próximo elemento
        // da fila e remove!

        // Diferença é o comportamento ocorre
        // quando a fila está vazia!
        System.out.println(fila.poll()); // retorna false
        System.out.println(fila.poll()); // Lança uma exceção
        System.out.println(fila.remove());
    }
}
