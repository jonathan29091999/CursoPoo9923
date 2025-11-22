package com.mx.curso.unidad2.sentencias;

public class ControlAdicional {
    public static void main(String[] args) {

        for(int i=0; i<10; i++ ){
            if(i ==5){
                break;
            }
            System.out.println("valor de i: "+i);
        }

        for(int j=0; j<10; j++){
            if(j%2 == 0){
                continue;
            }
            System.out.println("valor de j: "+j);
        }


        //buscar un numero dentro de un arreglo
        int arreglo[] = {1,2,3,4,5,6,7};
        int numeroBuscado = 8;


        ControlAdicional ca = new ControlAdicional();
        System.out.println("Resultado de Numero Buscado: "+
                ca.encontrarNumero(arreglo, numeroBuscado));

    }


    public boolean encontrarNumero(int[] arreglo, int numeroBuscado){
        for( int num: arreglo){
            if(num == numeroBuscado){
                return true;
            }
        }

        return false;
    }

}
