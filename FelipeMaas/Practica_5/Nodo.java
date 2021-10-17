package FelipeMaas.Practica_5;

public class Nodo {

    public int dato;

    //Puntero de enlace
    public Nodo next;

    //Constructor para insertar al final
    //Este constructor define que accion realiza
    //En este caso al introducir el ultimo dato
    public Nodo (int d ){
        this.dato = d;
        this.next = null;
    }
    //Constructor para insertar el inicio
    //Este constructor define que accion realiza
    //En este caso al introducir el primer dato
    public Nodo (int d, Nodo n){
        dato = d;
        next = n;
    }   
}