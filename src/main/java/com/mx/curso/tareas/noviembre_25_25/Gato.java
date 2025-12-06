package com.mx.curso.tareas.noviembre_25_25;

// Clase derivada Gato
class Gato extends Animal {

    public Gato() {
        this.sonido = "Miau";
    }

    @Override
    public void hacerSonido() {
        System.out.println(sonido);
    }
}