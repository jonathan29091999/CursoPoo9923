package com.mx.curso.tareas.noviembre_25_25;



// Clase base
class Animal {
    protected String sonido;

    public void hacerSonido() {
        System.out.println(sonido);
    }

    public static void main(String[] args) {

        Animal perro = new Perro();
        Animal gato = new Gato();

        perro.hacerSonido();  // Imprime: Guau
        gato.hacerSonido();   // Imprime: Miau
    }
}





