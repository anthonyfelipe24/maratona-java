package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.nome = "Chevrolet";
        carro.modelo = "Onix";
        carro.ano = 2023;
        System.out.println("Marca: "+ carro.nome + " Modelo: "+ carro.modelo + " Ano: " + carro.ano);

        Carro carro2=  new Carro();
        carro2.nome = "JEEP";
        carro2.modelo = "Compass";
        carro2.ano = 2024;
        System.out.println("Marca: "+ carro2.nome + " Modelo: "+ carro2.modelo + " Ano: " + carro2.ano);
    }
}
