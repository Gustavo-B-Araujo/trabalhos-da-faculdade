package exercicios;
import java.util.Scanner;
/*
    Uma empresa precisa calcular o aumento de seus funcionários. E todos eles receberão aumento de 10%.
    Escreva um programa que receba:
        - o nome do funcionário
        - o salário que ele recebe atualmente
    A saída do programa deve ser a seguinte mensagem:
        Olá nomeDoFuncionario! Seu novo salário será de novoSalario.
*/

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nome_funcionario = scn.next();

        System.out.print("Informe o salário atual: ");
        double salario = scn.nextDouble();

        double aumento = 10;
        double salarioAjustado = ((salario * aumento) / 100) + salario;

        System.out.println("Funcionário: " + nome_funcionario);
        System.out.println("Novo salário: " + salarioAjustado);

        scn.close();
    }
}