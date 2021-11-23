package FelipeMaas.Practica_8.Quicksort;

public class QuicksortMain {
    
        public static void main(String[] args) {
            int []arreglo={3,12,9,2,8,6,1,4};
            Quicksort ordenador=new Quicksort();
            ordenador.OrdenarQuicksort(arreglo);
    
            for(int i=0; i<arreglo.length;i++)
            {
                System.out.println(arreglo[i]);  
            }
        }   
    }