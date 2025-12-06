package com.mx.curso.tareas.noviembre_25_25;

public class CuentaBancaria {

    // Atributo privado
    private double saldo;

    // Constructor con saldo inicial
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }


    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Cantidad: $" + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor que 0.");
        }
    }


    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor que 0.");
        } else if (cantidad > saldo) {
            System.out.println("Fondos insuficientes. Retiro cancelado.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Cantidad: $" + cantidad);
        }
    }


    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.retirar(2000); // Fondos insuficientes

        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }


}
