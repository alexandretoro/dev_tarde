/*
 * Exercício 10 - Estruturas de Decisão I
 *
 * Desenvolva um programa que pergunte em que turno você estuda.
 * Peça para digitar: M-Matutino ou V-Vespertino ou N-Noturno.
 * Imprima "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!".
 * Obs.: Somente letras maiúsculas para M, V ou N.
 */

import static java.lang.IO.*;

void main() {
    print("Em que turno você estuda? (M-Matutino / V-Vespertino / N-Noturno): ");
    String turno = readln();

    String mensagem = switch (turno) {
        case "M" -> "Bom Dia!";
        case "V" -> "Boa Tarde!";
        case "N" -> "Boa Noite!";
        default  -> "Valor Inválido!";
    };

    println(mensagem);
}
