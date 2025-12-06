package com.mx.curso.tareas.noviembre_25_25;

class Perro extends Animal {

    public Perro() {
        this.sonido = "Guau";
    }

    @Override
    public void hacerSonido() {
        System.out.println(sonido);
    }
}
