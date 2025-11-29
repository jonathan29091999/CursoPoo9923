package com.mx.curso.unidad2.ciclos;

import java.util.Scanner;

public class TrazabilidadPedido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String estado = "";

        // Ciclo while: continúa hasta que el estado sea "Entregado"
        while (!estado.equalsIgnoreCase("Entregado")) {

            System.out.print("Ingresa el estado actual del pedido: ");
            estado = sc.nextLine();

            // switch para evaluar el estado
            switch (estado) {

                case "En camino":
                    System.out.println("El pedido sigue en camino. Continuando...");
                    continue; // salta a la siguiente iteración

                case "Error en envío":
                    System.out.println("¡Error crítico! Deteniendo el proceso.");
                    break; // rompe el switch... pero necesitamos romper el while
                default:
                    // Usamos if anidado para la condición de error y corte del while
                    if (estado.equals("Error en envío")) {
                        break;
                    } else if (estado.equalsIgnoreCase("Procesando")) {
                        System.out.println("El pedido aún está siendo procesado...");
                    } else if (estado.equalsIgnoreCase("Entregado")) {
                        System.out.println("El pedido ha sido entregado exitosamente.");
                    } else {
                        System.out.println("Estado no reconocido. Continuando monitoreo...");
                    }
            }

            // Si el estado es "Error en envío", romper el ciclo principal
            if (estado.equals("Error en envío")) {
                break;
            }
        }

        sc.close();
    }
}
