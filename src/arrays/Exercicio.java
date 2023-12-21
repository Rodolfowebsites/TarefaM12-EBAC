package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {

        double[] notasAlunoA = new double[4];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 8.8;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);
        //System.out.println(notasAlunoA[4]); ERRO! Tetando acesso dados que estão além do limite do array.

        System.out.println(notasAlunoA);
        // o resultado aqui foi estranho pois precisamos chamar a classe Arrays da biblioteca java.util
        //antes de salvar os valores, os valores são inicializados com os valores padrão dos tipos.
        System.out.println(Arrays.toString(notasAlunoA));

        // Percorrer o array
        // Para poder otimizar esse código podemos usar o metodo .length assim podemos ter acesso ao tamanho
        // do array sem precisar ficar atualizando os números de dentro dele no indice.
        double totalAlunoA = 0;
        for(int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }
        System.out.println(totalAlunoA / notasAlunoA.length);// o tamanho do array está sendo usado para ser a referência.
        // aqui ele vai dar uma média maior do que 10 o que é errado. precisamos usar o tamanho do array para poder ter uma média correta para isso podemos substituir o tamanho 3 para o tamanho do array que agora são 4 indices.
        // Agora temos um código a prova de alterações.

        double[] notasAlunoB = { 6.6, 8.9, 5.5, 10 };

        double totoalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totoalAlunoB += notasAlunoB[i];
        }
        System.out.println(totoalAlunoB / notasAlunoB.length);
    }

}
