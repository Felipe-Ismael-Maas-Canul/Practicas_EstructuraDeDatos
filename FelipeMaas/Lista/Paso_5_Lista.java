package FelipeMaas.Lista;

//Se importan dos librerias que son para imprimir el menu
//asi como los datos a ingresar, de igual manera se importa
//la libreria random para la primera lista 
import java.util.Scanner;
import java.util.Random;

public class Paso_5_Lista {
    public static void main(String[] args){
        //se declaran las clases asi como se crea el Scanner
        Scanner entrada = new Scanner(System.in);
        int elemento = 0, Opciones = 0;
        Lista list = new Lista();

        do {

            try {
                //se crea lo que seria nuesto menu
                System.out.println("==========================================\n "
                        + "MENU DE LA LISTA\n " 
                        + "1. Crear lista predeterminada \n "
                        + "2. Mostrar lista \n " 
                        + "3. Eliminar datos que superen el valor \n " 
                        + "4. Insertar al inicio \n "
                        + "5. Insertar al final \n " 
                        + "6. Eliminar dato \n "
                        + "7. Buscar \n "
                        + "8. Salir \n "
                        + "==========================================\n ");
                        System.out.println();
                        
                        
                        Opciones = entrada.nextInt();
                        switch (Opciones){

                    case 1:
                        //en este caso 1, noscrea nuestra lista con numeros random
                        //que es la que estariamos modificando
                        System.out.println(" Lista creada automaticamente ");
                        Random Ram = new Random();
                        for (int i = 0; i < 10; ++i) {

                            int t = Ram.nextInt(100 - 10 + 1) + 10;
                            list.AgregarAlInicio(t);
                        }
                        break;

                    case 2:
                        //en este caso 2, nos permite imprimir la lista
                        //tannto como la predeterminada, como sus modificaciones
                        System.out.println(" Los datos de la lista son: ");
                        list.MostrarLista();
                        System.out.println();
                        break;

                    case 3:
                        //en el caso 3, podemos eliminar, dstos mayores
                        //que el dato ingresado
                        System.out.println(" Ingresar dato a eliminar junto con los mayores: ");
                        elemento = entrada.nextInt();

                        try {
                            list.EliminarDatosMayores(elemento);
                        } catch (Exception e) {
                        }
                        
                        
                        break;

                    case 4:
                        //caso 4, podremos añadir un dato al inicio de la lista
                        System.out.println("Ingresar dato al inicio ");
                        elemento = entrada.nextInt();
                        list.AgregarAlInicio(elemento); 
                        break;

                    case 5:
                        //caso 5, podremos añadir un dato al funal de la lista
                        System.out.println("Ingresar dato al final ");
                        elemento = entrada.nextInt();
                        list.AgregarAlFinal(elemento); 
                        break;

                    case 6:
                        //caso 6, con esta opcion podremos eliminar un dato
                        //en especifico, diferente al anterior
                        //que solo elimina datos mayores
                        System.out.println(" Eliminar dato ");
                        elemento = entrada.nextInt();
                        list.Eliminar(elemento);
                        break;
                         
                    case 7:
                        //caso 7, en este solo nos demuestra si el dato ingresado
                        //esta o no en la lista
                        System.out.println("Buscar dato ");
                        elemento = entrada.nextInt();

                        if (list.Buscar(elemento)){
                            System.out.println("El dato si se encuentra en la lista");
                        }
                        else {
                            System.out.println("El dato no se encuentra en la lista");
                        }
                        break;

                    case 8:
                        //caso 8 para salir del menu de opcciones 
                        System.out.println("Salir");
                        break;  

                    default:
                        break;
                }
            } catch (NumberFormatException n) {
                System.out.println("Error" + n.getMessage());
            }
        } while (Opciones != 8);
    }
}