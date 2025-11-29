package com.mx.curso.unidad3.herencia.practica01;

public class ProductoDigital {
    private String nombre;
    private double precio;
    private boolean esDescargable;
    private static int contadorProductos = 0;

    public ProductoDigital(String nombre, double precio, boolean esDescargable) {
        this.nombre = nombre;
        this.precio = precio;
        this.esDescargable = esDescargable;
        contadorProductos++;


    }

    public void setPrecio (double nuevoPrecio){
        this.precio = precio;
    }

    public int obtenerTotalProductos(){
        return contadorProductos;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }


    public boolean isEsDescargable() {
        return esDescargable;
    }

    public void setEsDescargable(boolean esDescargable) {
        this.esDescargable = esDescargable;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        ProductoDigital.contadorProductos = contadorProductos;
    }



}
