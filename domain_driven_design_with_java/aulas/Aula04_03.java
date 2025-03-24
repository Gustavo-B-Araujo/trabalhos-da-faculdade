package aulas;

// Introdução: Programação Orientada à Objetos.;

// A classe se chama ContaCorrente, mas neste exemplo se chama Aula04_03 apenas por organização dos arquivos.
public class Aula04_03 {

    double saldo;

    Aula04_03(double saldo){
        this.saldo = saldo;
    };

    void saque(double valor){
        saldo = saldo - valor;
    };
    void deposito(double valor){
        saldo = saldo + valor;
    };

    double saldo(){
        return saldo;
    };
}