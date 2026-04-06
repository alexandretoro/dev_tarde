/*
 * Exercício 11 - Estruturas de Decisão I
 *
 * Desenvolva um programa que receba o salário de um funcionário e determine
 * o reajuste segundo o seguinte critério:
 *   Até R$ 1.000,00       → aumento de 20%
 *   Até R$ 1.700,00       → aumento de 15%
 *   Até R$ 2.300,00       → aumento de 10%
 *   Acima de R$ 2.300,00  → aumento de 5%
 *
 * Exibir: salário antes do reajuste, percentual de aumento,
 * valor do aumento e novo salário.
 *
 * Exemplo:
 *   Salário digitado: R$ 1.900,00
 *   Aumento         : 10%
 *   Valor do aumento: R$ 190,00
 *   Novo salário    : R$ 2.090,00
 */

import static java.lang.IO.*;

void main() {
    print("Digite o salário atual (R$): ");
    float salario = Float.parseFloat(readln());

    float percentual;

    if (salario <= 1000.00f) {
        percentual = 0.20f;
    } else if (salario <= 1700.00f) {
        percentual = 0.15f;
    } else if (salario <= 2300.00f) {
        percentual = 0.10f;
    } else {
        percentual = 0.05f;
    }

    float valorAumento = salario * percentual;
    float novoSalario  = salario + valorAumento;

    println("==============================");
    println(String.format("Salário digitado: R$ %.2f", salario));
    println(String.format("Aumento         : %.0f%%", percentual * 100));
    println(String.format("Valor do aumento: R$ %.2f", valorAumento));
    println(String.format("Novo salário    : R$ %.2f", novoSalario));
    println("==============================");
}
