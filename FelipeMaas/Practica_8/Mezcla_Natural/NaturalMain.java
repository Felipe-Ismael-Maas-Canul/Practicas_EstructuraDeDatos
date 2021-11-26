package FelipeMaas.Practica_8.Mezcla_Natural;

public class NaturalMain {
    public static void main(String[] args) {

        Mezcla_Natural ordenar = new Mezcla_Natural();
        int arreglo[] = {5,26,12,6,1,4,7,9};

        System.out.println("Arreglo original:");
        ordenar.mostrarArreglo(arreglo);

        System.out.println();

        System.out.println("Arreglo ordenado:");
        arreglo = ordenar.mezclaDirecta(arreglo);
        ordenar.mostrarArreglo(arreglo);
    }
}