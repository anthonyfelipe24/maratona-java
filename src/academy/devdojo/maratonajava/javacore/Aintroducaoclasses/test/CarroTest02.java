package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.carro02;

public class CarroTest02 {
    public static void main(String[] args) {
        carro02 carro = new carro02();
        carro.nome = "fiat";
        carro.modelo = "fusca";
        carro.ano = 1998;
        System.out.println("Nome do carro: " + carro.nome + " Modelo do carro: "+carro.modelo+" Ano do carro: "+carro.ano);
    }
}
