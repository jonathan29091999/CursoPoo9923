package com.mx.curso.unidad1.herencia;

public class Main {
    public static void main(String[] args) {

        //objeto de tipo persona
        System.out.println("OBJETO DE LA CLASE PERSONA");
        Persona persona = new Persona();
        persona.setNombre("jonathan");

        System.out.println("Nombre: "+persona.getNombre());

        //objeto de la clase car

        System.out.println("\n OBJETO DE TIPO VEHICULO");
        Car car = new Car();
        car.setNumberOfTire(4);
        car.setTypelights("LED");


        System.out.println("El vehiculo tiene "+car.getNumberOfTire()+" llantas");
        System.out.println("El tipo de luces del vehiculo es: "+car.getTypelights());




    }
}
