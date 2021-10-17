package FelipeMaas.Practica;
//Practica 2 - Ejercicio 2

public class MemEstTemp{

    //Ya en este programa, imprtan los datos y se ejecutan

    public static void main(String[] args){
        int listadoTemp [] = new int [10];

        MemEstTempMetodos.ingresarTemp(listadoTemp);
        MemEstTempMetodos.verTemp(listadoTemp);
        MemEstTempMetodos.ordenarTemp(listadoTemp);
    }
}