package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class AccesoLista {
    public static void main(String[] args) {
        int lista[] = {1,2,3};
        int dato = 0;

        Scanner scanner = new Scanner(System.in);


        try{
            System.out.println("ingresame una posicion para consultar en la lista");
            dato = scanner.nextInt();
            System.out.println(lista[dato]);

        }catch (IndexOutOfBoundsException e){
            System.out.println("la posicion ingresada no existe en la lista");
        }finally {
            scanner.close();
        }



    }


}
