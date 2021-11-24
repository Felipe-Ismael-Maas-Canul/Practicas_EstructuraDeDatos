package FelipeMaas.Practica_9;

import java.util.Scanner;

public class BinariaMain {
    public static void main (String args[]){

        Scanner S = new Scanner(System.in);
        int numero;

        System.out.println("Ingresa el numero a buscar");
        numero = S.nextInt();

        //llenar arreglo
        int [] Dato = new int [10];
        for (int i = 0; i < Dato.length; i++)
        Dato [i] = i*i;

        //Mostrar arreglo
        for (int i = 0; i <Dato.length; i++)
        System.out.println ( "Dato ["+i+"]:" + Dato[i]);

        int resultado = Busqueda.buscar(Dato, numero);
    
     if (resultado != -1) {
         System.out.println ( "Encontrado en: "+  resultado);
     } else {
         System.out.println ( "El dato no se encuentra en el arreglo, o el arreglo no esta ordenado."  );
     }
    }
}