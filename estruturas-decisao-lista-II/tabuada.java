/*
 * Exercício 10 - Estruturas de Decisão II
 *
 * Desenvolver um programa que calcule e exiba a tabuada de 1 a 10
 * de um número qualquer.
 *
 * Exemplo:
 *   ******************************
 *   Informe o número da tabuada: 5
 *   ******************************
 *   1 x 5 = 5
 *   2 x 5 = 10
 *   ...
 *   10 x 5 = 50
 */

import static java.lang.IO.*;

void main() {
    println("******************************");
    print("Informe o número da tabuada: ");
    int numero = Integer.parseInt(readln());
    println("******************************");

    for (int i = 1; i <= 10; i++) {
        println(i + " x " + numero + " = " + (i * numero));
    }
}
