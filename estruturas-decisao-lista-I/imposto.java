/*
 * Exercício 9 - Estruturas de Decisão I
 *
 * Desenvolva um programa que leia o valor (R$) de um salário qualquer
 * e calcule e exiba o desconto com IRRF e INSS.
 *
 * Tabela INSS 2023:
 *   Até R$ 1.320,00               → 7,5%
 *   De R$ 1.320,01 a R$ 2.571,29  → 9%
 *   De R$ 2.571,30 a R$ 3.856,94  → 12%
 *   De R$ 3.856,95 a R$ 7.507,49  → 14%
 *   Acima de R$ 7.507,49          → teto: R$ 908,86
 *
 * Tabela IRRF 2023 (base = salário - INSS):
 *   Até R$ 1.903,98               → isento
 *   De R$ 1.903,99 a R$ 2.826,65  → 7,5%  − R$ 142,80
 *   De R$ 2.826,66 a R$ 3.751,05  → 15%   − R$ 354,80
 *   De R$ 3.751,06 a R$ 4.664,68  → 22,5% − R$ 636,13
 *   Acima de R$ 4.664,68          → 27,5%  − R$ 869,36
 */

import static java.lang.IO.*;

void main() {
    print("Digite o salário bruto (R$): ");
    float salario = Float.parseFloat(readln());

    // Cálculo do INSS
    float inss;
    if (salario <= 1320.00f) {
        inss = salario * 0.075f;
    } else if (salario <= 2571.29f) {
        inss = salario * 0.09f;
    } else if (salario <= 3856.94f) {
        inss = salario * 0.12f;
    } else if (salario <= 7507.49f) {
        inss = salario * 0.14f;
    } else {
        inss = 908.86f;
    }

    float baseIRRF = salario - inss;

    // Cálculo do IRRF
    float irrf;
    if (baseIRRF <= 1903.98f) {
        irrf = 0;
    } else if (baseIRRF <= 2826.65f) {
        irrf = baseIRRF * 0.075f - 142.80f;
    } else if (baseIRRF <= 3751.05f) {
        irrf = baseIRRF * 0.15f - 354.80f;
    } else if (baseIRRF <= 4664.68f) {
        irrf = baseIRRF * 0.225f - 636.13f;
    } else {
        irrf = baseIRRF * 0.275f - 869.36f;
    }

    float salarioLiquido = salario - inss - irrf;

    println("==============================");
    println(String.format("Salário bruto  : R$ %.2f", salario));
    println(String.format("Desconto INSS  : R$ %.2f", inss));
    println(String.format("Desconto IRRF  : R$ %.2f", irrf));
    println(String.format("Salário líquido: R$ %.2f", salarioLiquido));
    println("==============================");
}
