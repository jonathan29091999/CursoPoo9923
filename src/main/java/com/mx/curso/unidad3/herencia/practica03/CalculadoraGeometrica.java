package com.mx.curso.unidad3.herencia.practica03;

public class CalculadoraGeometrica {

    private String nombreFigura;
    public  static double PI= 3.14159;

    public CalculadoraGeometrica(){
        this.nombreFigura = "desconocida";
    }


    public CalculadoraGeometrica(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }


    public double calcularArea(double radio){
        return PI*radio*radio;
    }

    public double calcularArea(double ancho, double alto){
        return ancho*alto;
    }

    public double calcularArea(double base, int altura){
        return (base*altura)/2;
    }

    public static void main(String[] args) {
        CalculadoraGeometrica calc1 = new CalculadoraGeometrica("principal");
        System.out.println("Area del Circulo: "+calc1.calcularArea(5));
        System.out.println("Area del Rectangulo "+calc1.calcularArea(4,6));
        System.out.println("Area del triangulo "+calc1.calcularArea(5,7));

        System.out.println("***************************");

        CalculadoraGeometrica calc2 = new CalculadoraGeometrica("Segunda Instancia");
        System.out.println("Area del Circulo: "+calc2.calcularArea(10));
        System.out.println("Area del Rectangulo "+calc2.calcularArea(5,8));
        System.out.println("Area del triangulo "+calc2.calcularArea(3,2));







    }





}
