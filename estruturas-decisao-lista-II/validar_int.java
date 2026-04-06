/*
 * Exercício 7 - Estruturas de Decisão II
 *
 * Desenvolva um programa que receba um inteiro e exiba o mesmo na tela.
 * Se o valor digitado for em branco (ou não for um número inteiro válido),
 * exibir 'Dado inválido'.
 */

import static java.lang.IO.*;

void main() {
    print("Digite um número inteiro: ");
    String entrada = readln();

    if (entrada.isBlank()) {
        println("Dado inválido");
    } else {
        try {
            int numero = Integer.parseInt(entrada.trim());
            println(String.valueOf(numero));
        } catch (NumberFormatException e) {
            println("Dado inválido");
        }
    }
}
