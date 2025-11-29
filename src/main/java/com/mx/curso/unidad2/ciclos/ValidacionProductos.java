package com.mx.curso.unidad2.ciclos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidacionProductos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Solicitar datos al usuario
            System.out.print("Ingresa el nombre del producto: ");
            String nombre = sc.nextLine();

            System.out.print("Ingresa la cantidad en stock: ");
            int cantidad = sc.nextInt();

            System.out.print("Ingresa el precio unitario: ");
            double precio = sc.nextDouble();

            // Validaciones con if-else anidados
            if (cantidad > 0) {
                if (precio > 0) {
                    System.out.println("Datos válidos. Producto registrado correctamente:");
                    System.out.println("Producto: " + nombre);
                    System.out.println("Cantidad: " + cantidad);
                    System.out.println("Precio unitario: " + precio);
                } else {
                    System.out.println("Error: El precio debe ser un número positivo.");
                }
            } else {
                System.out.println("Error: La cantidad debe ser mayor a 0.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar números válidos para cantidad y precio.");
        }

        sc.close();
    }
}
