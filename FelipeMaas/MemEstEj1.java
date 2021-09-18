package FelipeMaas;
//Practica 2 - Ejercicio 1

import java.util.Scanner;

public class MemEstEj1 {
    public static void main(String [] args){

        Scanner entrada = new Scanner(System.in);
        int i=0, x=0, num=0;
        int lisNumeros [] = new int [5];

        System.out.println("Introduce los datos ");

        do
        {

            System.out.println("Numero: ");
            num=entrada.nextInt();
            if (num >0){
                lisNumeros[i]=num;
                x++;
            }
            i++;
            if (i==5) break;
        }
        while (num>0);

        System.out.println("Datos almacenados ");
        for (i=0; i<x; i++){
            System.out.println("["+i + "]");
        }
    }   
}