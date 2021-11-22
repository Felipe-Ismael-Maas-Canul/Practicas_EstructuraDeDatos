package FelipeMaas.Bicolas;

//se crea la clase, asi como se declaran las variables 
public class Bicola {
    Bicola_Nodo adelante, fin;
    int tam;

    //se crea el metodo del nodo
    public Bicola(){
        adelante = fin = null;
        tam = 0;
    }

    public boolean bicolaVacia(){
        return adelante == null;
    }

    //metodo para mostrar el contenido de la bicola
    public void MostrarBicola(){
        Bicola_Nodo mostrar = adelante;

        if
        (bicolaVacia()){
            System.out.println("La bicola esta vacia");
        }
        else {
            while(mostrar != null){
                System.out.print(mostrar.dato + ", ");
                mostrar = mostrar.Next;
            }
        }
    }

    public int tamanioBicola(){
        return tam;
    }

    //metodo para agregar algun dato a la derecha 
    public void InsertarDerecha(int elemento){
        Bicola_Nodo nuevo = new Bicola_Nodo(elemento);
        if
        (bicolaVacia())
        adelante = nuevo;
        else
           fin.Next=nuevo;

        fin=nuevo;
        tam++;
    }

    //metodo para agregar algun dato a la izquierda
    public void InsertarIzquierda(int elemento){
        adelante = new Bicola_Nodo (elemento, adelante);

        if
        (fin == null){
            fin = adelante;
        }
        tam++;
    }

    //metodo para eliminar algun dato de la derecha
    public int EliminarDerecha(){
        Bicola_Nodo eliminarDerecha = null;
        int aux = fin.dato;

        if 
        (adelante == fin){
            adelante = null;
            fin = null;
        }
        else {
            Bicola_Nodo actual = adelante;
            while (actual.Next != fin) {
                actual = actual.Next;
            }
            eliminarDerecha = actual.Next;
            actual.Next = null;
            fin = actual;
            tam--;
        }
        return aux;
    }
    
    //metodo para eliminar algun dato de la izquierda
    public int EliminarIzquierda(){
        int aux=adelante.dato;
        adelante=adelante.Next;
        tam--;
        return aux;
    }
}