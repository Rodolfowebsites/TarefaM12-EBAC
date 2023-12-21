package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    double precoComDesconto(){// Não precisa de parametro pois no objeto já tem todos os dados que eu preciso.
        return preco * (1 - desconto);
    }
}
