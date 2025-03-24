package aulas;

// Introdução: Programação Orientada à Objetos.;

// A classe se chama CadastroDeUsuario, mas neste exemplo se chama Aula04_01 apenas por organização dos arquivos.
public class Aula04_01 {
        int idade;
        double salario;
        char genero;
        boolean casado;
        String nome;

        Aula04_01(int idade, double salario, char genero, boolean casado, String nome){
            this.idade = idade;
            this.salario = salario;
            this.genero = genero;
            this.casado = casado;
            this.nome = nome;
        }

        void exibirInformacoes() {
            System.out.println("Informações da pessoa: \n" +
                    "Nome: " + nome
                    + ", idade: " + idade
                    + ", Salário: " + salario
                    +  ", Genero: " + genero
                    + ", Casado: " + casado);
        }
}