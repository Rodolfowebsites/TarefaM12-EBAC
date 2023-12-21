package arrays;
// Percorrer um array sem precisar usar um numero

public class Foreach {
    public static void main(String args[]) {

        double[] notas = { 9.9 , 8.7, 7.2, 9.4 };

        for(int i = 0; i < notas.length; i++) { // int i começa com valendo 0 logo depois é feito a comparação entre o int i e o tamanho do array e em seguida é feito a lógica de acrescentar mais 1 enquanto o int i for menor do que o array.
            System.out.print(notas[i]);
        }
        System.out.println();
        for(double nota: notas) { // Estrutura do foreach: for, nome da variavel : notas nome da variavél
            System.out.print(nota); // Aqui segue a mesma lógica para cada elemento fazendo o laço de repetição.
        }
    }
}
