/*
 * Exercício 9 - Estruturas de Decisão II
 *
 * Desenvolver um programa que leia cinco números e os exiba na tela.
 */

import static java.lang.IO.*;

void main() {
    float[] numeros = new float[5];

    for (int i = 0; i < 5; i++) {
        print("Digite o " + (i + 1) + "º número: ");
        numeros[i] = Float.parseFloat(readln());
    }

    println("==============================");
    println("Números digitados:");
    for (int i = 0; i < 5; i++) {
        println(String.format("  %dº: %.2f", i + 1, numeros[i]));
    }
    println("==============================");
}
