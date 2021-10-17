package FelipeMaas.Practica_3;

//practica 3 - Recursividad Ejercicio 3
//Programa para calcular el factorial de un numro
public class Recursividad_3 {

    //Metodo para calcular el factorial de 5
    public static void main (String [] args ){
        Recursividad_3 numFac = new Recursividad_3();
        System.out.println( " El factorial de 5 es: " + numFac.calFactorial(5));
    }
    //Netodo recursivo
    //Lo que pasa en esta parte es
    //Inicia con 5, y despues multiplicarse x1,x2,x3,x4,x5
    public int calFactorial (int num){
        if (num<0){
            return 0;
        }
        else{
            //Caso base 
    //En esta parte de programa, es para restar el valor ya usado
    //En este caso, cuando ya haya multiplicado 1, ya no puedo reutilizarlo
    //Por lo cual multiplicaria x2
            if (num == 0)
            return 1;
            else
            return num*calFactorial(num -1);
        }
    }
}