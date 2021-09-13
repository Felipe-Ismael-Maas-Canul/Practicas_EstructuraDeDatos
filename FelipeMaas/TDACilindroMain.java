package FelipeMaas;

import java.util.Scanner;

public class TDACilindroMain {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        int rad, alt;
     
        System.out.println("Radio ");
        rad = entrada.nextInt();
        System.out.println("Altura ");
        alt = entrada.nextInt();

        TDACilindro figCil = new TDACilindro (rad,alt);
        System.out.println("Radio:" + figCil.getRadio());
        System.out.println("Altura:" + figCil.getAtura());
        System.out.printf("Area layteral: %.2f \n", figCil.getAreaLateral());
        System.out.printf("Area base: %.2f \n", figCil.getAreaBase());
        System.out.printf("Area total del cilindro: %.2f metros cuadradod\n", figCil.getAreaTotal());
        System.out.printf("volumen: %.0f Centimetros Cubicos\n", figCil.getVolumen());
    }
}