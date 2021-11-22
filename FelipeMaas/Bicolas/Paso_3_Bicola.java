package FelipeMaas.Bicolas;

import java.util.Scanner;

public class Paso_3_Bicola {

    public static void main(String[] args){
    Scanner entrada = new Scanner (System.in);
        int elemento = 0, Opciones = 0;

        Bicola bicola = new Bicola();
        do {

            try {
                //se crea un "menu", el cual nos da las opciones a realizar 
                System.out.println("======================================\n"
                        + "MENU DE LA BICOLA \n\n" 
                        + "1. Insertar dato a la derecha\n"
                        + "2. Insertar dato a la izquierda \n" 
                        + "3. Eliminar dato de la derecha \n"
                        + "4. Eliminar dato de la izquierda \n"
                        + "5. Imprimir bicola \n" 
                        + "6. Cuantos datos hay \n"
                        + "7. Salir \n"
                        + "======================================\n");

                Opciones = entrada.nextInt();
                switch (Opciones) {

                    case 1:
                        //caso uno, donde al seleccionar, se ingresa el dato a la derecha
                        System.out.println("Ingresa el nuevo dato: ");
                        elemento = entrada.nextInt();
                        bicola.InsertarDerecha(elemento);
                        break;

                    case 2:
                        //caso dos, donde al seleccionar, se ingresa el dato a la izquierda
                        System.out.println("Ingresa el nuevo dato: ");
                        elemento = entrada.nextInt();
                        bicola.InsertarIzquierda(elemento);
                        break;

                    case 3:
                        //caso tres donde podremos eliminar algun dato a la derecha, asi como nos arroja el dato eliminado
                        if 
                        (!bicola.bicolaVacia()){
                            System.out.println("El dato que se elimmino es: " + bicola.EliminarDerecha());
                        }
                        else {
                            System.out.println("Bicola esta vacia, no se puede eliminar el dato");;
                        }
                        break;
                        
                    case 4:
                        //caso cuatro donde podremos eliminar algun dato a la izquierda, asi como nos arroja el dato eliminado
                        if 
                        (!bicola.bicolaVacia())
                            System.out.println("El que se elimino es : " + bicola.EliminarIzquierda());
                        else
                            System.out.println("Bicola vacia, no se puede eliminar el dato");                       
                        break;

                    case 5:
                        //caso cinco, donde nos dice cuales son los dato que hay en la bicola
                        System.out.println("Los datos de la bicola son: ");
                        bicola.MostrarBicola();
                        System.out.println("");
                        break;

                    case 6:
                        //caso seis, donde nos dice cuantos datos hay en mi bicola
                        System.out.println("Los datos que hay son : " + bicola.tamanioBicola());
                        break;

                    case 7:
                        //caso siete, es solo para salir del menu
                        System.out.println("Salir");
                        break;
                    default:
                        break;
                }
            } 
            catch 
            (NumberFormatException n) {
                System.out.println("Error" + n.getMessage());
            }
        } while (Opciones != 7);
    }
}