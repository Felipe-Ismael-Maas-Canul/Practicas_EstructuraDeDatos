package FelipeMaas.Practica_3;
//Practica 3 - Recursividad Ejercicio 1
public class Recursividad_1 {

    //Se crean los metodos 
    //En este primer metodo se declara que el programa
    //Hara que avance para adelante 10 pasos 
public static void main (String [] args){
    Recursividad_1 objpaso = new Recursividad_1();
    objpaso.moverAdelante(10);
}
//Metodo en el cual al terminar de avanzar los 10 pasos
//Imprime un mensaje de LLegaste
public void moverAdelante(int pasos){
    if (pasos ==0)
    System.out.println(" ¡Llegaste! ");
    else{
        try{
            //En esta parte se quiere declarar
            //Que no puede avanzar mas de 400 pasos 
            Thread.sleep (400);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        //Metodo en la cual me indica que
        //Cada que avanze un pazo este se resta
        System.out.print(" =0 ");
        moverAdelante(pasos -1);
        }
    }
}