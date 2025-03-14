package aulas;
import java.util.Scanner;

//Entrada e saída de dados;
public class Aula03 {
    public static void main(String[] args) {
        Scanner leitorDeDados = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = leitorDeDados.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.print("Informe seu saldo: ");
        double saldo = leitorDeDados.nextDouble();
        System.out.println("Seu saldo é: " + saldo);

        System.out.print("Informe seu saldo: ");
        char genero = leitorDeDados.next().charAt(0);
        System.out.println("Seu saldo é: " + saldo);

        System.out.print("Informe seu saldo: ");
        String nome = leitorDeDados.next();
        System.out.println("Seu saldo é: " + saldo);
        leitorDeDados.close();
    }
}