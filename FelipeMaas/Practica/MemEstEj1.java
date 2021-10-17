package FelipeMaas.Practica;
//Practica 2 - Ejercicio 1

//Se añaden las liblerias necesarias
import java.util.Scanner;

public class MemEstEj1 {
    public static void main(String [] args){

        //Se crean las entradas para poder escribir los numero a ingresar
        Scanner entrada = new Scanner(System.in);
        int i=0, x=0, num=0;
        int lisNumeros [] = new int [5];

        System.out.println("Introduce los datos ");

        do
        {
            //Este seria el metodo para poder escribir el numero
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
        //Y este el metodo para que salga como una lista
        System.out.println("Datos almacenados ");
        for (i=0; i<x; i++){
            System.out.println("["+i + "]");
        }
    }   
}