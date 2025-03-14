package aulas;
// Tipos primitivos de dados;

public class Aula02 {
    public static void main(String[] args) {
        int idade = 27;
        double salario = 1.0;
        char genero = 'M';
        boolean casado = true;
        String nome = "Gustavo";

        System.out.println(idade);
        System.out.println(salario);

        double salarioReajustado = salario * 1.1;

        System.out.println(salarioReajustado);
        System.out.println(salario / 100 * 10);
    }
}