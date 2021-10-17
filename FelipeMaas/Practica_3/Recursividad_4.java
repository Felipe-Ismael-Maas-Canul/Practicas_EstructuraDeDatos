package FelipeMaas.Practica_3;

//Practica 3 Recursividad - Ejercicio 4
//Recursividad indirecta
public class Recursividad_4 {
    
    //Metodo para imprimir las letras del abecedario
    //En este programa se muestra un metodo de pila
    //En la cual se introduce primero la Z, que es la ultima en salir 
    public static void main(String [] args){
        metodoA('Z');
    }
    //En esta parte del programa, muestra imprimir
    //De la misma manera que si fueran numeros
    //Inicia con A, y pide un resultado mayor que este
    //a lo cual como resultado seria B y asi
    //Susesibamente hasta llega r a Z que es donde inicie
    static void metodoA(char c){
        if(c > 'A')
        metodoB(c);
        System.out.println( "" + c);
    }
    //En esta parte de programa, es para restar el valor ya usado
    //En este caso, cuando ya tenga el resultado de B, ya no puedo reutilizarlo
    //Por lo cual usaria C
    static void metodoB(char c){
        metodoA(--c);
    }
}