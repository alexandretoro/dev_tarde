/*
 * Exercício 7 - Estruturas de Decisão I
 *
 * Desenvolva um programa que exiba na tela um menu de opções:
 *   1 - Opção 1
 *   2 - Opção 2
 *   3 - Opção 3
 *   4 - Sair
 * Se digitar 1 → 'Você selecionou a opção 1'
 * Se digitar 2 → 'Você selecionou a opção 2'
 * Se digitar 3 → 'Você selecionou a opção 3'
 * Se digitar 4 → 'Você selecionou sair'
 * Outro valor  → 'Opção inválida!!!'
 * Exibir no final: 'Fim do programa!'
 */

import static java.lang.IO.*;

void main() {
    println("1 - Opção 1");
    println("2 - Opção 2");
    println("3 - Opção 3");
    println("4 - Sair");
    print("Digite uma opção: ");
    int opcao = Integer.parseInt(readln());

    switch (opcao) {
        case 1 -> println("Você selecionou a opção 1");
        case 2 -> println("Você selecionou a opção 2");
        case 3 -> println("Você selecionou a opção 3");
        case 4 -> println("Você selecionou sair");
        default -> println("Opção inválida!!!");
    }

    println("Fim do programa!");
}
