package Desafio;

import java.io.PrintStream;

public class Data {
    int dia = 1;
    int mes = 1;
    int ano = 1970;


    Data(){

    }
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada() {
        return String.format("%d/%d/%d\n",dia, mes, ano);// os valores que serão guardados nas variaveis, dia, mes, ano, serão formatados dessa forma.
    }
}
