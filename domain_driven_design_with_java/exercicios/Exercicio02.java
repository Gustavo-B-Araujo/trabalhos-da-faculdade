package exercicios;
import java.util.Scanner;

/*
    Escreva um programa que receba 3 números inteiros e calcule:
        - a média entre eles;
        - a multiplicação deles;
*/

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Primeiro número inteiro: ");
        int num1 = scn.nextInt();

        System.out.print("Segundo número inteiro: ");
        int num2 = scn.nextInt();

        System.out.print("Terceiro número inteiro: ");
        int num3 = scn.nextInt();

        double media = (num1 + num2 + num3) / 3;

        int multip = num1 * num2 * num3;

        System.out.println("Média: " + media);
        System.out.println("Multiplicação: " + multip);

        scn.close();
    }
}