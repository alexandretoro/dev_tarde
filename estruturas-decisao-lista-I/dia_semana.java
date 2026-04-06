/*
 * Exercício 4 - Estruturas de Decisão I
 *
 * Desenvolver um programa que leia um número de 1 a 7 e exiba o dia da semana:
 *   1 - 'Domingo'
 *   2 - 'Segunda'
 *   3 - 'Terça'
 *   4 - 'Quarta'
 *   5 - 'Quinta'
 *   6 - 'Sexta'
 *   7 - 'Sábado'
 * Qualquer outro número exibir: 'Opção inválida!'
 */

import static java.lang.IO.*;

void main() {
    print("Digite um número de 1 a 7: ");
    int numero = Integer.parseInt(readln());

    String dia = switch (numero) {
        case 1 -> "Domingo";
        case 2 -> "Segunda";
        case 3 -> "Terça";
        case 4 -> "Quarta";
        case 5 -> "Quinta";
        case 6 -> "Sexta";
        case 7 -> "Sábado";
        default -> "Opção inválida!";
    };

    println(dia);
}
