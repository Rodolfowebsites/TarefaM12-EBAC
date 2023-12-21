package arrays;
import java.util.Arrays;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas notas: ");

        int qtdeNotas = entrada.nextInt(); // Aqui é feita a atribuição da quantidade de notas a uma variavel
        System.out.println("A quantidade informado foi: " + qtdeNotas);

        double[] notas = new double[qtdeNotas];// Aqui está iniciando  o array e está sendo atribuido o tamanho dele pegando o valor de atdeNotas que foi informado

        for(int i = 0; i < notas.length; i++) { // aqui é a estrutura de repetição com o tamanho definido por notas.length
            System.out.println("Informe a nota " + ( i + 1) + ": ");// for para perguntar a quantidade de notas e colocar dentro do array
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for(double nota: notas) {
            total += nota;
        }

        double media = total / notas.length; // Aqui está sendo atribuido o tamanho do array como parametro para ser o divisor das notas
        System.out.println("A média é " + media + "!");
        //System.out.println(Arrays.toString(notas));

        entrada.close();

    }
}
