/*
 * Exercício 4 (segundo) - Estruturas de Decisão II
 *
 * Suponha que o professor Atila possua dois logins na rede do SENAI-SP.
 * Construa um programa que valide o acesso do professor à rede.
 * Se o par usuário/senha estiver correto → "Seja bem vindo!"
 * Caso contrário → "Usuário e senha não conferem"
 *
 * Dados dos dois logins:
 *   login 1: usuário = atila  / senha = 12345
 *   login 2: usuário = olivi  / senha = 54321
 */

import static java.lang.IO.*;

void main() {
    print("Usuário: ");
    String usuario = readln();

    print("Senha: ");
    String senha = readln();

    boolean login1 = usuario.equals("atila") && senha.equals("12345");
    boolean login2 = usuario.equals("olivi") && senha.equals("54321");

    if (login1 || login2) {
        println("Seja bem vindo!");
    } else {
        println("Usuário e senha não conferem");
    }
}
