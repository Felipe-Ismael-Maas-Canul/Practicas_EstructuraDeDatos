package FelipeMaas.Practica_5;

public class Bicola_Nodo {

        int dato;
    
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