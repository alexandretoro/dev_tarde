/*
 * Exercício 1 - Estruturas de Decisão II
 *
 * Desenvolva um programa que pergunte a velocidade do carro de um usuário.
 * Se a velocidade ultrapassar 80 km/h, exiba uma mensagem dizendo que o
 * usuário foi multado. Nesse caso, exiba o valor da multa cobrando
 * R$ 50,00 por cada km acima de 80 km/h.
 *
 * Exemplo:
 *   Digite a velocidade em Km/h: 85
 *   Limite = 80Km/h
 *   Excedeu 5Km/h
 *   multa = 5Km/h * R$ 50,00
 *   Valor da multa: R$ 250,00
 */

import static java.lang.IO.*;

void main() {
    print("Digite a velocidade em Km/h: ");
    float velocidade = Float.parseFloat(readln());

    int limite = 80;

    if (velocidade > limite) {
        float excesso = velocidade - limite;
        float multa   = excesso * 50.00f;

        println("Você foi multado!");
        println("Limite = " + limite + "Km/h");
        println(String.format("Excedeu %.0fKm/h", excesso));
        println(String.format("multa = %.0fKm/h * R$ 50,00", excesso));
        println(String.format("Valor da multa: R$ %.2f", multa));
    } else {
        println("Velocidade dentro do limite. Boa viagem!");
    }
}
