package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
      int idade = (int) 10000000000L; //Isso é um casting forçar o valor long virar int
      long numeroGrande = (long) 155.23;
      double salarioDouble = 2000.0D; // para especificar que é um double mais usa se quiser. nos de cima também.
      float salarioFloat =(float) 2500.0; //Se chama Casting está forçando a aceitar o valor sendo double
      byte idadeByte = 10;
      Short idadeShort = 10;
      Boolean verdadeiro = true;
      boolean falso = false;
      char caractere = '\u0041';
      String nome = "Goku";

      System.out.println("idade é "+idade+" anos"); // crtl + D duplica linha
      System.out.println(falso);
      System.out.println("char "+caractere);
      System.out.println(numeroGrande);
      System.out.println();  //sout + Tab para escrever System.out.println()
      System.out.println("Oi meu nome é "+nome);
    }
}
