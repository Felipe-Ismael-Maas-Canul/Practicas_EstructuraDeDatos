package FelipeMaas.Bicolas;

//Se crea la clase asi como se declara el tipo de dato
public class Bicola_Nodo {
    int dato;

    //Se crea el nodo
    Bicola_Nodo Next;

    public Bicola_Nodo(int d){
        dato = d;
        Next = null;
    }
    
    public Bicola_Nodo (int d, Bicola_Nodo n){

            dato = d;
            Next = n;

    }
}