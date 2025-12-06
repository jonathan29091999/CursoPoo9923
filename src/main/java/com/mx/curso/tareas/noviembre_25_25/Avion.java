package com.mx.curso.tareas.noviembre_25_25;

// Clase Avion que implementa la interfaz
class Avion implements PuedeVolar {

    @Override
    public void volar() {
        System.out.println("El avión enciende sus motores y despega en la pista.");
    }
}