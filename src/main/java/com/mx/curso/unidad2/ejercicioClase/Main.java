package com.mx.curso.unidad2.ejercicioClase;

public class Main {
    public static void main(String[] args) {
        Mascota mascota = new Mascota();


        System.out.println("OBJETO DE LA CLASE MASCOTA");
        mascota.setNombreMascota("zeus");
        mascota.setTipoMascota("perro");
        mascota.setEdadMascota(3);

        System.out.println("el tipo de mascota es : "+mascota.getTipoMascota());
        System.out.println("El nombre de la mascota es "+mascota.getNombreMascota());
        System.out.println("la mascota tiene "+mascota.getEdadMascota()+" años");





    }
}
