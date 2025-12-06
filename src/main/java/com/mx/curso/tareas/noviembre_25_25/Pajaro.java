package com.mx.curso.tareas.noviembre_25_25;

// Clase Pajaro que implementa la interfaz
class Pajaro implements PuedeVolar {

    @Override
    public void volar() {
        System.out.println("El pájaro bate sus alas y se eleva en el cielo.");
    }
}