/*
 * Exercício 3 - Estruturas de Decisão II
 *
 * Desenvolva um programa que pergunte a distância que um passageiro deseja
 * percorrer em km. Calcule o preço da passagem, cobrando:
 *   R$ 0,50 por km para viagens de até 200 km
 *   R$ 0,45 por km para viagens acima de 200 km
 */

import static java.lang.IO.*;

void main() {
    print("Digite a distância da viagem em km: ");
    float distancia = Float.parseFloat(readln());

    float preco;
    if (distancia <= 200) {
        preco = distancia * 0.50f;
    } else {
        preco = distancia * 0.45f;
    }

    println(String.format("Distância        : %.1f km", distancia));
    println(String.format("Preço da passagem: R$ %.2f", preco));
}
