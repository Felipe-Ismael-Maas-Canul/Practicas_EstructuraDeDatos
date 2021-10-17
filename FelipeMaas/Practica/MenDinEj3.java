package FelipeMaas.Practica;
//Practica 2 - Ejercicio 3

import java.util.ArrayList;
import javax.swing.JOptionPane;
public class MenDinEj3 {

    public static void main (String [] args){

        ArrayList <String> listado;
        listado = new ArrayList<String>();
        String tempo, resp;
        int n;
        do{
            tempo = JOptionPane .showInputDialog(null, "Escribe una palabra: ");
            listado.add(tempo);
            resp = JOptionPane .showInputDialog(null, "Desea ingresar otra plabara? s/n: ");
            resp = resp.toLowerCase();
        }while (!resp.equals("n"));

        MostrarListado (listado);
        //Mostramos los originales
        n = Integer.parseInt(JOptionPane .showInputDialog(null, "Que elementos vas a modificar: "));
        listado.set (n, "Modificado");

        MostrarListado(listado);
        //Mostramos los modificados
        n = Integer.parseInt(JOptionPane .showInputDialog(null, "Que elementos vas a eliminar: "));
        listado.remove(n);

        MostrarListado(listado);
        //Mostramos los elementos menos el eliminado 
    }

    private static void MostrarListado (ArrayList<String>listado){
        System.out.println("\nELEMENTOS");
        for (int i=0; i<listado.size(); i++){
            System.out.println(listado.get(i));
        }
    }
}