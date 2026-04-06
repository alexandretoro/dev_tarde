/*
 * Exercício 6 - Estruturas de Decisão II
 *
 * Desenvolva um programa que receba uma string e exiba a mesma na tela.
 * Se o valor digitado for em branco, exibir 'Dado inválido'.
 */

import static java.lang.IO.*;

void main() {
    print("Digite um texto: ");
    String texto = readln();

    if (texto.isBlank()) {
        println("Dado inválido");
    } else {
        println(texto);
    }
}
