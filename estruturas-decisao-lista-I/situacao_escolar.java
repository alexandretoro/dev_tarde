/*
 * Exercício 12 - Estruturas de Decisão I
 *
 * Desenvolva um programa que leia quatro notas bimestrais de um aluno e
 * calcule a média final. Atribua um conceito conforme a tabela:
 *   Entre 9.0 e 10.0 → A
 *   Entre 7.5 e 8.9  → B
 *   Entre 6.0 e 7.4  → C
 *   Entre 4.0 e 5.9  → D
 *   Entre 0   e 3.9  → E
 *
 * Exibir: as quatro notas, a média final, o conceito e
 * "APROVADO" (conceito A, B ou C) ou "REPROVADO" (conceito D ou E).
 */

import static java.lang.IO.*;

void main() {
    print("Digite a nota do 1º bimestre: ");
    float n1 = Float.parseFloat(readln());

    print("Digite a nota do 2º bimestre: ");
    float n2 = Float.parseFloat(readln());

    print("Digite a nota do 3º bimestre: ");
    float n3 = Float.parseFloat(readln());

    print("Digite a nota do 4º bimestre: ");
    float n4 = Float.parseFloat(readln());

    float media = (n1 + n2 + n3 + n4) / 4;

    String conceito;
    if (media >= 9.0f) {
        conceito = "A";
    } else if (media >= 7.5f) {
        conceito = "B";
    } else if (media >= 6.0f) {
        conceito = "C";
    } else if (media >= 4.0f) {
        conceito = "D";
    } else {
        conceito = "E";
    }

    String situacao = (conceito.equals("A") || conceito.equals("B") || conceito.equals("C"))
            ? "APROVADO"
            : "REPROVADO";

    println("==============================");
    println(String.format("Notas: %.1f  %.1f  %.1f  %.1f", n1, n2, n3, n4));
    println(String.format("Média final: %.2f", media));
    println("Conceito   : " + conceito);
    println(situacao);
    println("==============================");
}
