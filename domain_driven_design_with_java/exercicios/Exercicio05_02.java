package exercicios;

// Instância criada a partir da classe criada em Exercicio05_01.;
public class Exercicio05_02 {
    public static void main(String[] args){
        Exercicio05_01 conta = new Exercicio05_01(1000.00);
        System.out.println(conta.saldo());

        conta.render();
        System.out.println(conta.saldo());
    };
}