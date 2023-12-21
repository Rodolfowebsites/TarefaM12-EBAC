package oo.composicao;

public class Carro {

    Motor motor;

    Carro() {
        this.motor = new Motor(this); // EStou passando o proprio objeto atual como parametro (carro).
    }
   // Motor motor = new Motor(); // Instanciando o moto como atributor de instancia. como cada novo carro terá seu próprio motor então não serveria usar Static nesse exemplo pois ficaria o motor padrão para todos os carros.
    // Forma mais simples de instanciar o Motor.
    void acelerar() {
        if(motor.fatorInjecao < 2.6) {
            motor.fatorInjecao += 0.4; // Chamando o objeto motor e através da notação ponto chamo o fatordeInjecao
        }

    }
    void frear() {
        if(motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }

    }
    void ligar() { // Chamando através do atributo da classe motor
        motor.ligado = true;
    }
    void desligar() { // Agora o motor.ligado está desligado.
        motor.ligado = false;
    }
    boolean estaLigado() { // Por padrão está desligado
        return motor.ligado;
    }

    boolean nEstaLimpando() {
        return motor.limpar;
    }

    boolean estaLimpando() {
        if(!motor.limpar){
        }
        return true;
    }
}
