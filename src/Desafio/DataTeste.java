package Desafio;

public class DataTeste {
    public static void main(String[] args) {

        Data d1 = new Data(9,2,1995);// Os valores que estão guardados aqui sairão formatados por causa do metodo "Obterdataformatada"
        Data d2 = new Data(15, 9, 2015);
        Data d3 = new Data(27, 9, 1975);
        Data d4 = new Data();



        System.out.printf(d1.obterDataFormatada());
        System.out.printf(d2.obterDataFormatada());
        System.out.printf(d3.obterDataFormatada());
        System.out.printf(d4.obterDataFormatada());

    }
}
