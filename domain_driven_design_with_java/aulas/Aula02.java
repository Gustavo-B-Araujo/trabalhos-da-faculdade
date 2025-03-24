package aulas;

// Tipos primitivos de variáveis e saída de dados;

public class Aula02 {
    public static void main(String[] args) {
        int idade = 27;
        double salario = 1000.0;
        char genero = 'M';
        boolean casado = true;
        String nome = "Gustavo";

        System.out.println(idade);
        System.out.println(salario);

        double salarioReajustado = salario * 1.1;

        System.out.print("Funcionário: " + nome + " | ");
        System.out.println("Idade: " + idade);

        System.out.println("Salário atual: " + salario / 100 * 10);
        System.out.println("Salário reajustado: " + salarioReajustado);
    }
}