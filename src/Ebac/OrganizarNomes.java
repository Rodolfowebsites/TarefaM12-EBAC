import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class OrganizarNomes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> nomesPorGenero = new HashMap<>();

        // Leitura dos nomes até que o usuário entre com "fim"
        while (true) {
            System.out.print("Digite o nome e o gênero separados por vírgula (ou 'fim' para encerrar): ");
            String entrada = scanner.nextLine();

            // Verifica se o usuário quer encerrar a entrada
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            // Divide a entrada em nome e gênero
            String[] partes = entrada.split(", ");
            if (partes.length == 2) {
                String nome = partes[0];
                String genero = partes[1];

                // Adiciona o nome à lista do respectivo gênero
                nomesPorGenero.computeIfAbsent(genero, k -> new ArrayList<>()).add(nome);
            } else {
                System.out.println("Formato inválido. Use: Nome-Gênero");
            }
        }

        // Ordena os nomes em cada lista por gênero
        ordenarNomesPorGenero(nomesPorGenero);

        // Imprime os nomes separados por gênero e em ordem alfabética
        imprimirNomesPorGenero(nomesPorGenero);

        scanner.close();
    }

    private static void ordenarNomesPorGenero(Map<String, List<String>> nomesPorGenero) {
        // Ordena os nomes em cada lista por gênero
        for (List<String> lista : nomesPorGenero.values()) {
            Collections.sort(lista);
        }
    }

    private static void imprimirNomesPorGenero(Map<String, List<String>> nomesPorGenero) {
        System.out.println("\nNomes Femininos:");
        imprimirLista(nomesPorGenero.getOrDefault("F", new ArrayList<>()));

        System.out.println("\nNomes Masculinos:");
        imprimirLista(nomesPorGenero.getOrDefault("M", new ArrayList<>()));
    }

    private static void imprimirLista(List<String> lista) {
        for (String nome : lista) {
            System.out.println(nome);
        }
    }
}
