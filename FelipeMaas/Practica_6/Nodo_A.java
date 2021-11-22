package FelipeMaas.Practica_6;

public class Nodo_A {

    int dato;
    String Nombre;
    Nodo_A RDerecha, RIzquierda;
        
        public Nodo_A ( int dt, String Nom){
            this.dato = dt;
            this.Nombre = Nom;
            this.RDerecha = null;
            this.RIzquierda = null;
        }
        public String toString(){
            return dato + "----->" + Nombre;
        }
}