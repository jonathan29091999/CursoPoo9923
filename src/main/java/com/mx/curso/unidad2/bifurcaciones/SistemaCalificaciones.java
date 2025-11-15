package com.mx.curso.unidad2.bifurcaciones;

public class SistemaCalificaciones {

    public static void main(String[] args)
    {

    int notaExamen = 90;



    if(notaExamen<0){
        System.out.println("Nota invalida:");
    }else{
        if(notaExamen>= 60){
            System.out.println("Felicidades aprobaste el curso");
            if(notaExamen >=90){
                System.out.println("Excelente desempeño :)");
            }
        }else{
            System.out.println("Lo sentimos no has aprobado ");
        }
        switch (notaExamen){
            case 90:
                System.out.println("Obtuviste una A");
                break;
            case 80:
                System.out.println("Obtuviste una B");
                break;
            case 70:
                System.out.println("Obtuviste una C");
                break;
            case 60:
                System.out.println("Obtuviste una D");
                break;
            case 50:
                System.out.println("Obtuviste una E");
                break;

        }


    }










    }



}
