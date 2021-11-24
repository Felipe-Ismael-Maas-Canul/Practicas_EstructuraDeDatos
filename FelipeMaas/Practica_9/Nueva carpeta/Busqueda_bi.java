package busquedabinaria;

public class Busqueda_bi {
    public static void main (String args[]) {
// Llenar arreglo
 int [] Dato = new int [10];
 for (int i = 0; i < Dato.length ; i++)
     Dato[i] = i*i ;

 // Mostrar arreglo.
 for (int i = 0; i < Dato.length ; i++)
     System.out.println (" Dato ["+i+"]: "+ Dato[i]);
 int resultado = Busqueda.buscar(Dato, 9);
 if (resultado != -1) {
     System.out.println ( "Encontrado en: "+ resultado);
  } else {
    System.out.println ( "El dato no se encuentra en el arreglo, o el arreglo no esta ordenado." );
  }
 } 
}