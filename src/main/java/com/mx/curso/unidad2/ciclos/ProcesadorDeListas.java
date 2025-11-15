package com.mx.curso.unidad2.ciclos;

public class ProcesadorDeListas {

    public static void main(String[] args) {

        String[] frutas = {"manzana", "durazno", "banana", "fresas", "uva"};


        for(int i=0; i<frutas.length; i++){
            System.out.println("nombre de la fruta: "+frutas[i]);
        }


        //buscar un elemento espccifico utilizando while
        int indice = 0;

        while (indice <frutas.length){
            if(frutas[indice].equals("uva")){
                System.out.println("fruta encontrada "+frutas[indice]);
                break;
            }

            indice++;
        }
    }

}
