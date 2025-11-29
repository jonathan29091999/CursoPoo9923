package com.mx.curso.unidad3.herencia.practica01;

public class Verificacion {
    public static void main(String[] args) {
        ProductoDigital producto1 = new ProductoDigital
                ("ebook java", 150.20, true);

        ProductoDigital producto2  = new ProductoDigital
                ("audio libro", 210.00, false);


        System.out.println("total de productos creados"
                +ProductoDigital.getContadorProductos());
    }


}
