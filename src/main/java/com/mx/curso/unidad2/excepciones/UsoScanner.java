package com.mx.curso.unidad2.excepciones;

import java.util.Scanner;

public class UsoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.close();

        try{
            int dato = scanner.nextInt();
        }catch (IllegalStateException e){
            System.out.println("no es posible leer porque el scanner ya esta cerrado "
                    +e.getMessage());
        }
    }



}
