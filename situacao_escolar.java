//12. Desenvolva um programa que leia quatro notas bimestrais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média final. A atribuição de conceitos obedece à tabela abaixo:
//Média de Aproveitamento  Conceito
//Entre 9.0 e 10.0        A
//Entre 7.5 e 8.9         B
//Entre 6.0 e 7.4         C
//Entre 4.0 e 5.9         D
//Entre zero e 3.9        E
//O programa deve exibir na tela:
//        1. As quatro notas bimestrais,
//        2. A média final,
//        3. O conceito correspondente e,
//        4. A mensagem "APROVADO" ou "Reprovado" de acordo com a regra a seguir:
//        4.1. Se o conceito       for A, B ou C    exibir "APROVADO"
//        4.2. Senão se o conceito for D ou E       exibir "REPROVADO"
//situacao_escolar.java


import static java.lang.IO.*;

void main() {
    IO.print("Digite a primeira nota: ");
    float n1 = Float.parseFloat(readln());

    IO.print("Digite a segunda nota: ");
    float n2 = Float.parseFloat(readln());

    IO.print("Digite a terceira nota: ");
    float n3 = Float.parseFloat(readln());

    IO.print("Digite a quarta nota: ");
    float n4 = Float.parseFloat(readln());

    float mf = (n1 + n2 + n3 + n4) / 4;

    char conceito;
    String mensagem;

    if(mf <= 10 && mf >=9){
        conceito = 'A';
    } else if (mf <= 8.9 && mf >= 7.5) {
        conceito = 'B';
    } else if (mf <= 7.4 && mf >= 6) {
        conceito = 'C';
    } else if (mf <= 5.9 && mf >= 4) {
        conceito = 'E';
    }
    else {
        conceito = 'E';
    }
    if (conceito == 'A' || conceito == 'B' || conceito == 'C')
        mensagem = "aprovado";
    else
        mensagem = "reprovado";

    println("A primeira nota é = " + String.format("%.2f", n1) + " || A segunda nota é = " + String.format("%.2f", n2) + " || A terceira nota é = " + String.format("%.2f", n3) + " || A quarta nota é = " + String.format("%.2f", n4));
    println("A média final é: " + mf + " e você está " + mensagem);


}