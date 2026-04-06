/*
 * Exercício 8 - Estruturas de Decisão II
 *
 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
 *   Álcool:
 *     até 20 litros   → desconto de 3% por litro
 *     acima de 20L    → desconto de 5% por litro
 *   Gasolina:
 *     até 20 litros   → desconto de 4% por litro
 *     acima de 20L    → desconto de 6% por litro
 *
 * Tipo de combustível: A - Álcool  |  G - Gasolina
 * Preço do litro: Gasolina = R$ 4,95  |  Álcool = R$ 2,89
 *
 * Calcule e imprima o valor a ser pago pelo cliente.
 */

import static java.lang.IO.*;

void main() {
    print("Digite a quantidade de litros: ");
    float litros = Float.parseFloat(readln());

    print("Tipo de combustível (A-Álcool / G-Gasolina): ");
    String tipo = readln().toUpperCase();

    float precoLitro;
    float percentualDesconto;

    if (tipo.equals("A")) {
        precoLitro = 2.89f;
        percentualDesconto = (litros <= 20) ? 0.03f : 0.05f;
    } else if (tipo.equals("G")) {
        precoLitro = 4.95f;
        percentualDesconto = (litros <= 20) ? 0.04f : 0.06f;
    } else {
        println("Tipo de combustível inválido!");
        return;
    }

    float valorBruto    = litros * precoLitro;
    float valorDesconto = valorBruto * percentualDesconto;
    float valorFinal    = valorBruto - valorDesconto;

    println("==============================");
    println("Combustível    : " + (tipo.equals("A") ? "Álcool" : "Gasolina"));
    println(String.format("Quantidade     : %.2f L", litros));
    println(String.format("Preço por litro: R$ %.2f", precoLitro));
    println(String.format("Desconto       : %.0f%%", percentualDesconto * 100));
    println(String.format("Valor bruto    : R$ %.2f", valorBruto));
    println(String.format("Valor desconto : R$ %.2f", valorDesconto));
    println(String.format("Valor a pagar  : R$ %.2f", valorFinal));
    println("==============================");
}
