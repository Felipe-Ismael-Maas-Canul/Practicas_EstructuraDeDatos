package FelipeMaas.Lista;

//Se crea la clase asi como se declara el tipo de dato
public class Lista_Nodo {

    public int Dato;
    //se ceea el nodo
    public Lista_Nodo Next;

    public Lista_Nodo (int d){
        this.Dato = d;

    }

    public Lista_Nodo (int d, Lista_Nodo n){

        Dato = d;
        Next = n;

    }  
}