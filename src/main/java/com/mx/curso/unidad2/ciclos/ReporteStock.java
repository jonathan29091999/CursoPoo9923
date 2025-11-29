package com.mx.curso.unidad2.ciclos;

public class ReporteStock {

    public static void main(String[] args) {

        // Arreglo con cantidades de stock de 10 productos
        int[] stock = {60, 45, 5, 0, 12, 80, 9, 1, 50, 0};

        // Recorrer el arreglo con un for
        for (int i = 0; i < stock.length; i++) {
            int cantidad = stock[i];
            String clasificacion;

            // Clasificación usando switch
            switch (cantidad) {
                case 0:
                    clasificacion = "Descontinuado";
                    break;

                case 1: case 2: case 3: case 4: case 5:
                case 6: case 7: case 8: case 9:
                    clasificacion = "Urgente";
                    break;

                // Para valores entre 10 y 50 (incluye 50)
                default:
                    if (cantidad >= 10 && cantidad <= 50) {
                        clasificacion = "Bajo stock";
                    } else if (cantidad > 50) {
                        clasificacion = "En stock";
                    } else {
                        clasificacion = "Cantidad inválida";
                    }
                    break;
            }

            // Imprimir reporte
            System.out.println("Producto " + (i + 1) +
                    " | Cantidad: " + cantidad +
                    " | Clasificación: " + clasificacion);
        }
    }
}
