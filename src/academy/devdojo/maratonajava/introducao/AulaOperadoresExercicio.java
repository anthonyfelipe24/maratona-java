package academy.devdojo.maratonajava.introducao;

public class AulaOperadoresExercicio {
    public static void main(String[] args) {
        int idade = 50;
        int numero = 2;
        int resultadoSoma = idade + numero;
        int resultadoSubtracao = idade - numero;
        int resultadoMultiplicacao = idade * numero;
        double resultadoDivisao = (double) idade / numero;
        int resultadoResto = idade % numero;
        //System.out.println(resultadoSoma);

        int idade1 = 22;
        double altura = 1.75;
        boolean idadeMaior = idade1 >= 18;
        boolean alturaMaior = altura >= 1.70;
        boolean idadeIgual = idade1 == 21;
        boolean alturaDiferente = altura != 1.80;
        //System.out.println("Idade maior ou igual a 18: " + idadeMaior);
        //System.out.println("Altura maior que 1.70: " + alturaMaior);
        //System.out.println("Idade igual a 21: " + idadeIgual);
        //System.out.println("Altura diferente de 1.80: " + alturaDiferente);

        int anos = 30;
        double rendaMensal = 4500;
        boolean temRestricao = false;

        boolean liberadoEmprestimo = anos >= 21 && rendaMensal >=4000 && !temRestricao;
        //System.out.println("Pode liberar empréstimo? "+ liberadoEmprestimo);

        int idade2 = 20;
        double saldoConta = 800;
        boolean estaAcompanhado = true;
        boolean temConviteVip = false;

        boolean podeEntrarVip= idade2 >= 18 || (saldoConta >= 1000 || temConviteVip);
        boolean podeEntrarClube= idade2 >=18 && !estaAcompanhado;
        //System.out.println("Liberado para entrar? " +podeEntrarVip);
        //System.out.println("Está acompanhado? " +podeEntrarClube);

        int idade3 = 28;
        double notaProva = 7.5;
        boolean temCursoSuperior = true;
        boolean possuiAntecedentes = false;

        boolean aprovado =  idade3 >=18 && notaProva>=7 && !possuiAntecedentes;
        boolean listaEspera = notaProva >=6 && (temCursoSuperior || !possuiAntecedentes);

        //System.out.println("Será aprovado? "+aprovado);
        //System.out.println("Lista de Espera? "+listaEspera);

        // 1. Declare as variáveis:
        int totalViagens = 10;
        double totalGasto = 5500.0;
        boolean ehDevedor = false;

        // 2. Use a incrementação para adicionar MAIS UMA viagem ao totalViagens
        // (Simule que ele acabou de fazer uma viagem agora)
        // ESCREVA AQUI:
        totalViagens = ++totalViagens;


        // 3. Calcule a média (totalGasto dividido pelo totalViagens atualizado)
        double mediaGasto = totalGasto / totalViagens;

        // 4. Verifique a aprovação do bônus (Atenção ao "NÃO ser devedor"!)
        boolean ganhaBonus = totalViagens > 10 && totalGasto >= 500 && !ehDevedor;

                System.out.println("O cliente ganhou o bônus? " +ganhaBonus);










    }

}
