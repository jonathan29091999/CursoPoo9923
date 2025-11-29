package com.mx.curso.unidad3.herencia.practica05;

public class RegistroInventario {
    private String nombreEncargado;

    public RegistroInventario(String nombreEncargado) {
        this.nombreEncargado = nombreEncargado;
    }

    public void registrarMovimiento(Articulo articulo, int cantidad){
        System.out.println("se han agregado "+cantidad+" articulos");
        articulo.setCantidadStock(cantidad);

    }

    public void registrarMovimiento(Articulo articulo, int cantidad, String prioridad){
        System.out.println("PRIORIDAD: "+prioridad+" han salido "+cantidad+" articulos del inventario");
        articulo.setCantidadStock(cantidad);
    }

    private void registrarLogistica(String codigoProducto, int movimientos){
        System.out.println("Registrando logistica para el producto con el codigo: "
                +codigoProducto+"Movimientos: "+movimientos);
    }

    public static void main(String[] args) {
        Articulo tornillo = new Articulo("tornillo-123");
        RegistroInventario registroInventario = new RegistroInventario("carlos");

        registroInventario.registrarMovimiento(tornillo, 100);
        System.out.println("disponible:"+tornillo.getCantidadStock());
        registroInventario.registrarMovimiento(tornillo, 10, "Normal");
        System.out.println("disponible: "+tornillo.getCantidadStock());


    }

}
