/*
 * Exercício 8 - Estruturas de Decisão I
 *
 * Desenvolva uma calculadora que receba dois números e efetue uma das
 * seguintes operações aritméticas:
 *   1 - Adição
 *   2 - Subtração
 *   3 - Multiplicação
 *   4 - Divisão
 *   5 - Potência
 *   6 - Raiz quadrada  (usa apenas o primeiro número)
 *   7 - Número par     (usa apenas o primeiro número)
 *   8 - Número ímpar   (usa apenas o primeiro número)
 */

import static java.lang.IO.*;

void main() {
    println("=== CALCULADORA BÁSICA ===");
    println("1 - Adição");
    println("2 - Subtração");
    println("3 - Multiplicação");
    println("4 - Divisão");
    println("5 - Potência");
    println("6 - Raiz quadrada");
    println("7 - Número par");
    println("8 - Número ímpar");
    
    
    print("Escolha uma opção: ");
    int opcao = Integer.parseInt(readln());

    print("Digite o primeiro número: ");
    float num1 = Float.parseFloat(readln());

    float num2 = 0;
    if (opcao >= 1 && opcao <= 5) {
        print("Digite o segundo número: ");
        num2 = Float.parseFloat(readln());
    }

    switch (opcao) {
        case 1 -> println(String.format("Resultado: %.2f", num1 + num2));
        case 2 -> println(String.format("Resultado: %.2f", num1 - num2));
        case 3 -> println(String.format("Resultado: %.2f", num1 * num2));
        case 4 -> {
            if (num2 == 0) {
                println("Erro: divisão por zero!");
            } else {
                println(String.format("Resultado: %.2f", num1 / num2));
            }
        }
        case 5 -> println(String.format("Resultado: %.2f", (float) Math.pow(num1, num2)));
        case 6 -> {
            if (num1 < 0) {
                println("Erro: não é possível calcular raiz de número negativo.");
            } else {
                println(String.format("Raiz quadrada de %.2f = %.2f", num1, (float) Math.sqrt(num1)));
            }
        }
        case 7 -> {
            if ((int) num1 % 2 == 0) {
                println(String.format("%.0f é PAR.", num1));
            } else {
                println(String.format("%.0f NÃO é par.", num1));
            }
        }
        case 8 -> {
            if ((int) num1 % 2 != 0) {
                println(String.format("%.0f é ÍMPAR.", num1));
            } else {
                println(String.format("%.0f NÃO é ímpar.", num1));
            }
        }
        default -> println("Opção inválida!");
    }
}
