package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores básicos + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02; // Casting para sair double
        //System.out.println("Valor: "+resultado);

        // %    resto da divisão
        int resto = 21 % 7;
        //System.out.println(resto);

        // Operadores relacionais < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // Operadores logicos && (E - AND) - || (OU - or) ! (NÃO - NOT);
        // && (E - AND)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >=4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3382;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        // || (OU - or)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float ValorPlaystation = 5000F;
        boolean isPlaystatitonCincoCompravel = valorTotalContaCorrente > ValorPlaystation || valorTotalContaPoupanca > ValorPlaystation;

        System.out.println("isPlaystatitonCincoCompravel "+isPlaystatitonCincoCompravel);

        // Operadores de atribuição ( = += -= *= /= %=)
        double bonus = 1800;
        bonus +=1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; //3600
        bonus /= 2; // 1800
        bonus %= 2; // 0.0
        System.out.println(bonus);

        // Pós-incremento → numero++
        // Usa o valor primeiro
        //Depois incrementa
        int numero = 5;
        System.out.println(numero++);
        System.out.println(numero);

        //Pré-incremento →  ++numero
        // Incrementa primeiro
        // Depois usa o valor
        int numero3 = 5;
        System.out.println(++numero3);


        // Pós-decremento  numero--
        int numero1 = 5;

        System.out.println(numero1--); // imprime 5
        System.out.println(numero1);   // agora vale 4

        // Pré-decremento  --numero

        int numero2 = 5;
        System.out.println(--numero2); // imprime 4



    }
}
