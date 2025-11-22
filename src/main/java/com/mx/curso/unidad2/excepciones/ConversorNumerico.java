package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class ConversorNumerico {
    public static void main(String[] args) {
        String text = "";

        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("ingresa un texto");
            text = scanner.nextLine();

            int numero = Integer.parseInt(text);
            System.out.println("numero "+numero);
        }catch (NumberFormatException e){
            System.out.println("el formto no corresponde a un numero entero valido"+e.getMessage());
        }
    }
}
