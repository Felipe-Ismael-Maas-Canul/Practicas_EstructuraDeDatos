package FelipeMaas.Practica_8.mezcla_Directa;

public class mezcla_Directa {

        //Editar que se pueden ingresar los valores por teclado
        //Editar que no se vea igual
    
        int a,b,temporal;
        public mezcla_Directa() {
            this.a=0;
            this.b=0;
            this.temporal=0;
        }
        //metodo burbuja
        //mostrar arreglo
        public void mostrarArreglo(int[]arreglo) {
            int c;
            for(c=0;c<arreglo.length;c++) {
                System.out.print("["+arreglo[c]+"]");
            }
            System.out.println("");
        }
        //metodo por mezcla directa
        public int[] mezclaDirecta(int[]arreglo) {
            int a, b, c;
            if(arreglo.length>1){
                int nElementoIzq= arreglo.length/2;
                int nElementoDer= arreglo.length-nElementoIzq;
                int arregloIzq[]= new int[nElementoIzq];
                int arregloDer[]= new int [nElementoDer];
                for(a=0; a<nElementoIzq; a++) {
                    arregloIzq[a]=arreglo[a];
                }
                for(a=nElementoIzq;a<nElementoIzq+nElementoDer;a++) {
                    arregloDer[a-nElementoIzq]=arreglo[a];
                }
                arregloIzq=mezclaDirecta(arregloIzq);
                arregloDer=mezclaDirecta(arregloDer);
                a=0;
                b=0;
                c=0;

                while(arregloIzq.length!=b&&arregloDer.length!=c) {
                    if(arregloIzq[b]<arregloDer[c]) {
                        arreglo[a]=arregloIzq[b];
                        a++;
                        b++;

                    }else {

                        arreglo[a]=arregloDer[c];
                        a++;
                        c++;
                    }
                }
                
                while(arregloIzq.length != b) {
                    arreglo[a]=arregloIzq[b];
                    a++;
                    b++;
                }
                while(arregloDer.length != c){
                    arreglo[a]=arregloDer[c];
                    a++;
                    c++;
                }
            }
            return arreglo;
        }

        public void mostrarArreglo2(int[]arreglo) {
            int c;
            for(c=0;c<arreglo.length;c++) {
                System.out.print("["+arreglo[arreglo.length-1-c]+"]");
            }
            System.out.println("");
        }
        
        public void mostrarElementRepe(int []arreglo) {
            int aux[]= new int[num_Repetidos(arreglo)];
            int contador2=0;
            for(a=0;a<arreglo.length;a++) {
                for(b=0;b<arreglo.length;b++) {
                    if(a!=b) {
                        if(arreglo[a]==arreglo[b]) {
                            arreglo[a]=0;
                            contador2++;
                            aux[contador2-1]=arreglo[a+1];
                            
                        }
                    }
                }
            }
            mostrarArreglo(aux);
        }
        public int num_Repetidos(int[]arreglo) {
            int contador=0;
            int aux2[]= new int[arreglo.length];
            for(int a=0;a<aux2.length;a++) {
                aux2[a]=arreglo[a];
            }
            for(a=0;a<aux2.length;a++) {
                for(b=0;b<aux2.length;b++) {
                    if(a!=b) {
                        if(aux2[a]==aux2[b]) {
                            aux2[a]=0;
                            contador++;
                        }
                    }
                }
            }
            return contador;
        }
    }