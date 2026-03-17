package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    //            €0 – €34.712      → 9.70%
//                €34.713 – €68.507 → 37.35%
//                €68.508 ou mais   → 49.50%
    public static void main(String[] args) {
//        double salarioAnual = 70000;
//        double primeiraFaixa = 9.70 / 100;
//        double segundaFaixa = 37.35 / 100;
//        double terceiraFaixa = 49.50 / 100;
//
//        double valorImposto;
//        double taxaAplicada;
//
//        if (salarioAnual <= 34712) {
//            valorImposto = salarioAnual * primeiraFaixa;
//            taxaAplicada = primeiraFaixa;
//        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
//            valorImposto = salarioAnual * segundaFaixa;
//            taxaAplicada = segundaFaixa;
//        } else {
//            valorImposto = salarioAnual * terceiraFaixa;
//            taxaAplicada = terceiraFaixa;
//        }
//
//        System.out.println("Taxa aplicada: " + (taxaAplicada * 100) + "%");
//        System.out.println("Valor do imposto: " + valorImposto);

//        double nota = 6;
//        String resultado;
//        if (nota <= 4) {
//            resultado = "Ruim";
//        } else if (nota >= 5 && nota <= 6 ) {
//            resultado = "Regular";
//        } else if (nota >= 7 && nota <= 8) {
//            resultado = "Bom";
//        } else {
//            resultado = "Excelente";
//        }
//        System.out.println("Resultado: " + resultado);
//        System.out.println("Nota: " + nota);
        double valorCompra = 270;
        double desconto;
        double valorFinal;
        if (valorCompra <= 100) {
            desconto = 0;
            valorFinal = valorCompra - desconto;
        } else if (valorCompra <= 200) {
            desconto = valorCompra * (10.0 / 100);
            valorFinal = valorCompra - desconto;
        }   else {
            desconto = valorCompra * (20.0 / 100);
            valorFinal = valorCompra - desconto;
        }


        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Desconto: " + desconto);
        System.out.println("Valor final: " + valorFinal);

    }
}