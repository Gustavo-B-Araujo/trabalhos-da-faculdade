package aulas;
import aulas.Aula04_01;

// Instânciando um objeto feito na Aula04_01 - O objeto se chama Usuario.;
public class Aula04_02 {

    public static void main(String[] args){
        Aula04_01 user = new Aula04_01(27, 1000.00, 'M', true, "Gustavo");
        user.exibirInformacoes();
    };
}