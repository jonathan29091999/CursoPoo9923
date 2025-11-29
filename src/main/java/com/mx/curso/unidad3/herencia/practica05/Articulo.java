package com.mx.curso.unidad3.herencia.practica05;

public class Articulo {
    private String codigo;
    private int cantidadStock;
    private double precioUnitario;

    public Articulo(String codigo) {
        this.codigo = codigo;
        this.cantidadStock = 0;
        this.precioUnitario = 1.0;
    }

    public Articulo(String codigo, double precioUnitario, int cantidadStock) {
        this.codigo = codigo;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }


    public void setCantidadStock(int nuevaCantidad) {
        this.cantidadStock = nuevaCantidad;
    }
}
