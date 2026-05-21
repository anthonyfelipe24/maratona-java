package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado.
    // Condição valorParcela >= 1000.
    public static void main(String[] args) {
        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal; parcela++) {

            double valorParcela = valorTotal / parcela;

            if (valorParcela < 1000) {
                break;
            }
            System.out.println("parcela " + parcela + " R$ " + valorParcela);
        }
       /* Forma mental simples
        Papel de cada parte
        Parte	Função
        for	testa várias parcelas
        divisão calcula valor da parcela
        if	verifica limite
        break	interrompe quando ficar abaixo de 1000

        "Enquanto a parcela for >= 1000 continua"

          Quando ficar menor:

            break*/
    }
}
