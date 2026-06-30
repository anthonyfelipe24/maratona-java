package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2=  new Carro();
        carro1.marca = "Chevrolet";
        carro1.modelo = "Onix";
        carro1.ano = 2023;

        carro2.marca = "JEEP";
        carro2.modelo = "Compass";
        carro2.ano = 2024;

        carro2 = carro1;

        System.out.println("Marca: "+ carro1.marca + " Modelo: "+ carro1.modelo + " Ano: " + carro1.ano);
        System.out.println("Marca: "+ carro2.marca + " Modelo: "+ carro2.modelo + " Ano: " + carro2.ano);

    }
}
