package academy.devdojo.maratonajava.introducao;
/*
prática
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no <endereço>, confirmo que recebi o salário de <salario>, na data <data>.
*/

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Anthony Felipe";
        String endereco = "Rua Nova";
        double salario = 2000.54;
        String dataRecebimentoSalario = "12/02/2026";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salário "+salario+", na data "+dataRecebimentoSalario+".";
        System.out.printf(relatorio);


    }
}
