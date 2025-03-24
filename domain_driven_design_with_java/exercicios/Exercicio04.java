package exercicios;
import java.util.Scanner;

/*
    Escreva um programa que receba como entrada um número e imprima como saída o seu antecessor e o seu sucessor.
*/

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Informe um Número inteiro para ver seu antecessor e seu sucessor: ");
        int numero = scn.nextInt();

        System.out.println("Seu antecessor: " + (numero - 1));
        System.out.println("Seu sucessor: " + (numero + 1));

        scn.close();
    }
}