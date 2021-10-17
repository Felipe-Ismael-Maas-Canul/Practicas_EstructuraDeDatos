package FelipeMaas.Practica;
//Practica 2 - Ejercicio 2

//Se añaden las siguiente librerias para el uso del programa 
import java.util.Arrays;
import javax.swing.JOptionPane;
public class MemEstTempMetodos {

    //Se crea un metodo para agregar temperaturas
    public static void ingresarTemp(int elarreglo[]){
        int x,i=0;
        do{
            x=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la temperatura" + (i+1)));
            //Asi como en este aprtado, se se le da a conocer al programa
            //Que las temperaturas deben ser mayor que 16 y menos que 50
            //De no ser asi este valor no se registra 
            if (x>16 && x<=50){
                //System.out.print(x);
                elarreglo[i]=x;
                i++;
            }
            //Asi como aqui se da a coner que se debe agragar 10 temperaturas
        }while (i<10);
    }

    //Metodo para mostrar las temperaturas
    //Acontinuacion se muestran las temperaturas, sin estar ordenadas 
    public static void verTemp(int elarreglo[]){
        for(int i=0; i<elarreglo.length; i++){
            System.out.println("temperatura " + (i+1 + ":" + elarreglo[i]));
        }
        System.out.println("");
    }
    
    //Metodo para ordenar las temperaturas
    //A continuacion se muestran las temperaturas, ya ordenadas
    //en este caso de menor a mayor 
    public static void ordenarTemp(int elarreglo[]){
        Arrays.sort(elarreglo);
        System.out.println("temperaturas ordenadas /n");
        verTemp(elarreglo);
    }
}