/*
 * Exercício 6 - Estruturas de Decisão I
 *
 * Desenvolva um programa que peça os 3 lados de um triângulo.
 * O programa deverá informar se os valores podem formar um triângulo e,
 * se formarem, exibir se é equilátero, isósceles ou escaleno.
 *
 * Três lados formam um triângulo quando a soma de quaisquer dois lados
 * for maior que o terceiro:
 *   Triângulo Equilátero: três lados iguais
 *   Triângulo Isósceles:  quaisquer dois lados iguais
 *   Triângulo Escaleno:   três lados diferentes
 */

import static java.lang.IO.*;

void main() {
    print("Digite o lado A: ");
    float a = Float.parseFloat(readln());

    print("Digite o lado B: ");
    float b = Float.parseFloat(readln());

    print("Digite o lado C: ");
    float c = Float.parseFloat(readln());

    boolean ehTriangulo = (a + b > c) && (a + c > b) && (b + c > a);

    if (!ehTriangulo) {
        println("Os valores informados NÃO formam um triângulo.");
    } else if (a == b && b == c) {
        println("Triângulo EQUILÁTERO (três lados iguais).");
    } else if (a == b || a == c || b == c) {
        println("Triângulo ISÓSCELES (dois lados iguais).");
    } else {
        println("Triângulo ESCALENO (três lados diferentes).");
    }
}
