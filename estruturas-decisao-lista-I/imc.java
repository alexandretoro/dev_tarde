/*
 * Exercício 5 - Estruturas de Decisão I
 *
 * Desenvolver um programa que leia o peso e a altura de uma pessoa e calcule
 * seu IMC utilizando a fórmula: imc = peso / (altura * altura)
 * Classificações:
 *   IMC < 16              → 'Magreza grave'
 *   16  a < 17            → 'Magreza moderada'
 *   17  a < 18,5          → 'Magreza leve'
 *   18,5 a < 25           → 'Saudável'
 *   25  a < 30            → 'Sobrepeso'
 *   30  a < 35            → 'Obesidade Grau I'
 *   35  a < 40            → 'Obesidade Grau II (severa)'
 *   >= 40                 → 'Obesidade Grau III (mórbida)'
 */

import static java.lang.IO.*;

void main() {
    print("Digite seu peso em kg: ");
    float peso = Float.parseFloat(readln());

    print("Digite sua altura em metros (ex: 1.75): ");
    float altura = Float.parseFloat(readln());

    float imc = peso / (altura * altura);

    String classificacao;

    if (imc < 16) {
        classificacao = "Magreza grave";
    } else if (imc < 17) {
        classificacao = "Magreza moderada";
    } else if (imc < 18.5f) {
        classificacao = "Magreza leve";
    } else if (imc < 25) {
        classificacao = "Saudável";
    } else if (imc < 30) {
        classificacao = "Sobrepeso";
    } else if (imc < 35) {
        classificacao = "Obesidade Grau I";
    } else if (imc < 40) {
        classificacao = "Obesidade Grau II (severa)";
    } else {
        classificacao = "Obesidade Grau III (mórbida)";
    }

    println(String.format("Seu IMC: %.2f", imc));
    println("Classificação: " + classificacao);
}
