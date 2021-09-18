package FelipeMaas;

//En esta parte del programa, lo primero es importar los datos
//Del codigo anterior
import java.util.Scanner;
//Incorporamos el Scanner

public class TDACilindroMain {

    public static void main(String[] args) {
        
        //Y aqui declaramos el Scanner
        Scanner entrada = new Scanner (System.in);
        int rad, alt;
     
        //En este apartado lo que buscamos es que al copilar el codigo
        //Pueda escribir el valor que me pide (radio, altura)
        System.out.println("Radio ");
        rad = entrada.nextInt();
        System.out.println("Altura ");
        alt = entrada.nextInt();

        //Usamos nuevamente un Scanner 
        TDACilindro figCil = new TDACilindro (rad,alt);

        //Ahora usamos el print para poder imprimir los resultados 
        System.out.println("Radio:" + figCil.getRadio());
        System.out.println("Altura:" + figCil.getAtura());
        System.out.printf("Area layteral: %.2f \n", figCil.getAreaLateral());
        System.out.printf("Area base: %.2f \n", figCil.getAreaBase());
        System.out.printf("Area total del cilindro: %.2f metros cuadradod\n", figCil.getAreaTotal());
        System.out.printf("volumen: %.0f Centimetros Cubicos\n", figCil.getVolumen());
    }
}