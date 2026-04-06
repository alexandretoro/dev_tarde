/*
 * Exercício 3 - Estruturas de Decisão I
 *
 * Desenvolver um programa que leia o consumo de água para prédios comerciais
 * e industriais e exiba o valor (R$) da conta baseado nos seguintes cálculos:
 *   Se o consumo for menor ou igual a 10m3, então R$ 44,95 (valor fixo)
 *   Se o consumo for menor ou igual a 20m3, então R$ 8,75 por m3
 *   Se o consumo for menor ou igual a 50m3, então R$ 16,76 por m3
 *   Se o consumo for acima dos 50m3, então R$ 17,46 por m3
 */

import static java.lang.IO.*;

void main() {
    print("Digite o consumo de água em m³: ");
    float consumo = Float.parseFloat(readln());

    float valor;

    if (consumo <= 10) {
        valor = 44.95f;
    } else if (consumo <= 20) {
        valor = consumo * 8.75f;
    } else if (consumo <= 50) {
        valor = consumo * 16.76f;
    } else {
        valor = consumo * 17.46f;
    }

    println(String.format("Valor da conta: R$ %.2f", valor));
}
