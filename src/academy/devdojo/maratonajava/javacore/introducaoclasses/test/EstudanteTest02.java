package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Estudante1;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante1 estudante1 = new Estudante1();
        estudante1.nome = "Doidão";
        estudante1.idade = 24;
        estudante1.sexo = 'M';
        System.out.println(estudante1.nome);
        System.out.println(estudante1.idade);
        System.out.println(estudante1.sexo);
    }
}
