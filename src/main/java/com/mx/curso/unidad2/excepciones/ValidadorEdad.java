package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class ValidadorEdad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad = 0;



        try{
            System.out.println("ingresa tu edad");
            edad = Integer.parseInt(scanner.nextLine());
            validarEdad(edad);
            System.out.println("Tu edad es: "+edad);
        }catch (IllegalArgumentException e){
            System.out.println("la edad no es valida "+e.getMessage());
        }

    }

    public static void validarEdad(int edad ) throws IllegalArgumentException{
        if(edad<0 || edad>120){
            throw new IllegalArgumentException("edad no valida "+edad);
        }
    }


}
