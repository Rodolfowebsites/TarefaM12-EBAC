package Ebac;

public class CanetaEsferografica implements ICaneta{



    public void escrever(String texto) {
        System.out.println("Escrevendo o valor " + texto + " na classe " + getClass().getSimpleName());
    }


    public String getCor() {
        return "Preto";
    }
}
