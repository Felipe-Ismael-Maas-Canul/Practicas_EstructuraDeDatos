package FelipeMaas;

import java.util.Scanner;

public class CuboMain {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int bas, alt, an;

        System.out.println("Base ");
        bas = entrada.nextInt();
        System.out.println("Altura ");
        alt = entrada.nextInt();
        System.out.println("Ancho ");
        an = entrada.nextInt();

        Cubo Cu = new Cubo (bas, alt, an);
        System.out.println("Base:" + Cu.getBase());
        System.out.println("-------------------------------");
        System.out.println("altura:" + Cu.getAltura());
        System.out.println("-------------------------------");
        System.out.println("ancho :" + Cu.getAncho());
        System.out.println("-------------------------------"); 
        System.out.println("Volumen del cubo:" + Cu.getVolumen());
        System.out.println("-------------------------------");
        System.out.println("Area :" + Cu.getArea());
        System.out.println("-------------------------------");
        System.out.println("Area total del cubo:" + Cu.getAreaTotal());
    }
}