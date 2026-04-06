/*
 * Exercício 1 - Estruturas de Decisão I
 *
 * Desenvolver um programa que leia o consumo de água para uma residência social
 * e exiba o valor (R$) da conta baseado nos seguintes cálculos:
 *   Se o consumo for menor ou igual a 10m3, então R$ 7,59 (valor fixo)
 *   Se o consumo for menor ou igual a 20m3, então R$ 1,31 por m3
 *   Se o consumo for menor ou igual a 30m3, então R$ 4,64 por m3
 *   Se o consumo for menor ou igual a 50m3, então R$ 6,62 por m3
 *   Se o consumo for acima dos 50m3, então R$ 7,31 por m3
 */

import static java.lang.IO.*;

void main() {
    print("Digite o consumo de água em m³: ");
    float consumo = Float.parseFloat(readln());

    float valor;

    if (consumo <= 10) {
        valor = 7.59f;
    } else if (consumo <= 20) {
        valor = consumo * 1.31f;
    } else if (consumo <= 30) {
        valor = consumo * 4.64f;
    } else if (consumo <= 50) {
        valor = consumo * 6.62f;
    } else {
        valor = consumo * 7.31f;
    }

    println(String.format("Valor da conta: R$ %.2f", valor));
}
