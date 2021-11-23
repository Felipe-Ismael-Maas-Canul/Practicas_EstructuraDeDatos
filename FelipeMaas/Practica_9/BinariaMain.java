package FelipeMaas.Practica_9;

public class BinariaMain {
    public static void main (String args[]){

        //llenar arreglo
        int [] Dato = new int [10];
        for (int i = 0; i < Dato.length; i++)
        Dato [i] = i*i;

        //Mostrar arreglo
        for (int i = 0; i <Dato.length; i++)
        System.out.println ( "Dato ["+i+"]:" + Dato[i]);

    }
    
}
