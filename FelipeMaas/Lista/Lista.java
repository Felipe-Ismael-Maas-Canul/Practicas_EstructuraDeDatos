package FelipeMaas.Lista;

//se crea la clase asi como de declaran las variables
public class Lista {

    //se importa y proteje el nodo
    protected Lista_Nodo ini, fin;
    
    public Lista (){
        ini = null;
        fin = null;
    }

    public boolean Vacia(){
        if(ini == fin){
            return true;
        }
        else {
            return false;
        }
    }

    //metodo para agregar un valor al inicio de la lista
    public void AgregarAlInicio(int elemento){
        
        ini = new Lista_Nodo (elemento, ini);

        if (fin == null){
            fin = ini;
        }
    }

    //metodo para mostrar la lista y todo cambio que se haga en el
    public void MostrarLista(){
        Lista_Nodo mostrar = ini;

        while(mostrar != null){
            System.out.print("[" + mostrar.Dato + "] --->");
            mostrar = mostrar.Next;
        }
    }

    //metodo para eliminar valores mayores a un dato especifico
    public void EliminarDatosMayores(int elemento){
        Lista_Nodo mostrar = ini;

        while(mostrar != null){
            
            if (mostrar.Dato > elemento){

                Eliminar(mostrar.Dato);

            }
            mostrar = mostrar.Next;
        }
    }

    //metodo para agregar un dato al final de la lista
    public void AgregarAlFinal(int elemento){
        if (!Vacia()){
            fin.Next = new Lista_Nodo (elemento);
            fin = fin.Next;
        }
        else {
            ini = fin = new Lista_Nodo (elemento);
        }
    }

    //metodo para buscar un dato deseado 
    public boolean Buscar (int elemento){
        Lista_Nodo tem = ini;

        while (tem != null && tem.Dato != elemento){
            tem = tem.Next;
        }
        return tem != null;
    }

    //metodo para borrar un dato en especial8
    public void Eliminar(int elemento)
    {
        if (!Vacia())
            if(ini==fin && elemento == ini.Dato)
                ini = fin = null;
        else if (elemento == ini.Dato)
                ini = ini.Next;
        else
        {
            Lista_Nodo ant, temp;
            ant = ini;
            temp=ini.Next;

            while(temp != null & temp.Dato != elemento)
            {
                ant = ant.Next;
                temp=temp.Next;
            }
            if (temp != null)
                ant.Next=temp.Next;
                if(temp == fin)
                    fin=ant;
        }
    }

}