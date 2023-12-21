package oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro(); // Instanciando o carro.
        System.out.println(c1.estaLigado()); // False porque por padrão está desligado

        c1.ligar(); // agora chamei o metodo ligar que é true
        System.out.println(c1.estaLigado());

        System.out.println(c1.motor.giros());

        c1.acelerar(); // Metodo para acelerar o motor adicionando 0.4 no fator de injeção * giros que é 3000.
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        // Fatou encapsulamento!!!
        // c1.motor.fatorInjecao = -30;

        System.out.println(c1.motor.giros());

        System.out.println(c1.motor.carro.motor.giros()); // Relação bidirecional

        System.out.println(c1.nEstaLimpando());

        System.out.println(c1.motor.carro.estaLimpando());

        System.out.println(c1.nEstaLimpando());

    }
}
