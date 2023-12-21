package Ebac;

public class ClasseTeste {
    public static void main(String[] args) {
        ICaneta caneta = new CanetaEsferografica();

        caneta.escrever("Olá Rodolfo");
        caneta.escreverComumATodas();
        System.out.println(caneta.getCor());

        ICaneta giz = new GIz();
        giz.escrever("Olá, meu fi");
        System.out.println(giz.getCor());

        ICaneta lapis = new Lapis();
        lapis.escrever("Oi meus queridas");
        System.out.println(lapis.getCor());
    }
}
