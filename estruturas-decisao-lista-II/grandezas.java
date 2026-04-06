/*
 * Exercício 4 - Estruturas de Decisão II
 *
 * Uma empresa necessita de um programa que auxilie eletricistas no cálculo
 * das principais grandezas da Eletricidade: Tensão, Resistência e Corrente.
 * Fórmula: U = R * I
 *   U = Tensão (V), R = Resistência (Ω), I = Corrente (A)
 *
 * Menu:
 *   1. Tensão (em Volt)      → U = R * I
 *   2. Resistência (em Ohm)  → R = U / I
 *   3. Corrente (em Ampére)  → I = U / R
 *   4. Sair do programa
 * Opção diferente de 1 a 4 → 'Opção inválida!'
 */

import static java.lang.IO.*;

void main() {
    println("******************************");
    println("CÁLCULO DE GRANDEZAS ELÉTRICAS");
    println("******************************");
    println("1. Tensão (em Volt)");
    println("2. Resistência (em Ohm)");
    println("3. Corrente (em Ampére)");
    println("4. Sair do programa");
    println("******************************");
    print("Qual grandeza deseja calcular? ");
    int opcao = Integer.parseInt(readln());

    switch (opcao) {
        case 1 -> {
            print("Digite a Resistência em Ohm (Ω): ");
            float r = Float.parseFloat(readln());
            print("Digite a Corrente em Ampére (A): ");
            float i = Float.parseFloat(readln());
            print(String.format("Tensão (U) = %.2f V", r * i));
        }
        case 2 -> {
            print("Digite a Tensão em Volt (V): ");
            float u = Float.parseFloat(readln());
            print("Digite a Corrente em Ampére (A): ");
            float i = Float.parseFloat(readln());
            if (i == 0) {
                println("Erro: a corrente não pode ser zero.");
            } else {
                println(String.format("Resistência (R) = %.2f Ohms(Ω)", u / i));
            }
        }
        case 3 -> {
            print("Digite a Tensão em Volt (V): ");
            float u = Float.parseFloat(readln());
            print("Digite a Resistência em Ohm (Ω): ");
            float r = Float.parseFloat(readln());
            if (r == 0) {
                println("Erro: a resistência não pode ser zero.");
            } else {
                println(String.format("Corrente (I) = %.2f A", u / r));
            }
        }
        case 4 -> println("Encerrando o programa...");
        default -> println("Opção inválida!");
    }
}
