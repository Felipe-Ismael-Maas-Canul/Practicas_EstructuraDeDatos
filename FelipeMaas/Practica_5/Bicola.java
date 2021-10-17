package FelipeMaas.Practica_5;

public class Bicola {
    Bicola_Nodo BC, fin;
    int el;

    public Bicola(){
        BC = fin = null;
        el = 0;
    }

    public boolean BicolaVacia(){
        return BC == null;
    }

    public void MostrarBicola(){
        Bicola_Nodo ver = BC;

        if(BicolaVacia()){
            System.out.println("La bicola esta vacia");
        }
        else {
            while(ver != null){
                System.out.print(ver.dato + ", ");
                ver = ver.Next;
            }
        }
    }

    public int BCBicola(){
        return el;
    }

    public void InsertarDerecha(int elemento){
        Bicola_Nodo nuevo = new Bicola_Nodo(elemento);
        if (BicolaVacia())
           fin = nuevo;
        else
           fin.Next=nuevo;

        fin=nuevo;
        el++;
    }

    public void InsertarIzquierda(int elemento){

        fin = new Bicola_Nodo (elemento, fin);

        if (fin == null){
            fin = BC;
        }
        el++;
    }

    public int EliminarDerecha(){

        Bicola_Nodo EliminarDerecha = null;
        int aux = fin.dato;

        if (BC == fin){
            BC = null;
            fin = null;
        }
        else {
            Bicola_Nodo actual = fin;
            while (actual.Next != fin) {
                actual = actual.Next;
            }
            EliminarDerecha = actual.Next;
            actual.Next = null;
            fin = actual;
            el--;
        }
        return aux;
    }
    
    public int EliminarIzquierda(){
        int aux=BC.dato;
        BC = BC.Next;
        el--;
        return aux;
    }
}