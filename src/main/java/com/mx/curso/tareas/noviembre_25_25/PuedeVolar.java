package com.mx.curso.tareas.noviembre_25_25;

// Interfaz
public  interface   PuedeVolar {
    void volar();


    public static void main(String[] args) {

        // Arreglo de tipo PuedeVolar
        PuedeVolar[] objetosVoladores = new PuedeVolar[2];

        // Agregar Avion y Pajaro
        objetosVoladores[0] = new Avion();
        objetosVoladores[1] = new Pajaro();

        // Recorrer el arreglo y llamar volar()
        for (PuedeVolar pv : objetosVoladores) {
            pv.volar();
        }

        /*
        Salida:
        El avión enciende sus motores y despega en la pista.
        El pájaro bate sus alas y se eleva en el cielo.
        */
    }

}