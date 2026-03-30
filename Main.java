//12. Desenvolva um programa que leia quatro notas bimestrais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média final. A atribuição de conceitos obedece à tabela abaixo:
//Média de Aproveitamento  Conceito
//Entre 9.0 e 10.0        A
//Entre 7.5 e 8.9         B
//Entre 6.0 e 7.4         C
//Entre 4.0 e 5.9         D
//Entre zero e 3.9        E
//O programa deve exibir na tela:
//        1. As quatro notas bimestrais,
//  2. A média final,
//        3. O conceito correspondente e,
//  4. A mensagem "APROVADO" ou "Reprovado" de acordo com a regra a seguir:
//        4.1. Se o conceito       for A, B ou C    exibir "APROVADO"
//        4.2. Senão se o conceito for D ou E       exibir "REPROVADO"
//situacao_escolar.java


void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
