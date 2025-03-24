package aulas;
import aulas.Aula04_03;

// Instânciando um objeto feito na Aula04_03 - O objeto se chama Banco.;
public class Aula04_04 {

    public static void main(String[] args){
        Aula04_03 primeiraConta = new Aula04_03(500.00);
        System.out.println(primeiraConta.saldo());

        primeiraConta.deposito(500.0);
        System.out.println(primeiraConta.saldo());

        primeiraConta.saque(50.0);
        System.out.println(primeiraConta.saldo());
    };
}