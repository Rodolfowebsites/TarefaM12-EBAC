package oo.composicao;

public class Motor {

    Carro carro; // Nulo por padrão.

    Motor(Carro carro) {
        this.carro = carro;
    }

    boolean limpar = false;

    boolean ligado = false;
    double fatorInjecao = 1; // relacionado com o giro do motor. Quanto maior o fator, mais giros o motor terá.

    int giros() {
        if(!ligado) { // !ligado: significa "Se não estiver ligado" por isso que retorna 0 (zero).
            return 0;
        } else { // caso contrário, fará o calculo do fator de injeção vezes o giro. quanto mais acelera o carro.
            return (int) Math.round(fatorInjecao *3000); // é feito um cast para converter de double para inteiro.
        }                                                // E o Math.round serve para arredondar os valores mais próximos
    }
}
