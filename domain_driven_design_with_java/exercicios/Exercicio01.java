package exercicios;

/*
    Uma transportadora precisa comprar veículos utilitários de transporte, entre eles um
    caminhão simples, um bitrem, um furgão e um VUC (veículo urbano de carga). Sabendo que
    eles custam respectivamente R$200.000,00, R$400.000,00, R$100.000,00 e R$100.000,00,
    escreva um programa que calcule e impria o total ser gasto pela empresa.

    Dica: crie variáveis para cada um dos veículos, crie outra variável onde seja feita a soma
    e, ao final, imprima a variável onde foi feita a soma.
*/

public class Exercicio01 {
    public static void main(String[] args){
        double simples = 200000.00;
        double bitrem = 400000.00;
        double furgao = 100000.00;
        double vuc = 100000.00;
        double total = simples + bitrem + furgao + vuc;

        System.out.println("Total a ser pago pela empresa: " + total);
    }
}