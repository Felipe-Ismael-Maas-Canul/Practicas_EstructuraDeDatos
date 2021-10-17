package FelipeMaas.Practica_4;

public class Lista {

    //Puntero para definir donde esta el inicio y fin
    protected Nodo inicio,fin;
    public Lista (){
        inicio = null;
        fin = null;
    }

    //Metodo para agregar al inicio 
    public void agregarAlinicio(int elemento){

        //Se crea al Nodo
        //Lo cual nos permite
        //Que al introducir un dato se mande al inicio
        inicio = new Nodo(elemento, inicio);
        if (fin == null){
            fin = inicio;
        }
    }

    //Metodo para mostrar los datos
    //Nos permite imprimir el dato en la consola
    public void mostrarLista(){
        Nodo recorrer = inicio;
        System.out.println();
            while(recorrer!= null){
                System.out.print("[" + recorrer.dato + "] ----->");
                recorrer = recorrer.next;
        }
    }

    //Metodo para agregar al final
    //Lo cual nos permite
    //Que al introducir un dato se mande al inicio
    public void agregarAlfin(int elemento){
        if (!listaVacia()){
            fin.next = new Nodo(elemento);
        }
        else
        inicio = fin =new Nodo(elemento);
    }
    //En esta orte nos dice que al ser inicio
    //Se anule ya que pide añadir al final
    public boolean listaVacia(){
        if (inicio == null)
            return true;
        else
            return false;
    }

    //Metodo para eliminar nodo del inico
    //lo cual nos permite que se elimine
    //el sato que se engreso al inicio
    public int eliminarInicio(){
        int elemento = inicio.dato;
        if (inicio == fin){
            inicio = null;
            fin = null;
        }
        else
        inicio = inicio.next;
        return elemento;
    }

    //Elimina un metodo del final
    //lo cual nos permite que se elimine
    //El sato que se engreso al final 
    public int eliminarFin(){
        int elemento = fin.dato;
        if (inicio == fin)
        inicio = fin = null;
        else{
            Nodo tem = inicio;
            while (tem.next!= fin){
                tem = tem.next;
            }
            fin = tem;
            fin.next = null;
        }
        return elemento;
    }
    //Elimina un nodo especifico
    //Este metodo nos permite eliminar
    //Cualquier dato, no solo del inicio o final
    //PUede ser hasta un metodo que este en medio
    public void eliminar (int elemento){
        if (!listaVacia())
        if (inicio == fin && elemento == inicio.dato)
        inicio = fin = null;
        else if (elemento == inicio.dato)
        inicio = inicio.next;
        else{
            Nodo ant, tem;
            ant = inicio;
            tem = inicio.next;
            while(tem!= null && tem.dato!= elemento){
                ant = ant.next;
                tem = tem.next;
            }
            if (tem!= null)
            ant.next = tem.next;
            if(tem == fin)
            fin = ant;
        }
    }
    //Metodo para buscar Elemmento
    //Este metodo nos permite buscar un dato
    //Siempre y cuando este en la lista
    public boolean buscarElemento(int elemento){
        Nodo tem= inicio;
        while(tem!= null && tem.dato!= elemento){
            tem = tem.next;
        }
        return tem!= null;
    }
}