/*
 * Exercício 5 - Estruturas de Decisão II
 *
 * Na última Black Friday, o gerente de uma loja de perfumes colocou todo
 * o seu estoque em promoção conforme a tabela:
 *   Código  Condição de Pagamento      Desconto (%)
 *   1       À vista (em espécie)       10%
 *   2       Cartão de débito           5%
 *   3       Cartão de crédito          3%
 *   4       PIX                        7,5%
 *
 * Solicite o preço total da venda e a forma de pagamento.
 * Informe o valor final a ser pago.
 */

import static java.lang.IO.*;

void main() {
    print("Digite o preço total da venda (R$): ");
    float preco = Float.parseFloat(readln());

    println("Formas de pagamento:");
    println("1 - À vista (em espécie) → 10% de desconto");
    println("2 - Cartão de débito     →  5% de desconto");
    println("3 - Cartão de crédito    →  3% de desconto");
    println("4 - PIX                  →  7,5% de desconto");
    println("Escolha a forma de pagamento: ");
    int forma = Integer.parseInt(readln());

    float desconto = switch (forma) {
        case 1 -> 0.10f;
        case 2 -> 0.05f;
        case 3 -> 0.03f;
        case 4 -> 0.075f;
        default -> -1f;
    };

    if (desconto < 0) {
        print("Forma de pagamento inválida!");
    } else {
        float valorDesconto = preco * desconto;
        float valorFinal    = preco - valorDesconto;
        println("==============================");
        println(String.format("Preço original : R$ %.2f", preco));
        println(String.format("Desconto (%.1f%%): R$ %.2f", desconto * 100, valorDesconto));
        println(String.format("Valor final    : R$ %.2f", valorFinal));
        println("==============================");
    }
}
