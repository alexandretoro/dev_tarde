/*
 * Exercício 2 - Estruturas de Decisão II
 *
 * Desenvolva um programa que leia três números e imprima:
 *   2.1 o maior
 *   2.2 o menor
 *   2.3 a soma
 *   2.4 a média
 *
 * Exemplo:
 *   num1 = 5   num2 = 3   num3 = 10
 *   **********
 *   maior = 10
 *   menor = 3
 *   soma  = 18
 *   media = 6
 */

import static java.lang.IO.*;

void main() {
    print("Digite o primeiro número: ");
    float num1 = Float.parseFloat(readln());

    print("Digite o segundo número: ");
    float num2 = Float.parseFloat(readln());

    print("Digite o terceiro número: ");
    float num3 = Float.parseFloat(readln());

    float maior = Math.max(num1, Math.max(num2, num3));
    float menor = Math.min(num1, Math.min(num2, num3));
    float soma  = num1 + num2 + num3;
    float media = soma / 3;

    println(String.format("num1 = %.0f   num2 = %.0f   num3 = %.0f", num1, num2, num3));
    println("**********");
    println(String.format("maior = %.0f", maior));
    println(String.format("menor = %.0f", menor));
    println(String.format("soma  = %.0f", soma));
    println(String.format("media = %.2f", media));
}
