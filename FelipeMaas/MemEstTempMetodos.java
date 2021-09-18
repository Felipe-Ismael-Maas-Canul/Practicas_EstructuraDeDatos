package FelipeMaas;
//Practica 2 - Ejercicio 2

import java.util.Arrays;
import javax.swing.JOptionPane;
public class MemEstTempMetodos {

    //Metodo para agregar temperaturas
    public static void ingresarTemp(int elarreglo[]){
        int x,i=0;
        do{
            x=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la temperatura" + (i+1)));
            if (x>16 && x<=50){
                //System.out.print(x);
                elarreglo[i]=x;
                i++;
            }
        }while (i<10);
    }

    //Metodo para mostrar las temperaturas
    public static void verTemp(int elarreglo[]){
        for(int i=0; i<elarreglo.length; i++){
            System.out.println("temperatura " + (i+1 + ":" + elarreglo[i]));
        }
        System.out.println("");
    }
    
    //Metodo para ordenar las temperaturas
    public static void ordenarTemp(int elarreglo[]){
        Arrays.sort(elarreglo);
        System.out.println("temperaturas ordenadas /n");
        verTemp(elarreglo);
    }
}