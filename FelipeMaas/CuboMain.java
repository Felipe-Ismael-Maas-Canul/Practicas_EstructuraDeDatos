package FelipeMaas;

//Primero se importa los datos del cubo
import java.util.Scanner;

public class CuboMain {
    
    public static void main(String[] args) {

        //Se crea un Scanner para poder imprimir los datos 
        Scanner entrada = new Scanner (System.in);
        int bas, alt, an;

        //Se crean estos metodos para asignar los datos
        System.out.println("Base ");
        bas = entrada.nextInt();
        System.out.println("Altura ");
        alt = entrada.nextInt();
        System.out.println("Ancho ");
        an = entrada.nextInt();

        //En estos primeros 3 se refleja, los datos asignados anteriormente 
        Cubo Cu = new Cubo (bas, alt, an);
        System.out.println("Base:" + Cu.getBase());
        System.out.println("-------------------------------");
        System.out.println("altura:" + Cu.getAltura());
        System.out.println("-------------------------------");
        System.out.println("ancho :" + Cu.getAncho());

        //Y en estos 3 ultimos, se agarra los datos que se asingnan anteriormente
        //Y posteriormente se refleja el resultado
        System.out.println("-------------------------------"); 
        System.out.println("Volumen del cubo:" + Cu.getVolumen());
        System.out.println("-------------------------------");
        System.out.println("Area :" + Cu.getArea());
        System.out.println("-------------------------------");
        System.out.println("Area total del cubo:" + Cu.getAreaTotal());
    }
}