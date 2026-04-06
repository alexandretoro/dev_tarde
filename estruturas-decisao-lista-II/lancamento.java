/*
 * Exercício 12 - Estruturas de Decisão II
 *
 * Desenvolva um programa para escrever a contagem regressiva do lançamento
 * de um foguete. O programa deve imprimir 10, 9, 8, ..., 1, 0 e 'Ignição!'
 */

import static java.lang.IO.*;

void main() {
    for (int i = 10; i >= 0; i--) {
        println(i);
    }
    println("Ignição!");
}
