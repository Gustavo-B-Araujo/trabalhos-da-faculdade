package exercicios;

/*
    A classe ContaCorrente já contém algumas operações. Entretanto, a equipe de produto do nosso banco entendeu que as
    contas corrente precisam ter rendimentos de 1% todo mes.

    - Crie um projeto novo no IntelliJ e copie e cole as classes Banco e ContaCorrente.
    - Implemente na ContaCorrente um método render() que não recebe parâmetro e não retorna nada. E, na classe Banco,
    chame esse método. Logo após, chame o método saldo() para confirmar se a conta rendeu de fato.
*/

public class Exercicio05_01 {

    double saldo;

    Exercicio05_01(double saldo){
        this.saldo = saldo;
    };

    void saque(double valor){
        saldo = saldo - valor;
    };
    void deposito(double valor){
        saldo = saldo + valor;
    };

    void render(){
        saldo = saldo * 1.01;
    };

    double saldo(){
        return saldo;
    };
}