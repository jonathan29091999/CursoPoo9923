package com.mx.curso.tareas.noviembre_25_25;

class Libro {
    // Atributos
    private String titulo;
    private String autor;
    private int paginas;

    // Constructor
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }


    public void mostrarInfo() {
        System.out.println("=== Información del Libro ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        // Crear dos objetos Libro
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);
        Libro libro2 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1216);

        // Invocar mostrarInfo en cada libro
        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}




